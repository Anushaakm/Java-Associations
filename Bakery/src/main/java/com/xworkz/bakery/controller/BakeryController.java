package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.Service.BakeryService;
import com.xworkz.bakery.dto.BakeryDTO;

@Component
@RequestMapping("/bakery")
public class BakeryController {
	@Autowired
	private BakeryService service;

	public BakeryController() {
		System.out.println("Running : " + getClass().getSimpleName());
	}

	@PostMapping
	public String BakeryController(BakeryDTO dto, Model model) {
		System.out.println("Running :" + dto);
		model.addAttribute("name", dto.getName());
		model.addAttribute("owner", dto.getOwner());
		model.addAttribute("wife", dto.getOwnerWife());
		model.addAttribute("married", dto.isMarried());
		model.addAttribute("famousFor", dto.getFamousFor());
		model.addAttribute("since", dto.getSince());
		boolean saved = this.service.validationAndSave(dto);
		System.out.println("Saved:" + saved);
		return "DisplayBakery.jsp";
	}

}