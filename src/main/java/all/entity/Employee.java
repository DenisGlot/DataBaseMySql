package all.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the employees database table.
 * 
 */
@Entity
@Table(name="employees")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id")
	private int employeeId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date birth;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	private int salary;

	public Employee() {
	}

	public int getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}