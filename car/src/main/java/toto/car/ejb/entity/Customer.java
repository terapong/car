package toto.car.ejb.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="user")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, name="name_th", length = 50)
    private String nameTH;
    
    @Column(nullable = false, name="surname_th", length = 50) 
    private String surnameTH;
    
    @Column(nullable = false, name="name_en", length = 50)
    private String nameEN;
    
    @Column(nullable = false, name="surname_en", length = 50)
    private String surnameEN;
    
    @Column(nullable = false, name="id_card", length = 20)
    private String idCard;
    
    @Column(nullable = false, name="license_no", length = 50)
    private String licenseNo;
    
    @Column(nullable = false, name="passport_no", length = 50)
    private String passportNo;
    
    @Column(nullable = false, name="country", length = 50)
    private String country;
    
    @Column(nullable = false, name="pic", length = 50)
    private String pic;
    
    @Column(nullable = false, name="address") @Lob
    private @NotNull String address;
    
    @Column(name="create_user")
    private String createUser;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", length=19)
    private Date createDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_date", length=19)
    private Date updateDate;
    
    @ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameTH() {
		return nameTH;
	}

	public void setNameTH(String nameTH) {
		this.nameTH = nameTH;
	}

	public String getSurnameTH() {
		return surnameTH;
	}

	public void setSurnameTH(String surnameTH) {
		this.surnameTH = surnameTH;
	}

	public String getNameEN() {
		return nameEN;
	}

	public void setNameEN(String nameEN) {
		this.nameEN = nameEN;
	}

	public String getSurnameEN() {
		return surnameEN;
	}

	public void setSurnameEN(String surnameEN) {
		this.surnameEN = surnameEN;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
