package product.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Product implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 966603566480994713L;

	private String bNo;
	private String thumbnail;
	private String pName;
	private int retailPrice;
	private int dcRate;
	private int pPrice;
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
		return "Product [bNo=" + bNo + ", thumbnail=" + thumbnail + ", pName=" + pName + ", retailPrice=" + retailPrice
				+ ", dcRate=" + dcRate + ", pPrice=" + pPrice + ", sNo=" + sNo + ", pDetail=" + pDetail + ", imgRouter="
				+ imgRouter + ", pPoint=" + pPoint + ", shipDate=" + shipDate + ", fStartDate=" + fStartDate
				+ ", fEndDate=" + fEndDate + ", fGoal=" + fGoal + ", fSelPrice=" + fSelPrice + ", fYn=" + fYn
				+ ", calNo=" + calNo + ", fPrgRate=" + fPrgRate + "]";
	}
	
	
	
}
