package com.mlsystem.form;

import com.mlsystem.dao.ReadXMLFileDAO;
import com.mlsystem.dao.ReadXMLFileDAOImpl;
import com.mlsystem.entity.Company;
import java.util.List;
import org.apache.commons.dbcp.BasicDataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mlsystem.entity.Person;
import com.mlsystem.service.UserManager;
import java.io.FileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

public class Main 
{
    @Autowired
    private static final ConnectingDialog connectingDialogForm = new ConnectingDialog();

    private static  ApplicationContext ctx;
    
    public static ApplicationContext getCTX(){
        return Main.ctx;
    }
    
    public static void setCTX(ApplicationContext new_ctx){
        Main.ctx = new_ctx;
    }
        
    public static void main( String[] args ) throws FileNotFoundException
    {
        connectingDialogForm.setVisible(true);
        ctx = new ClassPathXmlApplicationContext("spring.xml");
        
    	/*
        UserManager userManager = (UserManager) ctx.getBean("userManagerImpl");
    	
       
    	Person user = new Person();
    	user.setUsername("johndoe");
    	user.setName("John Doe");
    	
        
    	Company company = new Company();
        company.setCompanyName("lol1");
        
    	userManager.insertUser(user);
    	
    	System.out.println("User inserted!");
    	
    	user = userManager.getUser("johndoe");
    	
    	System.out.println("\nUser fetched by username!"
    		+ "\nId: " + user.getId()
    		+ "\nUsername: " + user.getUsername()
    		+ "\nName: " + user.getName());
    	
    	user = userManager.getUserById(user.getId());
    	
    	System.out.println("\nUser fetched by ID!"
    		+ "\nId: " + user.getId()
    		+ "\nUsername: " + user.getUsername()
    		+ "\nName: " + user.getName());
    	
    	List<Person> users = userManager.getUsers();
    	
    	System.out.println("\nUser list fetched!"
        	+ "\nUser count: " + users.size());
        */
        
        ((Login_form) ctx.getBean("Login_form")).setVisible(true);
        connectingDialogForm.dispose();

    }


}
