package org.collegeServeur;

import org.collegeServeur.entities.College;
import org.collegeServeur.entities.Etudiant;
import org.collegeServeur.entities.Matiere;
import org.collegeServeur.entities.Noter;
import org.collegeServeur.service.IServiceCollege;
import org.collegeServeur.service.IServiceEtudiant;
import org.collegeServeur.service.IServiceMatiere;
import org.collegeServeur.service.IServiceNoter;
import org.collegeServeur.service.ServiceCollege;
import org.collegeServeur.service.ServiceEtudiant;
import org.collegeServeur.service.ServiceNoter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
//Coucou kéké	
	//test
    public static void main( String[] args )
    {
//        ServiceEtudiant serviceE= new ServiceEtudiant();
//        Etudiant etu = new Etudiant("kevin", "bouron", "@", 06, 2019);
//        serviceE.create(etu);
<<<<<<< HEAD
    	
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
=======
//    	
//    	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
>>>>>>> branch 'master' of https://github.com/kevinBouron/College.git
//    	IServiceCollege serviceC=(IServiceCollege) ctx.getBean("serviceCollege");
//
//    	College c = new College("@", null);
//    	serviceC.create(c);
//    	
//  
//    	

   	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");



//    	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
//
//

<<<<<<< HEAD
      	IServiceNoter serviceN = (IServiceNoter) ctx.getBean("serviceNoter");
      	IServiceMatiere serviceM = (IServiceMatiere) ctx.getBean("serviceMatiere");
=======
//      	IServiceNoter serviceN = (IServiceNoter) ctx.getBean("serviceNoter");
//      	IServiceMatiere serviceM = (IServiceMatiere) ctx.getBean("serviceMatiere");

>>>>>>> branch 'master' of https://github.com/kevinBouron/College.git
    	IServiceEtudiant serviceE= (IServiceEtudiant) ctx.getBean("serviceEtudiant");
////    	Etudiant etu = new Etudiant("Bloup","Bobby", null, 0, 0);
<<<<<<< HEAD
    	Noter note= new Noter();
    	
    	Matiere m=serviceM.getById(1);
    	Etudiant e=serviceE.GetById(7);
    	
    	note.setEtudiant(e);
    	note.setMatiere(m);
    	
    	note.setNote(16.0f);
    	
    	serviceN.create(note);
    	
=======

//    	IServiceEtudiant serviceE= (IServiceEtudiant) ctx.getBean("serviceEtudiant");
//    	Etudiant etu = new Etudiant("Bloup","Bobby", null, 0, 0);

//    	Noter note= new Noter();
>>>>>>> branch 'master' of https://github.com/kevinBouron/College.git
//    	Matiere matiere = new Matiere();
//    	
//    	serviceE.create(etu);
//    	
//    	matiere.setNom("physique");
//    	
//    	serviceM.create(matiere);
//    	
//    	Etudiant etu = serviceE.GetById(1);
//    	note.setNote(15);
//    	note.setEtudiant(etu);
//   
//    	matiere = serviceM.getById(2);
//    
//    note.setMatiere(matiere);
//    	
//    	
//    	
//    	serviceN.create(note);

    	
    System.out.println(serviceE.getMatieresSansNote(1));

//    	ServiceEtudiant serviceE= new ServiceEtudiant();
//      Etudiant etu = new Etudiant("kevin", "bouron", "@", 06, 2019);
//      serviceE.create(etu);
//  	
//  	
//  	IServiceCollege serviceC=(IServiceCollege) ctx.getBean("serviceCollege");
//
//  	College c = new College("@", null);
//  	serviceC.create(c);
//  	
//  	ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
//  	IServiceEtudiant serviceE = (IServiceEtudiant) ctx.getBean("serviceEtudiant");
//  	
//  	Etudiant etud1 = new Etudiant("Inglebert", "Simon", "@", 01, 2010);
//  	
//  	serviceE.create(etud1);
//  	
//  	IServiceMatiere serviceM=(IServiceMatiere) ctx.getBean("serviceMatiere");
// 	
//  	Matiere mat = new Matiere("Chimie");
//  	Matiere mat2 = new Matiere("Physique");
//  	
//  	serviceM.create(mat);
//  	serviceM.create(mat2);
//  	
//  	
//  	IServiceNoter serviceC=(IServiceNoter) ctx.getBean("serviceNoter");
//  	
//  	Noter not1 = new Noter(11f, mat, etud1);
//  	Noter not2 = new Noter(12f, mat, etud1);
//  	Noter not3 = new Noter(13f, mat, etud1);
//  	Noter not4 = new Noter(14f, mat, etud1);
//  	
//  	serviceC.create(not1);
//  	serviceC.create(not2);
//  	serviceC.create(not3);
//  	serviceC.create(not4);
//  	
//  	IServiceDepartement serviceD = (IServiceDepartement) ctx.getBean("serviceDepartement");
//  	
//  	//System.out.println(serviceC.getMoyenneParMatiere(1));
//  	System.out.println(serviceD.getMoyenneParDepartement(1));    	

    }
}
