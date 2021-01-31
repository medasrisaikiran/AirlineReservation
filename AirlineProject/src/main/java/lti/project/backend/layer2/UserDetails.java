package lti.project.backend.layer2;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserDetails 
{
	@Id
	@GeneratedValue
	@Column(name="userid")
	private int USERID;
	@Column(name="firstname",length=20)
	private String FIRSTNAME;
	@Column(name="lastname",length=20)
	private String LASTNAME;
	@Column(name="email",length=25)
	private String EMAIL;
	@Column(name="gender",length=1)
	private String GENDER;
	@Column(name="mobile")
	private long MOBILE;
	@Column(name="dob")
	private java.util.Date DATEOFBIRTH;
	@OneToMany(mappedBy="USERDETAILS",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	Set<BookingDetails> BOOKINGDETAILS;
	public int getUSERID() {
		return USERID;
	}
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}
	public String getLASTNAME() {
		return LASTNAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public String getGENDER() {
		return GENDER;
	}
	public long getMOBILE() {
		return MOBILE;
	}
	public java.util.Date getDATEOFBIRTH() {
		return DATEOFBIRTH;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}
	public void setLASTNAME(String lASTNAME) {
		LASTNAME = lASTNAME;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public void setMOBILE(long mOBILE) {
		MOBILE = mOBILE;
	}
	public void setDATEOFBIRTH(java.util.Date dATEOFBIRTH) {
		DATEOFBIRTH = dATEOFBIRTH;
	}
	public Set<BookingDetails> getBOOKINGDETAILS() {
		return BOOKINGDETAILS;
	}
	public void setBOOKINGDETAILS(Set<BookingDetails> bOOKINGDETAILS) {
		BOOKINGDETAILS = bOOKINGDETAILS;
	}

	
}
