package collegeWeb.controller;

import java.util.List;

import org.collegeServeur.entities.College;
import org.collegeServeur.entities.Departement;
import org.collegeServeur.entities.Enseignant;
import org.collegeServeur.entities.Etudiant;
import org.collegeServeur.entities.Matiere;
import org.collegeServeur.entities.Salle;
import org.collegeServeur.service.IServiceCollege;
import org.collegeServeur.service.IServiceDepartement;
import org.collegeServeur.service.IServiceEnseignant;
import org.collegeServeur.service.IServiceEtudiant;
import org.collegeServeur.service.IServiceMatiere;
import org.collegeServeur.service.IServiceSalle;
import org.collegeServeur.service.ServiceCollege;
import org.collegeServeur.service.ServiceSalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@Autowired
	private IServiceDepartement serviceDep;
	@Autowired
	private IServiceEnseignant serviceEns;
	@Autowired
	private IServiceCollege ServiceCol;
	@Autowired
	private IServiceEtudiant ServiceEtu;
	@Autowired
	private IServiceMatiere ServiceMat;
	@Autowired
	private IServiceSalle ServiceSal;
	
	@RequestMapping(value = "/login")
	public String Authentif() {
		return "Authentification";
	}

	@RequestMapping(value = "/admin/home")
	public String adminHome() {
		return "GestionCollege";
	}
	// ------------------------Departement-----------------------------------
	@RequestMapping(value = "/admin/GestionDepartement")
	public ModelAndView gestDep() {
		ModelAndView view = new ModelAndView("GestionDepartement","departement",new Departement());
		List<College> colleges = ServiceCol.display();
		List<Enseignant> enseignants = serviceEns.display();
		List<Departement> departements=serviceDep.display();
		System.out.println(departements);
		view.addObject("colleges",colleges);
		view.addObject("enseignants",enseignants);
		view.addObject("departements",departements);
		return view ;
	}
	
	@RequestMapping(value = "/admin/adddDepartement")
	public ModelAndView addDep(@ModelAttribute("departement")Departement dep) {
		serviceDep.create(dep);
		ModelAndView view = new ModelAndView("GestionDepartement","departement",new Departement());
		List<College> colleges = ServiceCol.display();
		List<Enseignant> enseignants = serviceEns.display();
		List<Departement> departements=serviceDep.display();
		view.addObject("departements",departements);
		view.addObject("colleges",colleges);
		view.addObject("enseignants",enseignants);
		return view ;
	}
	@RequestMapping("/editDep")
	public ModelAndView modifier(@RequestParam int idDepartement) {
		ModelAndView view=new ModelAndView("GestionDepartement");
		Departement dep = serviceDep.getById(idDepartement);
		List<College> colleges = ServiceCol.display();
		List<Enseignant> enseignants = serviceEns.display();
		List<Departement> departements=serviceDep.display();
		view.addObject("departements",departements);
		view.addObject("colleges",colleges);
		view.addObject("enseignants",enseignants);
		view.addObject("departement",dep);  
		return view;
	}
	
	@RequestMapping("/suppDep")
	public ModelAndView supprimer(@RequestParam int idDepartement){
		
		ModelAndView view=new ModelAndView("GestionDepartement");
		Departement dep = serviceDep.getById(idDepartement);
		System.out.println(dep);
		serviceDep.delete(dep);
		List<College> colleges = ServiceCol.display();
		List<Enseignant> enseignants = serviceEns.display();
		List<Departement> departements=serviceDep.display();
		view.addObject("departements",departements);
		view.addObject("colleges",colleges);
		view.addObject("enseignants",enseignants);
		view.addObject("departement",new Departement());
		 return view;
		
	}
	// ------------------------Enseignant-----------------------------------
	@RequestMapping(value = "/admin/GestionEnseignant")
	public ModelAndView gestEns() {
		ModelAndView view = new ModelAndView("gestionEnseignant","enseignant",new Enseignant());
		List<Departement> departements = serviceDep.display();
		List<Matiere> matieres = ServiceMat.display();
		view.addObject("departements",departements);
		view.addObject("matieres",matieres);
		return view ;
	}
	
	@RequestMapping(value = "/admin/addEnseignant")
	public ModelAndView addEns(@ModelAttribute("enseignant")Enseignant ens) {
		serviceEns.create(ens);
		ModelAndView view = new ModelAndView("gestionEnseignant","enseignant",new Enseignant());
		List<Departement> departements = serviceDep.display();
		List<Matiere> matieres = ServiceMat.display();
		view.addObject("departements",departements);
		view.addObject("matieres",matieres);
		return view ;
	}
	@RequestMapping("/editEns")
	public ModelAndView modifierEns(@RequestParam int idPersonne) {
		ModelAndView view=new ModelAndView("gestionEnseignant");
		Enseignant ens = serviceEns.GetById(idPersonne);
		List<Departement> departements = serviceDep.display();
		List<Matiere> matieres = ServiceMat.display();
		view.addObject("departements",departements);
		view.addObject("matieres",matieres);
		view.addObject("enseignant",ens);  
		return view;
	}
	
	@RequestMapping("/suppEns")
	public ModelAndView supprimerEns(@RequestParam int idPersonne){
		
		ModelAndView view=new ModelAndView("gestionEnseignant");
		Enseignant ens = serviceEns.GetById(idPersonne);
		System.out.println(ens);
		serviceEns.delete(ens);
		List<Departement> departements = serviceDep.display();
		List<Matiere> matieres = ServiceMat.display();
		view.addObject("departements",departements);
		view.addObject("matieres",matieres);
		view.addObject("enseignant",new Enseignant()); 
		 return view;
		
	}
	// ------------------------Etudiant-----------------------------------
	
	@RequestMapping(value = "/admin/GestionEtudiant")
	public ModelAndView gestEtu() {
		ModelAndView view = new ModelAndView("GestionEtudiant","etudiant",new Etudiant());
		List<Etudiant> etudiants = ServiceEtu.display();
		view.addObject("etudiants",etudiants);
		return view ;
	}
	
	@RequestMapping(value = "/admin/addEtudiant")
	public ModelAndView addEtu(@ModelAttribute("etudiant")Etudiant etu) {
		ServiceEtu.create(etu);
		ModelAndView view = new ModelAndView("GestionEtudiant","etudiant",new Etudiant());
		List<Etudiant> etudiants = ServiceEtu.display();
		view.addObject("etudiants",etudiants);
		return view ;
	}
	
	@RequestMapping("/editEtu")
	public ModelAndView modifierEtu(@RequestParam int idPersonne) {
		ModelAndView view=new ModelAndView("GestionEtudiant");
		Etudiant etu = ServiceEtu.GetById(idPersonne);
		List<Etudiant> etudiants = ServiceEtu.display();
		view.addObject("etudiants",etudiants);
		view.addObject("etudiant",etu);  
		return view;
	}
	
	@RequestMapping("/suppEtu")
	public ModelAndView supprimerEtu(@RequestParam int idPersonne){
		
		ModelAndView view=new ModelAndView("GestionEtudiant");
		Etudiant etu = ServiceEtu.GetById(idPersonne);
		System.out.println(etu);
		ServiceEtu.delete(etu);
		List<Etudiant> etudiants = ServiceEtu.display();
		view.addObject("etudiants",etudiants);
		view.addObject("etudiant",new Etudiant()); 
		 return view;
		
	}
	// ------------------------Salle-----------------------------------
	@RequestMapping(value = "/admin/GestionSalles")
	public ModelAndView gestSalle() {
		ModelAndView view = new ModelAndView("gestionSalle","salle",new Salle());
		List<Salle> salles = ServiceSal.display();
		view.addObject("salles",salles);
		return view ;
	}
	
	@RequestMapping(value = "/admin/addSalles")
	public ModelAndView addSalle(@ModelAttribute("salle")Salle salle) {
		ServiceSal.create(salle);
		ModelAndView view = new ModelAndView("gestionSalle","salle",new Salle());
		List<Salle> salles = ServiceSal.display();
		view.addObject("salles",salles);
		return view ;
	}
	
	@RequestMapping("/editSalle")
	public ModelAndView modifierSalle(@RequestParam int idSalle) {
		ModelAndView view=new ModelAndView("gestionEnseignant");
		Salle salle= ServiceSal.getById(idSalle);
		List<Salle> salles = ServiceSal.display();
		view.addObject("salles",salles);
		view.addObject("salle",salle);  
		return view;
	}
	
	@RequestMapping("/suppSalle")
	public ModelAndView supprimerSalle(@RequestParam int idSalle){
		
		ModelAndView view=new ModelAndView("gestionEnseignant");
		Salle salle= ServiceSal.getById(idSalle);
		System.out.println(salle);
		ServiceSal.delete(salle);
		List<Salle> salles = ServiceSal.display();
		view.addObject("salles",salles);
		view.addObject("salle",new Salle()); 
		 return view;
		
	}
	
	
	// ------------------------Matiere-----------------------------------
	@RequestMapping(value = "/admin/GestionMatiere")
	public ModelAndView gestMat() {
		ModelAndView view = new ModelAndView("GestionMatiere","matiere",new Matiere());
		List<Matiere> matieres = ServiceMat.display();
		List<Salle> salles = ServiceSal.display();
		view.addObject("salles",salles);
		view.addObject("matieres",matieres);
		return view ;
	}
	
	@RequestMapping(value = "/admin/addMatiere")
	public ModelAndView addMat(@ModelAttribute("matiere")Matiere mat) {
		ServiceMat.create(mat);
		ModelAndView view = new ModelAndView("GestionMatiere","matiere",new Matiere());
		List<Matiere> matieres = ServiceMat.display();
		List<Salle> salles = ServiceSal.display();
		view.addObject("salles",salles);
		view.addObject("matieres",matieres);
		return view ;
	}
	
	@RequestMapping("/editMat")
	public ModelAndView modifierMat(@RequestParam int idMatiere) {
		ModelAndView view=new ModelAndView("GestionMatiere");
		Matiere mat=ServiceMat.getById(idMatiere);
		List<Salle> salles = ServiceSal.display();
		view.addObject("salles",salles);
		List<Matiere> matieres = ServiceMat.display();
		view.addObject("salles",salles);
		view.addObject("matieres",matieres);
		view.addObject("matiere",mat);  
		return view;
	}
	
	@RequestMapping("/suppMat")
	public ModelAndView supprimerMat(@RequestParam int idMatiere){
		
		ModelAndView view=new ModelAndView("GestionMatiere");
		Matiere mat=ServiceMat.getById(idMatiere);
		System.out.println(mat);
		ServiceMat.delete(mat);
		List<Salle> salles = ServiceSal.display();
		view.addObject("salles",salles);
		List<Matiere> matieres = ServiceMat.display();
		view.addObject("salles",salles);
		view.addObject("matieres",matieres);

		view.addObject("matiere",new Matiere()); 
		 return view;
	}
	
//	---------------------------------College----------------------------------------
	
	@RequestMapping(value = "/admin/GestionCollege")
	public ModelAndView gestCol() {
		ModelAndView view = new ModelAndView("creationCollege","college",new College());

		List<College> colleges = ServiceCol.display();

		view.addObject("colleges",colleges);
		return view ;
	}
	
	@RequestMapping(value = "/admin/addCollege")
	public ModelAndView addCol(@ModelAttribute("college")College col) {
		ServiceCol.create(col);
		ModelAndView view = new ModelAndView("creationCollege","college",new College());
		List<College> colleges = ServiceCol.display();
		view.addObject("colleges",colleges);
		return view ;
	
	}
	
	@RequestMapping("/editCol")
	public ModelAndView modifierCol(@RequestParam int idCollege) {
		ModelAndView view=new ModelAndView("creationCollege");
		College c = ServiceCol.getById(idCollege);
		List<College> colleges = ServiceCol.display();
		view.addObject("colleges",colleges);
		view.addObject("college",c);  
		return view;
	}
	
	@RequestMapping("/suppCol")
	public ModelAndView supprimerCol(@RequestParam int idCollege){
		
		ModelAndView view=new ModelAndView("creationCollege");
		College c = ServiceCol.getById(idCollege);
		System.out.println(c);
		ServiceCol.delete(c);
		List<College> colleges = ServiceCol.display();
		view.addObject("colleges",colleges);
		view.addObject("college",new College());  


		 return view;
	}
	
}
