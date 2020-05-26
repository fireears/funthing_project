package admin.model.vo;

import java.sql.Date;

public class ProductStatic {
	
	private String bName;		// 브랜드명
	private String bNo;			// 브랜드번호
	private String pName; 		// 상품명
//	private String pNo;			// 상품번호
	private String pCategory;	// 상품종류
	private int oNum;			// 주문 수량
	private String searchDate;
	private String firstDate;
	private String secondDate;
	private String gender;		// 성별
	public ProductStatic() {
		super();
	}
	
	
	
	public ProductStatic(String pCategory, String searchDate, String firstDate, String secondDate, String gender) {
		super();
		this.pCategory = pCategory;
		this.searchDate = searchDate;
		this.firstDate = firstDate;
		this.secondDate = secondDate;
		this.gender = gender;
	}

	

	public ProductStatic(String bName, int oNum) {
		super();
		this.bName = bName;
		this.oNum = oNum;
	}



	public ProductStatic(String bName, String bNo, String pName, String pCategory, int oNum, String firstDate,
			String secondDate, String gender) {
		super();
		this.bName = bName;
		this.bNo = bNo;
		this.pName = pName;
		this.pCategory = pCategory;
		this.oNum = oNum;
		this.firstDate = firstDate;
		this.secondDate = secondDate;
		this.gender = gender;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public String getpCategory() {
		return pCategory;
	}
	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
	public int getoNum() {
		return oNum;
	}
	public void setoNum(int oNum) {
		this.oNum = oNum;
	}
	public String getFirstDate() {
		return firstDate;
	}
	public void setFirstDate(String firstDate) {
		this.firstDate = firstDate;
	}
	public String getSecondDate() {
		return secondDate;
	}
	public void setSecondDate(String secondDate) {
		this.secondDate = secondDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getSearchDate() {
		return searchDate;
	}



	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}



	@Override
	public String toString() {
		return "ProductStatic [bName=" + bName + ", bNo=" + bNo + ", pName=" + pName + ", pCategory="
				+ pCategory + ", oNum=" + oNum + ", firstDate=" + firstDate + ", secondDate=" + secondDate + ", gender="
				+ gender + "]";
	}
	
	
	
	
	

}
