package training.sapient.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import training.sapient.bean.Customer;

@Controller
public class CustomerController {
	@RequestMapping(value="/customer/form", method=RequestMethod.GET)
	public String showCustomerForm(Model model) {
		model.addAttribute("customer",new Customer());
		return "custForm";
	}
	@RequestMapping(value="/customer/save", method=RequestMethod.POST)
	public String saveCustomerAction(
		@Valid Customer customer,
		BindingResult bindingResult,
		Model model
	) {
		if(bindingResult.hasErrors()) {
			return "custForm";
		}
		
		model.addAttribute("customer", customer);
		return "cust-save-success";
	}
}
