package com.example.application.dao;

import com.example.framework.Component;

@Component
public class DaoImpl implements IDao {
    @Override
    public String getData() {
        return "Injection Réussie avec Succès ";
    }
}