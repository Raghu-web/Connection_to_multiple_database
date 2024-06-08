package in.raghu.sql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.raghu.sql.entity.Employee;
import in.raghu.sql.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	public EmployeeRepo empRepo;
	
	public void createEmp() {
		Employee emp=new Employee();
		emp.setName("Raghu");
		emp.setSalary(60000.00);
		emp.setDesignation("Engineer");
		empRepo.save(emp);
		System.out.println("Data inserted");
	}
}
