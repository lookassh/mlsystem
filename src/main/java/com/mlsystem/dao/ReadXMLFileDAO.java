/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlsystem.dao;

import java.io.FileNotFoundException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 *
 * @author Marcin
 */
public interface ReadXMLFileDAO {
   
    public NodeList setFileName(String fileName) throws FileNotFoundException;

    /**
     *
     * @return
     */
    UserInterfaceConfigurationDAO readFileConfiguration(NodeList nodeList);
    
    public Document getDoc();

    public void setDoc(Document doc);

    public DocumentBuilder getdBuilder();

    public void setdBuilder(DocumentBuilder dBuilder);

    public UserInterfaceConfigurationDAO getUicDAOIml();

    public void setUicDAOIml(UserInterfaceConfigurationDAOImpl uicDAOIml) ;

}
