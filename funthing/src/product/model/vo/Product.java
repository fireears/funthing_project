package product.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Product implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 966603566480994713L;

	private String pNo;
	private String bNo;
	private String thumbnail;
	private String pName;
	private int retailPrice;
	private int dcRate;
	private int pPrice;
	private int pCategory;
	private int sNo;
	private String pDetail;
	private String imgRouter;
	private int pPoint;
	private Date shipDate;
	private Date fStartDate;
	private Date fEndDate;
	private int fGoal;
	private int fSelPrice;
	private String fYn;
	private String calNo;
	private int fPrgRate;
	
	public Product() {
		super();
	}
	
	public Product(String thumbnail, String pName, Date fStartDate, Date fEndDate) {
		super();
		this.thumbnail = thumbnail;
		this.pName = pName;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
	}

	public Product(String thumbnail, String pName, int pPrice, Date fStartDate, Date fEndDate) {
		super();
		this.thumbnail = thumbnail;
		this.pName = pName;
		this.pPrice = pPrice;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
	}

	public Product(String pNo, String bNo, String thumbnail, String pName, int retailPrice, int dcRate, int pPrice,
			int pCategory, int sNo, String pDetail, String imgRouter, int pPoint, Date shipDate, Date fStartDate,
			Date fEndDate, int fGoal, int fSelPrice, String fYn, String calNo, int fPrgRate) {
		super();
		this.pNo = pNo;
		this.bNo = bNo;
		this.thumbnail = thumbnail;
		this.pName = pName;
		this.retailPrice = retailPrice;
		this.dcRate = dcRate;
		this.pPrice = pPrice;
		this.pCategory = pCategory;
		this.sNo = sNo;
		this.pDetail = pDetail;
		this.imgRouter = imgRouter;
		this.pPoint = pPoint;
		this.shipDate = shipDate;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
		this.fGoal = fGoal;
		this.fSelPrice = fSelPrice;
		this.fYn = fYn;
		this.calNo = calNo;
		this.fPrgRate = fPrgRate;
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

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getpDetail() {
		return pDetail;
	}

	public void setpDetail(String pDetail) {
		this.pDetail = pDetail;
	}

	public String getImgRouter() {
		return imgRouter;
	}

	public void setImgRouter(String imgRouter) {
		this.imgRouter = imgRouter;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Product [pNo=" + pNo + ", bNo=" + bNo + ", thumbnail=" + thumbnail + ", pName=" + pName
				+ ", retailPrice=" + retailPrice + ", dcRate=" + dcRate + ", pPrice=" + pPrice + ", pCategory="
				+ pCategory + ", sNo=" + sNo + ", pDetail=" + pDetail + ", imgRouter=" + imgRouter + ", pPoint="
				+ pPoint + ", shipDate=" + shipDate + ", fStartDate=" + fStartDate + ", fEndDate=" + fEndDate
				+ ", fGoal=" + fGoal + ", fSelPrice=" + fSelPrice + ", fYn=" + fYn + ", calNo=" + calNo + ", fPrgRate="
				+ fPrgRate + "]";
	}
	
	

	

	
	
	
	
}
