// 브랜드 입점날자를 String으로 설정한 vo클래스_희지
package brand.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Brand2 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6612957474542979616L;
	
	private String bNo;
	private String bName;
	private String bCeo;
	private String bPhone;
	private String bAddress;
	private String bEmail;
	private String bLchDate;
	private String bLchYn;
	
	
	public Brand2() {
	}


	public Brand2(String bNo, String bName, String bCeo, String bPhone, String bAddress, String bEmail, String bLchDate,
			String bLchYn) {
		this.bNo = bNo;
		this.bName = bName;
		this.bCeo = bCeo;
		this.bPhone = bPhone;
		this.bAddress = bAddress;
		this.bEmail = bEmail;
		this.bLchDate = bLchDate;
		this.bLchYn = bLchYn;
	}


	public String getbNo() {
		return bNo;
	}


	public void setbNo(String bNo) {
		this.bNo = bNo;
	}


	public String getbName() {
		return bName;
	}


	public void setbName(String bName) {
		this.bName = bName;
	}


	public String getbCeo() {
		return bCeo;
	}


	public void setbCeo(String bCeo) {
		this.bCeo = bCeo;
	}


	public String getbPhone() {
		return bPhone;
	}


	public void setbPhone(String bPhone) {
		this.bPhone = bPhone;
	}


	public String getbAddress() {
		return bAddress;
	}


	public void setbAddress(String bAddress) {
		this.bAddress = bAddress;
	}


	public String getbEmail() {
		return bEmail;
	}


	public void setbEmail(String bEmail) {
		this.bEmail = bEmail;
	}


	public String getbLchDate() {
		return bLchDate;
	}


	public void setbLchDate(String bLchDate) {
		this.bLchDate = bLchDate;
	}


	public String getbLchYn() {
		return bLchYn;
	}


	public void setbLchYn(String bLchYn) {
		this.bLchYn = bLchYn;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Brand2 [bNo=" + bNo + ", bName=" + bName + ", bCeo=" + bCeo + ", bPhone=" + bPhone + ", bAddress="
				+ bAddress + ", bEmail=" + bEmail + ", bLchDate=" + bLchDate + ", bLchYn=" + bLchYn + "]";
	}
	

}