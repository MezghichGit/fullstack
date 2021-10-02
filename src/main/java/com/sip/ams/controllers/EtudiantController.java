package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EtudiantController {
	
	@RequestMapping("/home")
	public String message(Model model)
	{
		System.out.println("Bienvenue au BootCamp");
		String formation = "fullstack 100% Spring boot";
		String lieu ="Sesame";
		model.addAttribute("training", formation);
		model.addAttribute("location", lieu);
		return "info";
	}

}
