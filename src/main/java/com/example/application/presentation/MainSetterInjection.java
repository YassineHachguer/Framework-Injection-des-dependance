package com.example.application.presentation;

import com.example.application.metier.IMetier;
import com.example.framework.ApplicationContext;

public class MainSetterInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext("config-setter.xml");

        IMetier metier = (IMetier) context.getBean("metierSetter");
        System.out.println(metier.calcul());
    }
}