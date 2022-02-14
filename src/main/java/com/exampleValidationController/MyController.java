package com.exampleValidationController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.Practise.entities.LoginData;
public class MyController 
{
  @GetMapping("/form")
  public String openForm(Model model)
  {
	  System.out.println("opening form");
	  model.addAttribute("loginData",LoginData());
	  return "form";
  }
  @PostMapping("/Process")
public String processForm(@ModelAttribute("loginData") LoginData loginData)
{
	if(result.hasErrors())
	{
		System.out.println(result);
		return "form";
	}
	System.out.println(loginData);
	  return "success";
}
}
