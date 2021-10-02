package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
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
	
	@RequestMapping("/produits")
	public String listProduits(Model model)
	{
		List<String> produits = new ArrayList<>();
		produits.add("Voiture");
		produits.add("Camion");
		produits.add("Moto");
		produits.add("Bus");
		model.addAttribute("mesProduits", produits);
		return "products";
	}

}
