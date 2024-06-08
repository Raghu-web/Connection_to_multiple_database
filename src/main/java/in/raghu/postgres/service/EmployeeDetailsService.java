package in.raghu.postgres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.raghu.postgres.entity.EmployeeDetails;
import in.raghu.postgres.repo.EmployeeDetailsRepo;

@Service
public class EmployeeDetailsService {
	@Autowired
	public EmployeeDetailsRepo empDetailsRepo;
	
	public void createEmpDetails() {
		EmployeeDetails emp=new EmployeeDetails();
		emp.setCountry("Africa");
		emp.setPincode("523234");
		emp.setState("Telangana");
		empDetailsRepo.save(emp);
		System.out.println("employee Details saved");
	}
	
	
}
