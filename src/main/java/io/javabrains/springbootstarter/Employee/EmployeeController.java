package io.javabrains.springbootstarter.Employee;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("/")
	public List<Employee> getAllEmployee() {
		return Arrays.asList(
				new Employee(1,"ram","cleaner"),
				new Employee(2,"ravi","manager")
				
				
				);
	}

}
