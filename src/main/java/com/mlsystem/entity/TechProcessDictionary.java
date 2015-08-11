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
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Marcin
 */
@Entity
/*@Table(name = "stock", catalog = "mkyongdb", uniqueConstraints = {
		@UniqueConstraint(columnNames = "STOCK_NAME"),
		@UniqueConstraint(columnNames = "STOCK_CODE") })*/
public  class TechProcessDictionary  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    
    @Column(/*nullable = false*/)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "techProcessDictionary") //@OneToMany(cascade=ALL, mappedBy="Customer")
    private Set<TechProcessDictionary> techProcessDictionary = new HashSet<>(0);


    @Column(name = "process_name", unique = true, nullable = false)
    private String processName;
    
    public TechProcessDictionary( String processName) {
        this.processName = processName;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<TechProcessDictionary> getTechProcessDictionary() {
        return techProcessDictionary;
    }

    public void setTechProcessDictionary(Set<TechProcessDictionary> techProcessDictionary) {
        this.techProcessDictionary = techProcessDictionary;
    }
    
}
