package com.example.framework;

import javax.xml.bind.annotation.XmlAttribute;

public class ConstructorArg {
    private String ref;

    @XmlAttribute(name = "ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}