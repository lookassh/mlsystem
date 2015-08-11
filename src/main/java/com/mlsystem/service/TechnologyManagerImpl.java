/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlsystem.service;

import com.mlsystem.dao.TechnologyDAO;
import com.mlsystem.dao.UserDAO;
import com.mlsystem.entity.TechProcess;
import com.mlsystem.entity.Technology;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Marcin
 */
@Service
public class TechnologyManagerImpl implements TechnologyManager{
    
    @Autowired
    private TechnologyDAO techDAO;
    
    @Override
    @Transactional
    public Technology getTechnologyByName(String techName) {
        return techDAO.getTechnologyByName(techName);
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
