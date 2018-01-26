package com.nan.smspro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nan.smspro.entity.Studentresult;
import com.nan.smspro.service.StudentResultService;

@Controller
public class ResultController {

	@Autowired
	StudentResultService service;

	@GetMapping("/")
	public String getCountries(Model model) {
		Iterable<Studentresult> list = service.findAll();
		model.addAttribute("student", new Studentresult());
		model.addAttribute("listOfStudents", list);

		return "result";
	}

	@GetMapping("/editStudent/{serialNo}")
	public String getEditedResult(@PathVariable("serialNo") int id, Model model) {
		model.addAttribute("student", this.service.findOne(id));
		return "editresult";
	}
	@PostMapping("/editStudent")
	public String saveEditedResult(@ModelAttribute("student") Studentresult student, Model model) {
		this.service.save(student);
		Iterable<Studentresult> list = service.findAll();
		model.addAttribute("student", new Studentresult());
		model.addAttribute("listOfStudents", list);

		return "result";
	
	}

	@GetMapping("/deleteStudent/{serialNo}")
	public String deleteResult(@PathVariable("serialNo") int id, Model model) {
		this.service.delete(id);
		model.addAttribute("student", new Studentresult());
		model.addAttribute("listOfStudents", this.service.findAll());
		return "result";
	}
	
	@GetMapping("/searchStudent")
	public String searchStudent(@RequestParam("searchString")String text, Model model) {
		
		if(!text.isEmpty()) {
			List<Studentresult> resultList = this.service.findByMatNo(text);
			model.addAttribute("student", new Studentresult());
			model.addAttribute("listOfStudents", resultList);
			
		}
		else {
			Iterable<Studentresult> resultList = this.service.findAll();
			model.addAttribute("student", new Studentresult());
			model.addAttribute("listOfStudents", resultList);
		}
		return "result";
	}
	
	@GetMapping("/saveCa")
	public String saveCa(@RequestParam("matNo") String receivedMatNo, @RequestParam("ca") String ca, Model model) {
		
		if(!receivedMatNo.isEmpty() && !ca.isEmpty()) {
			String matNo = "UJ/2016/PGED/"+receivedMatNo;
			
			Studentresult resultList = this.service.find(matNo);
			if(resultList != null) {
				resultList.setCa(Double.valueOf(ca));
				this.service.save(resultList);
			}
					
			List<Studentresult> editedList = this.service.findByMatNo(matNo);
					
			model.addAttribute("student", new Studentresult());
			model.addAttribute("listOfStudents", editedList);
		}
		else {
			model.addAttribute("student", new Studentresult());
			model.addAttribute("listOfStudents", this.service.findAll());
		}
			
		return "result";
	}
	
	@GetMapping("/saveName")
	public String getStudentNameForm(Model model) {
		model.addAttribute("student", new Studentresult());
		model.addAttribute("listOfStudents", this.service.findAll());
		return "addname";
	}
	
	@PostMapping("/saveName")
	public String saveStudentName(@RequestParam("matNo") String receivedMatNo, @RequestParam("name") String receivedName, Model model) {
		
		if(!receivedMatNo.isEmpty() && !receivedName.isEmpty()) {
			String matNo = "UJ/2016/PGED/"+receivedMatNo;
			
			Studentresult resultList = this.service.find(matNo);
			if(resultList != null) {
				resultList.setName(receivedName);
				this.service.save(resultList);
			}
			List<Studentresult> editedList = this.service.findByMatNo(matNo);
					
			model.addAttribute("student", new Studentresult());
			model.addAttribute("listOfDepartments", editedList);
		}
		else {
			model.addAttribute("student", new Studentresult());
			model.addAttribute("listOfDepartments", this.service.findAll());
		}
			
		return "addname";
	}
	
	
}