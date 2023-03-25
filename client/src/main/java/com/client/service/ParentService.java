package com.client.service;

import entity.Parent;

import java.util.List;

public interface ParentService {
    void edit(Parent parent);

    Parent getById(Parent parent);

    List<Parent> findAll(Parent parent);
}
