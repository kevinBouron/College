package collegeWeb.controller;

import org.collegeServeur.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Control {
	
	@Autowired
	private IService service;
	

}