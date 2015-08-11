/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlsystem.service;

import com.mlsystem.entity.TechProcess;
import com.mlsystem.entity.Technology;
import java.util.List;

/**
 *
 * @author Marcin
 */
public interface TechnologyManager {
    Technology getTechnologyByName(String techName);
    List<TechProcess> getTechProcessesByTechName(String techName);
    boolean inserNewTechnology(Technology techNew);
    List<Technology> getAllTechnologiesActive();
    
}
