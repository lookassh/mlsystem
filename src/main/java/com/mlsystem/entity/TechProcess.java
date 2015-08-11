/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlsystem.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Marcin
 */
@Entity
/*@Table(name = "stock", catalog = "mkyongdb", uniqueConstraints = {
		@UniqueConstraint(columnNames = "STOCK_NAME"),
		@UniqueConstraint(columnNames = "STOCK_CODE") })*/
public class TechProcess implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "technology_id", referencedColumnName="id", nullable = false)
    private Technology technology;  
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tech_process_dictionary_id", referencedColumnName="id", nullable = false)
    private TechProcessDictionary techProcessDictionary; 

    public TechProcess(Technology technology, TechProcessDictionary techProcessDictionary) {
        this.technology = technology;
        this.techProcessDictionary = techProcessDictionary;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public TechProcessDictionary getTechProcessDictionary() {
        return techProcessDictionary;
    }

    public void setTechProcessDictionary(TechProcessDictionary techProcessDictionary) {
        this.techProcessDictionary = techProcessDictionary;
    }
    
}
