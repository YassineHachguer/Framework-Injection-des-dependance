package com.example.application;

import com.example.framework.Component;
import com.example.framework.Inject;

@Component
public class MetierImplSetter implements IMetier {
    private IDao dao;

    @Inject
    public void setDao(IDao dao) {
        this.dao = dao;
        System.out.println("Injection via le Setter");
    }

    @Override
    public String calcul() {
        return dao.getData();
    }
}