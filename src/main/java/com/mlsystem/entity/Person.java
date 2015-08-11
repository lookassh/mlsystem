package com.mlsystem.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.context.annotation.Primary;

@Entity
/*@Table(name = "stock", catalog = "mkyongdb", uniqueConstraints = {
		@UniqueConstraint(columnNames = "STOCK_NAME"),
		@UniqueConstraint(columnNames = "STOCK_CODE") })*/
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
//@Temporal(javax.persistence.TemporalType.DATE)
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contactPerson") //@OneToMany(cascade=ALL, mappedBy="Customer")
    private Set<Company> companies = new HashSet<Company>(0);

    public int getId() {
            return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public String getUsername() {
            return username;
    }

    public void setUsername(String username) {
            this.username = username;
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }
    public Set<Company> getCompanies() { 
        return companies; 
    }
	
}
