package all.cdi;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import all.ejb.EmployeeEJB;
import all.entity.Employee;
import java.io.Serializable;

@Named
@SessionScoped
public class EmployeeCDI implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	EmployeeEJB employeeEJB;
	
	public List<Employee> getEmployees(){
		return employeeEJB.getEmployees();
	}
}
