package com.mlsystem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlsystem.entity.Person;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

@Service
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void insertUser(Person user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public Person getUserById(int userId) {
        return (Person) sessionFactory.getCurrentSession().get(Person.class, userId);
    }

    @Override
    public Person getUser(String username) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Person where username = :username");
        query.setParameter("username", username);
        Criteria crt;
        crt = sessionFactory.getCurrentSession().createCriteria(Person.class)
                .add(Restrictions.eq("username", username));
        
        return (Person)crt.list().get(0);
        //return (Person) query.list().get(0);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Person> getUsers() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Person.class);
        return criteria.list();
    }

}
