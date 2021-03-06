package com.chloneda.dao;

import com.chloneda.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @Created by chloneda
 * @Description:
 */
@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public User getUserById(String userId) {
        User user = this.getHibernateTemplate().get(User.class,userId);
        return user;
    }

    @Override
    public void save(Object obj) {
        this.getHibernateTemplate().save(obj);
    }

}
