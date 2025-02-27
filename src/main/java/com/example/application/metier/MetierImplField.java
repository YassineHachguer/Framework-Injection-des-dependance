package com.example.application.metier;

import com.example.application.dao.IDao;
import com.example.framework.Component;
import com.example.framework.Inject;

@Component
public class MetierImplField implements IMetier {
    @Inject
    private IDao dao;

    public MetierImplField() {
        System.out.println("Injection via Field");
    }

    @Override
    public String calcul() {
        return dao.getData();
    }
}