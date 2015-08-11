/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlsystem.dao;

/**
 *
 * @author Marcin
 */
public interface UserInterfaceConfigurationDAO {
    String getIPaddress ();
    String getDatabaseName();
    String getUserName();
    UserType getUserType();   
    
    void setIPaddress (String ipAddress);
    void setDatabaseName(String dabaseName);
    void setUserName(String userName);
    void setUserType(UserType userType);  
    
    void setUserType(String userType); 
}
