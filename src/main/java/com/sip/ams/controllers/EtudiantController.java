package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sip.ams.entities.Etudiant;

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
	//public String listProduits(Model model)
	public ModelAndView listProduits()
	{
		ModelAndView mv = new ModelAndView();
		
		List<String> produits = new ArrayList<>();
		produits.add("Voiture");
		produits.add("Camion");
		produits.add("Moto");
		produits.add("Bus");
		//model.addAttribute("mesProduits", produits);
		mv.addObject("mesProduits", produits);
		mv.setViewName("products");
		return mv;
		//return "products";
	}
	
	@RequestMapping("/students")
	public ModelAndView listStudents()
	{
		ModelAndView mv = new ModelAndView();
		
		List<Etudiant> etudiants = new ArrayList<>();
		
		etudiants.add(new Etudiant(1,"amine","amine@gmail.com"));
		etudiants.add(new Etudiant(2,"rami","rami@gmail.com"));
		etudiants.add(new Etudiant(3,"patrick","patrick@gmail.com"));
        System.out.println(etudiants);
		mv.addObject("students", etudiants);
		mv.setViewName("listStudents");
		return mv;
	}

}
