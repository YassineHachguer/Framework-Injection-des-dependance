package com.example.application;

import com.example.framework.Component;

@Component
public class DaoImpl implements IDao {
    @Override
    public String getData() {
        return "Injection Réussie avec Succès ";
    }
}