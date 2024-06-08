package in.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghu.postgres.service.EmployeeDetailsService;
import in.raghu.sql.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService bean = context.getBean(EmployeeService.class);
		bean.createEmp();
		EmployeeDetailsService bean2 = context.getBean(EmployeeDetailsService.class);
		bean2.createEmpDetails();
		
	}

}
