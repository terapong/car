package toto.car.jsf.view;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

import toto.car.ejb.entity.*;

@Named("indexbean")
@ViewScoped
public class IndexBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(IndexBean.class);
	private ArrayList<Employee> employees;
	private ArrayList<Role> roles;
	private Role selectedRole;
	private Long selectedRoleID;
	private Employee selectedEmployee;
	private Long selectEmployeeID;
	private String userName;
	private String password;
	private Calendar cal;
	
	@PostConstruct
	private void init() {
		logger.debug("init");
		cal = Calendar.getInstance();
		
		roles = setDummyRole();
		selectedRole = roles.get(0);
		logger.debug("Role select: " + selectedRole.getName());
		
		employees = setDummyEmployee();
		selectedEmployee = employees.get(0);
		logger.debug("Employee select: " + selectedEmployee.getUserName());
	}
	
	@PreDestroy
	private void destroy() {
		logger.debug("destroy");
	}
	
	private ArrayList<Employee> setDummyEmployee() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(0L);
		emp1.setUserName("terapong");
		emp1.setPassword("ying2002");
		emp1.setCreateUser("admin");
		emp1.setCreateDate(cal.getTime());
		emp1.setUpdateDate(cal.getTime());
		employees.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(1L);
		emp2.setUserName("ying");
		emp2.setPassword("ying2002");
		emp2.setCreateUser("admin");
		emp2.setCreateDate(cal.getTime());
		emp2.setUpdateDate(cal.getTime());
		employees.add(emp2);
		
		return employees;
	}
	
	private ArrayList<Role> setDummyRole() {
		ArrayList<Role> roles = new ArrayList<Role>();
		Role r1 = new Role();
		r1.setId(0L);
		r1.setName("admin");
		r1.setCreateUser("admin");
		r1.setCreateDate(cal.getTime());
		r1.setUpdateDate(cal.getTime());
		roles.add(r1);
		
		Role r2 = new Role();
		r2.setId(01L);
		r2.setName("ying");
		r2.setCreateUser("admin");
		r2.setCreateDate(cal.getTime());
		r2.setUpdateDate(cal.getTime());
		roles.add(r2);
		
		return roles;
	}
	
	public void loginClick() {
		logger.debug("Login click");
	}
	
	public void RegisterClick() {
		logger.debug("Register click");
	}
	
	public void selEmployeeChange() {
		logger.debug("Employee Id: " + selectEmployeeID);
		logger.debug("Employee select: " + employees.get(selectEmployeeID.intValue()).getUserName());
	}
	
	public void selRoleChange() {
		logger.debug("Role Id: " + selectedRoleID);
		logger.debug("Role select: " + roles.get(selectedRoleID.intValue()).getName());
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee getSelectedEmployee() {
		return selectedEmployee;
	}

	public void setSelectedEmployee(Employee selectedEmployee) {
		this.selectedEmployee = selectedEmployee;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public Long getSelectEmployeeID() {
		return selectEmployeeID;
	}

	public void setSelectEmployeeID(Long selectEmployeeID) {
		this.selectEmployeeID = selectEmployeeID;
	}

	public ArrayList<Role> getRoles() {
		return roles;
	}

	public void setRoles(ArrayList<Role> roles) {
		this.roles = roles;
	}

	public Role getSelectedRole() {
		return selectedRole;
	}

	public void setSelectedRole(Role selectedRole) {
		this.selectedRole = selectedRole;
	}

	public Long getSelectedRoleID() {
		return selectedRoleID;
	}

	public void setSelectedRoleID(Long selectedRoleID) {
		this.selectedRoleID = selectedRoleID;
	}
}
