package com.example.application.presentation;

import com.example.application.metier.IMetier;
import com.example.framework.ApplicationContext;

public class MainFieldInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext("config-field.xml");

        IMetier metier = (IMetier) context.getBean("metierField");
        System.out.println(metier.calcul());
    }
}