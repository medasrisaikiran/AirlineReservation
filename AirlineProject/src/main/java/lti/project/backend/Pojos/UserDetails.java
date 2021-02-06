package lti.project.backend.Pojos;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


@Entity
@Table(name="USERDETAILS")
public class Userdetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int userid;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(length=20,unique=true)
	private String email;

	@Column(length=20)
	private String firstname;

	@Column(length=1)
	private String gender;

	@Column(length=20)
	private String lastname;

	@Column(length=10,unique=true)
	private String mobile;

	@Column(length=20)
	private String password;

	//bi-directional many-to-one association to Bookingdetails
	@OneToMany(mappedBy="userdetail",fetch=FetchType.LAZY,cascade=CascadeType.MERGE)
	private List<Bookingdetails> bookingdetails;

	public Userdetails() {
	}

	public int getUserid() {
		return this.userid;
	}

	@JsonIgnore
	public List<Bookingdetails> getBookingdetails() {
		return bookingdetails;
	}

	public void setBookingdetails(List<Bookingdetails> bookingdetails) {
		this.bookingdetails = bookingdetails;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}