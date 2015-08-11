
import com.mlsystem.dao.ReadXMLFileDAO;
import com.mlsystem.dao.ReadXMLFileDAOImpl;
import com.mlsystem.dao.TechnologyDAO;
import com.mlsystem.dao.TechnologyDAOImpl;
import com.mlsystem.entity.TechProcess;
import com.mlsystem.entity.TechProcessDictionary;
import com.mlsystem.entity.Technology;
import com.mlsystem.service.TechnologyManager;
import com.mlsystem.service.TechnologyManagerImpl;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcin
 */
public class testclasss {
    
    public static void main( String[] args ) throws Exception{
        //ReadXMLFileDAO rdao = new ReadXMLFileDAOImpl();
        //rdao.setFileName("configIP.xml");
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
            
            Technology tech = new Technology();
            tech.setTechDescription("pierwsza");
            tech.setTechnologyActive(true);
            tech.setTechnologyName("testowa-3BB- 1-1");
            
            TechProcessDictionary techProcessDictionary = new TechProcessDictionary("ramkowanie");
            
            List<TechProcess> techproc = new ArrayList<>();
            techproc.add(new TechProcess(tech, techProcessDictionary));

            TechnologyManager tttI = ctx.getBean(TechnologyManager.class);
            tttI.getTechnologyByName("test");

         //rdao.readFileConfiguration(rdao.getDoc().getChildNodes());
        //System.out.println("lol" + rdao.getDoc().getChildNodes());
        throw new Exception("koniec");
    }
    
}
