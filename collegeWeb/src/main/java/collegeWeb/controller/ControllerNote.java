package collegeWeb.controller;

import java.util.ArrayList;
import java.util.List;

import org.collegeServeur.entities.College;
import org.collegeServeur.entities.Departement;
import org.collegeServeur.entities.Enseignant;
import org.collegeServeur.entities.Etudiant;
import org.collegeServeur.entities.Matiere;
import org.collegeServeur.entities.Noter;
import org.collegeServeur.service.IServiceEnseignant;
import org.collegeServeur.service.IServiceEtudiant;
import org.collegeServeur.service.IServiceMatiere;
import org.collegeServeur.service.IServiceNoter;
import org.collegeServeur.service.ServiceEnseignant;
import org.collegeServeur.service.ServiceNoter;
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
	@Autowired
	IServiceEnseignant serviceEns;
	
	@RequestMapping("/user/accueil")
	public String AccueilUser() {
		return "AccueilUser";
		
	}
	
	@RequestMapping("/user/GestionNote")
	public ModelAndView gestNote() {
		int edit=0;
		ModelAndView view = new ModelAndView("GestionNote","noter",new Noter());
		List<Noter> notes = serviceNoter.display();
		view.addObject("notes",notes);
		List<Matiere> matieres = serviceMatiere.display();
		view.addObject("matieres",matieres);
		List<Etudiant> etudiants = serviceEtudiant.display();
		view.addObject("etudiants",etudiants);
		view.addObject("edit",edit);
		return view;
	}
	
	@RequestMapping("/user/addNote")
	public ModelAndView addNote(@ModelAttribute("noter")Noter noter) {
		
//		Noter n = new Noter();
//		Matiere m = serviceMatiere.getById(noter.getMatiere().getIdMatiere());
//		
//		Etudiant etu = serviceEtudiant.GetById(noter.getEtudiant().getIdPersonne());
//	
//		n.setEtudiant(etu);
//		n.setMatiere(m);
//		n.setNote(noter.getNote());
		serviceNoter.create(noter);
		System.out.println(noter);
		ModelAndView view = new ModelAndView("GestionNote","noter",new Noter());
		List<Noter> notes = serviceNoter.display();
		view.addObject("notes",notes);
		List<Matiere> matieres = serviceMatiere.display();
		view.addObject("matieres",matieres);
		List<Etudiant> etudiants = serviceEtudiant.display();
		view.addObject("etudiants",etudiants);
		view.addObject("edit",0);
		return view;
	}
	
	@RequestMapping("/user/editNote")
	public ModelAndView modifier(@RequestParam int id,@RequestParam int idp) {
		ModelAndView view = new ModelAndView("GestionNote");
		Noter n=serviceNoter.getNote(id, idp);
		view.addObject("noter",n);

		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		etudiants = serviceEtudiant.display();
		
		List<Matiere> matieres = new ArrayList<Matiere>();
		matieres = serviceMatiere.display();

		view.addObject("listeEtud", etudiants);
		view.addObject("listeMat", matieres);
		
		List<Noter> notes = serviceNoter.display();
		view.addObject("notes",notes);
		
		return view;
	}
	
	@RequestMapping("/user/suppNote")
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
