/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlsystem.dao;

import com.mlsystem.entity.Person;
import com.mlsystem.entity.TechProcess;
import com.mlsystem.entity.Technology;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marcin
 */
@Service
public class TechnologyDAOImpl implements TechnologyDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public Technology getTechnologyByName(String techName) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Technology where technologyName = :techName");
        query.setParameter("techName", techName);
        Criteria crt;
        crt = sessionFactory.getCurrentSession().createCriteria(Technology.class)
                .add(Restrictions.eq("technologyName", techName));
        List<Technology> techTmp = crt.list();
        if (techTmp == null){
            techTmp = new ArrayList<Technology>();
        }
        return techTmp.get(0);
    }

    @Override
    public List<TechProcess> getTechProcessesByTechName(String techName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean inserNewTechnology(Technology techNew) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Technology> getAllTechnologiesActive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
