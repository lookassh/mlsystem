/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlsystem.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Marcin
 */
@Entity
/*@Table(name = "Technology", catalog = "technologia"/*, 
        uniqueConstraints = @UniqueConstraint(columnNames = "company_name"))*/
public class Technology implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(nullable = false,  unique = true, length = 255)
    private String technologyName;

    @Column(nullable = false)
    private boolean technologyActive;

    @Column(nullable = false)
    private String techDescription;

    
    //@Column(nullable = true)
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", referencedColumnName="id", nullable = false)
    private Person contactPerson;   */
    
    
    @Column(/*nullable = false*/)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "technology") //@OneToMany(cascade=ALL, mappedBy="Customer")
    private Set<TechProcess> techProcesses = new HashSet<TechProcess>(0);

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public boolean isTechnologyActive() {
        return technologyActive;
    }

    public void setTechnologyActive(boolean technologyActive) {
        this.technologyActive = technologyActive;
    }

    public String getTechDescription() {
        return techDescription;
    }

    public void setTechDescription(String techDescription) {
        this.techDescription = techDescription;
    }

    public Set<TechProcess> getTechProcesses() {
        return techProcesses;
    }

    public void setTechProcesses(Set<TechProcess> techProcesses) {
        this.techProcesses = techProcesses;
    }

    
}
