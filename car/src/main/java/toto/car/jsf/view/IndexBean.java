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
	
//	private ArrayList<Role> roles;
//	private Role selectedRole;
//	private Long selectedRoleID;
	
//	private ArrayList<Employee> employees;
//	private Employee selectedEmployee;
//	private Long selectEmployeeID;
	
	private Shop shop;
	
	private ArrayList<Customer> customers;
	private Customer selectedCustomer;
	private Long selectCustomerID;
	
	private User user;
	
	private String contentCenter = "customer.xhtml";
	
	private String userName;
	private String password;
	private Calendar cal;
	
	@PostConstruct
	private void init() {
		logger.debug("init");
		cal = Calendar.getInstance();
		
//		roles = setDummyRole();
//		selectedRole = roles.get(0);
//		logger.debug("Role select: " + selectedRole.getName());
		
//		employees = setDummyEmployee();
//		selectedEmployee = employees.get(0);
//		logger.debug("Employee select: " + selectedEmployee.getUserName());
		
		user = setDummyUser();
		customers = setDummyCustomer();
		shop = setDummyShop();
	}
	
	@PreDestroy
	private void destroy() {
		logger.debug("destroy");
	}
	
	private User setDummyUser() {
		User emp1 = new User();
		emp1.setId(0L);
		emp1.setUserName("terapong");
		emp1.setPassword("ying2002");
		emp1.setCreateUser("admin");
		emp1.setCreateDate(cal.getTime());
		emp1.setUpdateDate(cal.getTime());
		
		return emp1;
	}
	
	private Shop setDummyShop() {
		Shop shop = new Shop();
		shop.setAddress("fgdfggfd");
		shop.setBusinessRegistration("123456789");
		shop.setCreateDate(cal.getTime());
		shop.setCreateUser("admin");
		shop.setId(0L);
		shop.setIdcard("3770600334048");
		shop.setOwnerNameEN("Terapong");
		shop.setOwnerNameTH("ธีระพงษ์");
		shop.setOwnerSurNameEN("Potisuwan");
		shop.setOwnerSurNameTH("โพธิสุวรรณ");
		shop.setPhoneFax("087-4349902");
		shop.setPhoneMobile("087-4349902");
		shop.setPhoneOffice("087-4349902");
		shop.setShopName("Huhin");
		shop.setShopStatus(true);
		shop.setUpdateDate(cal.getTime());
		return shop;
	}
	
//	private ArrayList<Role> setDummyRole() {
//		ArrayList<Role> roles = new ArrayList<Role>();
//		Role r1 = new Role();
//		r1.setId(0L);
//		r1.setName("admin");
//		r1.setCreateUser("admin");
//		r1.setCreateDate(cal.getTime());
//		r1.setUpdateDate(cal.getTime());
//		roles.add(r1);
//		
//		Role r2 = new Role();
//		r2.setId(01L);
//		r2.setName("ying");
//		r2.setCreateUser("admin");
//		r2.setCreateDate(cal.getTime());
//		r2.setUpdateDate(cal.getTime());
//		roles.add(r2);
//		
//		return roles;
//	}
	
	private ArrayList<Customer> setDummyCustomer() {
		ArrayList<Customer> users = new ArrayList<Customer>();
		Customer u1 = new Customer();
		u1.setAddress("Address");
		u1.setCountry("Thailand");
		u1.setCreateDate(cal.getTime());
		u1.setCreateUser("admin");
		u1.setId(0L);
		u1.setIdCard("3770600334048");
		u1.setLicenseNo("123456789");
		u1.setNameEN("Terapong");
		u1.setSurnameEN("Potisuwan");
		u1.setNameTH("ธีระพงษ์");
		u1.setSurnameTH("โพธิสุวรรณ");
		u1.setPassportNo("987654321");
		u1.setPic("xxxxxx");
		u1.setUpdateDate(cal.getTime());
		users.add(u1);
		
		Customer u2 = new Customer();
		u2.setAddress("Address");
		u2.setCountry("Thailand");
		u2.setCreateDate(cal.getTime());
		u2.setCreateUser("admin");
		u2.setId(0L);
		u2.setIdCard("3770600334048");
		u2.setLicenseNo("123456789");
		u2.setNameEN("Ying");
		u2.setSurnameEN("Potisuwan");
		u2.setNameTH("หญิง");
		u2.setSurnameTH("โพธิสุวรรณ");
		u2.setPassportNo("987654321");
		u2.setPic("xxxxxx");
		u2.setUpdateDate(cal.getTime());
		users.add(u2);
		
		return users;
	}
	
	public String loginClick() {
		logger.debug("Login click");
		logger.debug("Login userName: " + userName);
		logger.debug("Login password: " + password);
		if((user.getUserName().equals(userName)) && (user.getPassword().equals(password))) {
			logger.debug("Login true");
			return "main.xhtml";
		} else {
			logger.debug("Login false");
			return null;
		}
	}
	
	public void RegisterClick() {
		logger.debug("Register click");
	}
	
//	public void selEmployeeChange() {
//		logger.debug("Employee Id: " + selectEmployeeID);
//		logger.debug("Employee select: " + employees.get(selectEmployeeID.intValue()).getUserName());
//	}
	
//	public void selRoleChange() {
//		logger.debug("Role Id: " + selectedRoleID);
//		logger.debug("Role select: " + roles.get(selectedRoleID.intValue()).getName());
//	}
	
//	public void selUserChange() {
//		logger.debug("User Id: " + selectUserID);
//		logger.debug("User select: " + users.get(selectUserID.intValue()).getUserName());
//	}

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContentCenter() {
		return contentCenter;
	}

	public void setContentCenter(String contentCenter) {
		this.contentCenter = contentCenter;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public Customer getSelectedCustomer() {
		return selectedCustomer;
	}

	public void setSelectedCustomer(Customer selectedCustomer) {
		this.selectedCustomer = selectedCustomer;
	}

	public Long getSelectCustomerID() {
		return selectCustomerID;
	}

	public void setSelectCustomerID(Long selectCustomerID) {
		this.selectCustomerID = selectCustomerID;
	}
}
