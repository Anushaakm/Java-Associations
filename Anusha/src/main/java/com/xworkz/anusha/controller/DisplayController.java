package com.xworkz.anusha.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.anusha.dto.BeverageDTO;
import com.xworkz.anusha.dto.ChatDTO;
import com.xworkz.anusha.dto.EducationDTO;
import com.xworkz.anusha.dto.FamilyDTO;
import com.xworkz.anusha.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DisplayController {

	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running email...");
		model.addAttribute("myemail", "anusha@gmail.com");
		return "index.jsp";
	}
	
	@GetMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("Running Mobile...");
		model.addAttribute("myMobile", "RealMe 6");
		return "index.jsp";
	}

	@GetMapping("/aadhar")
	public String onAadhar(Model model) {
		System.out.println("Running adhar...");
		model.addAttribute("myAadhar", "!@#$1234");
		return "index.jsp";
	}
	
	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running age...");
		model.addAttribute("myAge", "23");
		return "index.jsp";
	}
	@GetMapping("/dob")
	public String onDOB(Model model) {
		System.out.println("Running dob");
		model.addAttribute("Birthdate", LocalDateTime.of(2000,11,04,07, 0));
		return "index.jsp";
	}
	
	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("Running dob");
		model.addAttribute("mySalary", "0lpa");
		return "index.jsp";
	}
	
	@GetMapping("/friendslist")
	public String onFriendsList(Model model) {
		System.out.println("Running FriendList");
		List<String> ref=new ArrayList<String>();
		ref.add("Mansa");
		ref.add("Lavanya");
		ref.add("Nayana");
		model.addAttribute("friends", ref);
		return "index.jsp";
	}
	
	@GetMapping("/places")
	public String onVisitedPlacesList(Model model) {
		System.out.println("Running placeList");
		List<String> ref=new ArrayList<String>();
		ref.add("Chitradurga");
		ref.add("Bengaluru");
		ref.add("Shivamogga");
		model.addAttribute("places", ref);
		return "index.jsp";
	}
	
	@GetMapping("/skill")
	public String onSkillSet(Model model) {
		System.out.println("Running SkillSet");
		List<String> ref=new ArrayList<String>();
		ref.add("Drawing");
		ref.add("Crafting");
		ref.add("Dancing");
		model.addAttribute("skills", ref);
		return "index.jsp";
	}
	@GetMapping("/edu")
	public String onDto(Model model) {
		
		System.out.println("Running ondto");
		EducationDTO dto = new EducationDTO();
		dto.setPrePrimary("Taralabalu");
		dto.setPrimary("Taralabalu");
		dto.setSecondary("Tarabalu");
		dto.setPreUniversity("SLV");
		dto.setUniversity("VTU");
		dto.setPrePrimaryPercentage(100);
		dto.setPrimaryPercentage(100);
		dto.setSecondaryPercentage(100);
		dto.setPreUniversityPercentage(100);
		dto.setUniversityPercentage(100);
		model.addAttribute("education", dto);
		return "index.jsp";
	}
	
	@GetMapping("/masala")
	public String onChat(Model model) {
		System.out.println("Running Chat");
		ChatDTO dto5 = new ChatDTO();
		dto5.setChatName("pani puri");
		dto5.setChatPrice(2000);
		dto5.setNoOfPlates(200);
		dto5.setOwnerName("somone");
		dto5.setId(400);
		dto5.setChatShopName("venky shop");
		dto5.setChatShopPH(7892225217d);
		dto5.setNoOfEmployee(500);
		dto5.setChatGSTNo("ahahaaha");
		dto5.setChatShopLocation("bangalore");
		model.addAttribute("spicy", dto5);
		return "index.jsp";
	}

	@GetMapping("/beverage")
	public String onBeverage(Model model) {
		System.out.println("running Beverage");
		BeverageDTO dto2 = new BeverageDTO();
		dto2.setBeverageName("juice");
		dto2.setBeveragePrice(500);
		dto2.setNoOfbeverage(50);
		dto2.setOwnerName("Rama");
		dto2.setBeverageId(123);
		dto2.setBeverageShopName("Rama shop");
		dto2.setBeverageShopPH(787877777);
		dto2.setBeverageShopLocation("bangalore");
		model.addAttribute("juice", dto2);
		return "index.jsp";

	}
	
	@GetMapping("/family")
	public String onFamily(Model model) {
		System.out.println("Running Family");
		FamilyDTO dto = new FamilyDTO();
		dto.setFamilyName("Anushas family");
		dto.setLocation("Chitradurga");
		dto.setGrandFather("Omkaarappa");
		dto.setGrandMother("Sumitra");
		dto.setFatheName("Maheshwarappa");
		dto.setMotherName("Sudha");
		dto.setFamMembers(6);
		dto.setNoOfSiblings(1);
		dto.setFatherProfession("Farmer");
		dto.setJointFamily(true);
		model.addAttribute("family", dto);
		return "index.jsp";

	}

	@GetMapping("/mobilePhone")
	public String onMobilePhone(Model model) {
		System.out.println("Running Mobile");
		MobileDTO dto = new MobileDTO();
		dto.setBrand("Realme");
		dto.setModel("Realme 6");
		dto.setColor("blue");
		dto.setOperatingSystem("Ios");
		dto.setPrice(15000);
		model.addAttribute("mobile", dto);
		return "index.jsp";
	}
	

}
