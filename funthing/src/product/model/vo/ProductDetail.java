// 제품 상세 페이지_혜린
package product.model.vo;

import java.sql.Date;

public class ProductDetail {
	private String pNo;			// 상품번호
	private String bNo;			// 브랜드번호
	private String bName;		// 브랜드 이름
	private String thumbnail;	// 대표이미지
	private String pName;		// 상품명
	private String pColor;		// 색상
	private String pSize;		// 사이즈
	private int retailPrice;	// 상품가격(정가)
	private int dcRate;			// 할인율
	private int pPrice;			// 판매가격(정가-할인가격)
	private int pCategory;		// 상품종류
	private int Sno;			// 스타일번호
	private String pDetail;		// 상품설명
	private String imgRoter;	// 상품이미지 경로
	private int pPoint;			// 적립금
	private Date shipDate;		// 순차적배송날짜
	private Date fStartDate;	// 펀딩 시작 날짜
	private Date fEndDate;		// 펀딩 종료 날짜
	private int fGoal;			// 펀딩 목표
	private int fSelPrice;		// 펀딩 판매 금액
	private String fYn;			// 펀딩 진행 유무
	private String calNo;		// 캘린더 번호
	private int fPrgRate;		// 펀딩 진행율
	private int oNum;			// 수량
	public ProductDetail() {
		super();
	}
	
	
	

	
	
	

	public ProductDetail(String pNo, String pName, String pColor, int sno) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pColor = pColor;
		this.Sno = sno;
	}








	public ProductDetail(String pNo, String pName, String pSize) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pSize = pSize;
	}

	public ProductDetail(String pNo, String bNo, String bName, String thumbnail, String pName, String pColor,
			String pSize, int retailPrice, int dcRate, int pPrice, int pCategory, int sno, String pDetail,
			String imgRoter, int pPoint, Date shipDate, Date fStartDate, Date fEndDate, int fGoal, int fSelPrice,
			String fYn, String calNo, int fPrgRate, int oNum) {
		super();
		this.pNo = pNo;
		this.bNo = bNo;
		this.bName = bName;
		this.thumbnail = thumbnail;
		this.pName = pName;
		this.pColor = pColor;
		this.pSize = pSize;
		this.retailPrice = retailPrice;
		this.dcRate = dcRate;
		this.pPrice = pPrice;
		this.pCategory = pCategory;
		this.Sno = sno;
		this.pDetail = pDetail;
		this.imgRoter = imgRoter;
		this.pPoint = pPoint;
		this.shipDate = shipDate;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
		this.fGoal = fGoal;
		this.fSelPrice = fSelPrice;
		this.fYn = fYn;
		this.calNo = calNo;
		this.fPrgRate = fPrgRate;
		this.oNum = oNum;
	}
	
	public ProductDetail(String pNo, String bNo, String bName, String thumbnail, String pName, int retailPrice,
			int dcRate, int pPrice, int pCategory, int sno, String pDetail, String imgRoter, int pPoint, Date shipDate,
			Date fStartDate, Date fEndDate, int fGoal, int fSelPrice, String fYn, String calNo, int fPrgRate,
			int oNum) {
		super();
		this.pNo = pNo;
		this.bNo = bNo;
		this.bName = bName;
		this.thumbnail = thumbnail;
		this.pName = pName;
		this.retailPrice = retailPrice;
		this.dcRate = dcRate;
		this.pPrice = pPrice;
		this.pCategory = pCategory;
		this.Sno = sno;
		this.pDetail = pDetail;
		this.imgRoter = imgRoter;
		this.pPoint = pPoint;
		this.shipDate = shipDate;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
		this.fGoal = fGoal;
		this.fSelPrice = fSelPrice;
		this.fYn = fYn;
		this.calNo = calNo;
		this.fPrgRate = fPrgRate;
		this.oNum = oNum;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
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
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpColor() {
		return pColor;
	}
	public void setpColor(String pColor) {
		this.pColor = pColor;
	}
	public String getpSize() {
		return pSize;
	}
	public void setpSize(String pSize) {
		this.pSize = pSize;
	}
	public int getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(int retailPrice) {
		this.retailPrice = retailPrice;
	}
	public int getDcRate() {
		return dcRate;
	}
	public void setDcRate(int dcRate) {
		this.dcRate = dcRate;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public int getpCategory() {
		return pCategory;
	}
	public void setpCategory(int pCategory) {
		this.pCategory = pCategory;
	}
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getpDetail() {
		return pDetail;
	}
	public void setpDetail(String pDetail) {
		this.pDetail = pDetail;
	}
	public String getImgRoter() {
		return imgRoter;
	}
	public void setImgRoter(String imgRoter) {
		this.imgRoter = imgRoter;
	}
	public int getpPoint() {
		return pPoint;
	}
	public void setpPoint(int pPoint) {
		this.pPoint = pPoint;
	}
	public Date getShipDate() {
		return shipDate;
	}
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	public Date getfStartDate() {
		return fStartDate;
	}
	public void setfStartDate(Date fStartDate) {
		this.fStartDate = fStartDate;
	}
	public Date getfEndDate() {
		return fEndDate;
	}
	public void setfEndDate(Date fEndDate) {
		this.fEndDate = fEndDate;
	}
	public int getfGoal() {
		return fGoal;
	}
	public void setfGoal(int fGoal) {
		this.fGoal = fGoal;
	}
	public int getfSelPrice() {
		return fSelPrice;
	}
	public void setfSelPrice(int fSelPrice) {
		this.fSelPrice = fSelPrice;
	}
	public String getfYn() {
		return fYn;
	}
	public void setfYn(String fYn) {
		this.fYn = fYn;
	}
	public String getCalNo() {
		return calNo;
	}
	public void setCalNo(String calNo) {
		this.calNo = calNo;
	}
	public int getfPrgRate() {
		return fPrgRate;
	}
	public void setfPrgRate(int fPrgRate) {
		this.fPrgRate = fPrgRate;
	}
	public int getoNum() {
		return oNum;
	}
	public void setoNum(int oNum) {
		this.oNum = oNum;
	}
	@Override
	public String toString() {
		return "ProductDetail [pNo=" + pNo + ", bNo=" + bNo + ", bName=" + bName + ", thumbnail=" + thumbnail
				+ ", pName=" + pName + ", pColor=" + pColor + ", pSize=" + pSize + ", retailPrice=" + retailPrice
				+ ", dcRate=" + dcRate + ", pPrice=" + pPrice + ", pCategory=" + pCategory + ", Sno=" + Sno
				+ ", pDetail=" + pDetail + ", imgRoter=" + imgRoter + ", pPoint=" + pPoint + ", shipDate=" + shipDate
				+ ", fStartDate=" + fStartDate + ", fEndDate=" + fEndDate + ", fGoal=" + fGoal + ", fSelPrice="
				+ fSelPrice + ", fYn=" + fYn + ", calNo=" + calNo + ", fPrgRate=" + fPrgRate + ", oNum=" + oNum + "]\n";
	}
	
		
}
