package com.example.framework;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "bean")
public class Bean {
    private String id;
    private String className;

    private ConstructorArg constructorArg;
    private Property property;

    @XmlAttribute(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute(name = "class")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @XmlElement(name = "constructor-arg")
    public ConstructorArg getConstructorArg() {
        return constructorArg;
    }

    public void setConstructorArg(ConstructorArg constructorArg) {
        this.constructorArg = constructorArg;
    }

    @XmlElement(name = "property")
    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}