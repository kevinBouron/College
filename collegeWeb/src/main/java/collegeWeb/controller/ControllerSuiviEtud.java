package collegeWeb.controller;

import java.util.List;

import org.collegeServeur.entities.Departement;
import org.collegeServeur.entities.Enseignant;
import org.collegeServeur.entities.Etudiant;
import org.collegeServeur.entities.Matiere;
import org.collegeServeur.entities.Noter;
import org.collegeServeur.service.IServiceEtudiant;
import org.collegeServeur.service.IServiceMatiere;
import org.collegeServeur.service.IServiceNoter;
import org.collegeServeur.service.ServiceNoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;import javassist.expr.NewArray;

@Controller
public class ControllerSuiviEtud {
	
	
	@Autowired
	IServiceEtudiant serviceEtu;
	
	@Autowired
	IServiceNoter serviceNot;
	
	@Autowired
	IServiceMatiere serviceMat;
	
	

	@RequestMapping("/user/redirectEtud")
	public ModelAndView infosEtudiant() {
		ModelAndView view = new ModelAndView("SuivitEtud","etudiant",new Etudiant());
		List<Etudiant> etudiants = serviceEtu.display();
		view.addObject("etudiants",etudiants);
		
		return view; 
	}
	
	
	@RequestMapping(value ="/user/moyenneG")
	public ModelAndView moyenneG(@ModelAttribute("etudiant")Etudiant etudiant) {
		double moyenneEtud = serviceEtu.getMoyenneGenerale(etudiant.getIdPersonne());
		
		ModelAndView view = new ModelAndView("SuivitEtud");
		

		view.addObject("moyenneEtud",moyenneEtud);
		List<Etudiant> etudiants = serviceEtu.display();
		view.addObject("etudiants",etudiants);
		
		List<Matiere> mats = serviceEtu.getMatieresSansNote(etudiant.getIdPersonne());
		view.addObject("matiere",mats);
		System.out.println(mats);
		view.addObject("etudiant",new Etudiant());
		return view ;
	}
	
	
	@RequestMapping(value ="/user/")
	public ModelAndView matiereNull(@ModelAttribute("etudiant")Etudiant etudiant) {
		List<Matiere> mats = serviceEtu.getMatieresSansNote(etudiant.getIdPersonne());
		
		ModelAndView view = new ModelAndView("SuivitEtud");
		
		view.addObject("matiere",mats);
		view.addObject("etudiant",new Etudiant());
		return view ;
	}
	
	
	
	
	
	
	
	
}
