package com.furao.sshVue.dao;

import com.furao.sshVue.entity.ShelfEntity;
import org.hibernate.Session;

import java.util.List;

public interface ShelfDao {
    int addShelf(ShelfEntity shelfEntity);

    List<ShelfEntity> getShelfAll();

    ShelfEntity getShelfById(Integer id);

    int delShelfById(Integer id);

    Session getSession();
}
