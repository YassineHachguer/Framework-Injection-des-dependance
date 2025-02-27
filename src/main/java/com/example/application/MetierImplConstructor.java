package com.example.application;

import com.example.framework.Component;
import com.example.framework.Inject;

@Component
public class MetierImplConstructor implements IMetier {
    private IDao dao;

    @Inject
    public MetierImplConstructor(IDao dao) {
        this.dao = dao;
        System.out.println("Injection via le Constructeur");
    }

    @Override
    public String calcul() {
        return dao.getData();
    }
}