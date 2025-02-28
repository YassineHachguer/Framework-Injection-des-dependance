package com.example.application.presentation;

import com.example.application.metier.IMetier;
import com.example.framework.ApplicationContext;

public class MainConstructorInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext("config-constructor.xml");

        IMetier metier = (IMetier) context.getBean("metierConstructor");
        System.out.println(metier.calcul());
    }
}
