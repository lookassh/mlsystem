/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlsystem.dao;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

/**
 *
 * @author Marcin
 */
@Service
//@Component
public class UserInterfaceConfigurationDAOImpl implements UserInterfaceConfigurationDAO{
    private String ipAddress;
    private String databaseName;
    private UserType userType;
    private String userName;
    

    @Override
    public String getIPaddress() {
        return ipAddress;
    }

    @Override
    public String getDatabaseName() {
        return databaseName;
    }

    @Override
    public UserType getUserType() {
        return userType;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     *
     * @param userType
     */
    @Override
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @param userName
     */
    @Override
    public void setIPaddress(String userName) {
        this.ipAddress = userName;
    }

    @Override
    public void setUserType(String userType) {
        //System.out.println(userType);
        if (Integer.parseInt(userType) == (UserType.Admin.getValue()) ){
            this.userType = UserType.Admin;
        }
        if (Integer.parseInt(userType) == (UserType.Dyrektor.getValue()) ){
            this.userType = UserType.Dyrektor;
        }
        if (Integer.parseInt(userType) == (UserType.Inzynier.getValue()) ){
            this.userType = UserType.Inzynier;
        }
        if (Integer.parseInt(userType) == (UserType.Kosztorysant.getValue()) ){
            this.userType = UserType.Kosztorysant;
        }    
        if (Integer.parseInt(userType) == (UserType.Projektant.getValue()) ){
            this.userType = UserType.Projektant;
        }
        if (Integer.parseInt(userType) == (UserType.Technolog.getValue()) ){
            this.userType = UserType.Technolog;
        }         
    }

    
}
