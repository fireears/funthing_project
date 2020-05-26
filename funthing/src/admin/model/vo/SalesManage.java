package admin.model.vo;

public class SalesManage {
	private String bName;		// 브랜드명
	private String bNo;			// 브랜드번호
	private String pName; 		// 상품명
	private String pCategory;	// 상품종류
	private String searchDate;
	private String firstDate;
	private String secondDate;
	private String gender;		// 성별
	private int pPrice;			// 상품가격
	public SalesManage() {
		super();
	}
	public SalesManage(String bName, int pPrice) {
		super();
		this.bName = bName;
		this.pPrice = pPrice;
	}
	
	
	public SalesManage(String pCategory, String searchDate, String firstDate, String secondDate, String gender) {
		super();
		this.pCategory = pCategory;
		this.searchDate = searchDate;
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
	public String getSearchDate() {
		return searchDate;
	}
	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
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
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "SalesManage [bName=" + bName + ", bNo=" + bNo + ", pName=" + pName + ", pCategory=" + pCategory
				+ ", searchDate=" + searchDate + ", firstDate=" + firstDate + ", secondDate=" + secondDate + ", gender="
				+ gender + ", pPrice=" + pPrice + "]";
	}
	
	
	
	

}
