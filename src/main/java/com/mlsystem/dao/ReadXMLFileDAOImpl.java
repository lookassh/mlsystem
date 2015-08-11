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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@Service
//@Component
public class ReadXMLFileDAOImpl implements ReadXMLFileDAO{

  private Document doc ;
  private DocumentBuilder dBuilder;

  //@Autowired
  private UserInterfaceConfigurationDAOImpl uicDAOIml = new UserInterfaceConfigurationDAOImpl();;

    public ReadXMLFileDAOImpl() {
    }
    
  @Override
    public Document getDoc() {
        return doc;
    }

  @Override
    public void setDoc(Document doc) {
        this.doc = doc;
    }

  @Override
    public DocumentBuilder getdBuilder() {
        return dBuilder;
    }

  @Override
    public void setdBuilder(DocumentBuilder dBuilder) {
        this.dBuilder = dBuilder;
    }

  @Override
    public UserInterfaceConfigurationDAO getUicDAOIml() {
        //if (uicDAOIml == null){
           // uicDAOIml //= new UserInterfaceConfigurationDAOImpl();
        //}
        return uicDAOIml;
    }

  @Override
    public void setUicDAOIml(UserInterfaceConfigurationDAOImpl uicDAOIml) {
        this.uicDAOIml = uicDAOIml;
    }

  @Override
 // @Transactional
    public UserInterfaceConfigurationDAO readFileConfiguration(NodeList nodeList) {
        for (int count = 0; count < nodeList.getLength(); count++) {
//System.out.println("\n count: " + count);
            Node tempNode = nodeList.item(count);

            // make sure it's element node.
            if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

                    // get node name and value
                    System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
                    System.out.println("Node Value =" + tempNode.getTextContent());

                if (tempNode.getNodeName().equalsIgnoreCase("connectionIP")){
                    getUicDAOIml().setIPaddress(tempNode.getNodeValue());
                }
                if (tempNode.getNodeName().equalsIgnoreCase("databaseName")){
                    getUicDAOIml().setDatabaseName(tempNode.getNodeValue());
                }
                if (tempNode.getNodeName().equalsIgnoreCase("userType")){
                   // System.out.println("node" + tempNode.getNodeValue());
                    getUicDAOIml().setUserType(tempNode.getTextContent());
                }    
                if (tempNode.getNodeName().equalsIgnoreCase("userName")){
                    getUicDAOIml().setUserName(tempNode.getTextContent());
                    System.out.println("\n usrnmae: " +getUicDAOIml().getUserName());
                }             
                if (tempNode.hasChildNodes()) {
                        // loop again if has child nodes
                        //readFileConfiguration(nodeList);

                }

                    //System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");

            }

        }
        //System.out.println("Node Name =" +uicDAOIml);
        return uicDAOIml;
  }
  
    @Override
    public NodeList setFileName(String fileName) throws FileNotFoundException {
        NodeList nodeList = null;
        try {

            File file = new File(fileName);

            dBuilder = DocumentBuilderFactory.newInstance()
                                 .newDocumentBuilder();
            try{
                setDoc(dBuilder.parse(file)); 
                getDoc().getDocumentElement().normalize();
                nodeList = getDoc().getChildNodes();
            }catch(IOException e){
                System.out.println ("Nie odnaleziono pliku: \"" + fileName + "\" !");
            }
            if (getDoc() == null){
                throw new FileNotFoundException("Nie odnaleziono pliku: \"" + fileName + "\" !");
            } 
            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            //if (doc.hasChildNodes()) {
            //        printNote(doc.getChildNodes());
            //}
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }
    return nodeList;
    }
}

/*
		if (tempNode.hasAttributes()) {

			// get attributes names and values
			NamedNodeMap nodeMap = tempNode.getAttributes();

			for (int i = 0; i < nodeMap.getLength(); i++) {
				Node node = nodeMap.item(i);
				System.out.println("attr name : " + node.getNodeName());
				System.out.println("attr value : " + node.getNodeValue());
			}
		}
*/