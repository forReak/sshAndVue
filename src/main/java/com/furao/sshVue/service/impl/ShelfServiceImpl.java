package com.furao.sshVue.service.impl;

import com.furao.sshVue.dao.ShelfDao;
import com.furao.sshVue.entity.ShelfEntity;
import com.furao.sshVue.service.ShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShelfServiceImpl implements ShelfService {
    @Autowired
    ShelfDao shelfDao;

    public int addShelf(ShelfEntity shelfEntity) {
        return 0;
    }

    public List<ShelfEntity> getShelfAll() {
        return null;
    }

    public ShelfEntity getShelfById(Integer id) {
        return shelfDao.getShelfById(id);
    }

    public int delShelfById(Integer id) {
        return 0;
    }
}
