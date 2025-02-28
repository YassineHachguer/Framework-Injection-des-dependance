package com.example.framework;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class ApplicationContext {
    private Map<String, Object> beans = new HashMap<>();

    public ApplicationContext(String configLocation) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Beans.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(configLocation);
            Beans beansConfig = (Beans) unmarshaller.unmarshal(inputStream);

            for (Bean bean : beansConfig.getBeans()) {
                Class<?> clazz = Class.forName(bean.getClassName());
                Object instance;

                if (bean.getConstructorArg() != null) {
                    String ref = bean.getConstructorArg().getRef();
                    Constructor<?> constructor = clazz.getConstructor(beans.get(ref).getClass().getInterfaces()[0]);
                    instance = constructor.newInstance(beans.get(ref));
                } else {
                    instance = clazz.getDeclaredConstructor().newInstance();
                }

                beans.put(bean.getId(), instance);

                if (bean.getProperty() != null) {
                    Field field = clazz.getDeclaredField(bean.getProperty().getName());
                    field.setAccessible(true);
                    field.set(instance, beans.get(bean.getProperty().getRef()));
                }
            }

            for (Object bean : beans.values()) {
                injectDependencies(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void injectDependencies(Object bean) throws IllegalAccessException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(bean, beans.get(field.getName()));
            }
        }

    }


}