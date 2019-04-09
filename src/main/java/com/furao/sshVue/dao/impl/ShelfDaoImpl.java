package com.furao.sshVue.dao.impl;

import com.furao.sshVue.dao.ShelfDao;
import com.furao.sshVue.entity.ShelfEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ShelfDaoImpl implements ShelfDao {

    @Resource
    SessionFactory sessionFactory;

    public int addShelf(ShelfEntity shelfEntity) {
        return 0;
    }

    public List<ShelfEntity> getShelfAll() {
        //hibernate 查询时用的表名是实体类名
        Query fromTShelf = getSession().createQuery("from ShelfEntity");
        List<ShelfEntity> list = fromTShelf.list();
        return list;
    }

    public ShelfEntity getShelfById(Integer id) {
        return  (ShelfEntity) getSession().get(ShelfEntity.class,id);
    }

    public int delShelfById(Integer id) {
        return 0;
    }

    public Session getSession() {
        return this.sessionFactory.openSession();
    }
}
