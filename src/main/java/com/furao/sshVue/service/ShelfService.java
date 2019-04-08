package com.furao.sshVue.service;

import com.furao.sshVue.entity.ShelfEntity;

import java.util.List;

public interface ShelfService {

    int addShelf(ShelfEntity shelfEntity);

    List<ShelfEntity> getShelfAll();

    ShelfEntity getShelfById(Integer id);

    int delShelfById(Integer id);
}
