package collegeWeb.controller;

import java.util.List;

import org.collegeServeur.entities.College;
import org.collegeServeur.entities.Departement;
import org.collegeServeur.entities.Enseignant;
import org.collegeServeur.entities.Etudiant;
import org.collegeServeur.entities.Matiere;
import org.collegeServeur.entities.Noter;
import org.collegeServeur.service.IServiceEtudiant;
import org.collegeServeur.service.IServiceMatiere;
import org.collegeServeur.service.IServiceNoter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerNote {

	
	@Autowired
	IServiceNoter serviceNoter;
	@Autowired
	IServiceEtudiant serviceEtudiant;
	@Autowired
	IServiceMatiere serviceMatiere;
	
	
	@RequestMapping("/user/accueil")
	public String AccueilUser() {
		return "AccueilUser";
		
	}
	
	@RequestMapping("/user/GestionNote")
	public ModelAndView gestNote() {
		ModelAndView view = new ModelAndView("GestionNote","noter",new Noter());
		List<Noter> notes = serviceNoter.display();
		view.addObject("notes",notes);
		List<Matiere> matieres = serviceMatiere.display();
		view.addObject("matieres",matieres);
		List<Etudiant> etudiants = serviceEtudiant.display();
		view.addObject("etudiants",etudiants);
		return view;
	}
	
	@RequestMapping("/user/addNote")
	public ModelAndView addNote(@ModelAttribute("noter")Noter noter) {
		serviceNoter.create(noter);
		System.out.println(noter);
		ModelAndView view = new ModelAndView("GestionNote","noter",new Noter());
		List<Noter> notes = serviceNoter.display();
		view.addObject("notes",notes);
		List<Matiere> matieres = serviceMatiere.display();
		view.addObject("matieres",matieres);
		List<Etudiant> etudiants = serviceEtudiant.display();
		view.addObject("etudiants",etudiants);
		return view;
	}
	
	@RequestMapping("/admin/editNote")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view=new ModelAndView("GestionNote");
		Noter noter = serviceNoter.getById(id);
		List<Noter> notes = serviceNoter.display();
		view.addObject("notes",notes);
		List<Matiere> matieres = serviceMatiere.display();
		view.addObject("matieres",matieres);
		List<Etudiant> etudiants = serviceEtudiant.display();
		view.addObject("etudiants",etudiants);
		view.addObject("noter",noter);  
		return view;
	}
	
	@RequestMapping("/admin/suppNote")
	public ModelAndView supprimer(@RequestParam int id){
		
		ModelAndView view=new ModelAndView("GestionNote");
		Noter noter = serviceNoter.getById(id);
		serviceNoter.delete(noter);
		List<Noter> notes = serviceNoter.display();
		view.addObject("notes",notes);
		List<Matiere> matieres = serviceMatiere.display();
		view.addObject("matieres",matieres);
		List<Etudiant> etudiants = serviceEtudiant.display();
		view.addObject("etudiants",etudiants);
		view.addObject("noter",new Noter());  
		 return view;
		
	}
}
