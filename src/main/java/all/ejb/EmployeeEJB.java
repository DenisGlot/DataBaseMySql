package all.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import all.entity.Employee;

@Stateless
@LocalBean
public class EmployeeEJB {

	@PersistenceContext(unitName = "New MySQL")
	EntityManager em;
	
	public List<Employee> getEmployees(){
		TypedQuery<Employee> query = em.createNamedQuery("SELECT e FROM Employee e", Employee.class);
		return query.getResultList();
	}
}
