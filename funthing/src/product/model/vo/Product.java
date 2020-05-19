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
	private String p_color;
	private String p_size;
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
	private int rNum;
	
	public Product() {
		super();
	}
	
	public Product(String pNo, String bNo, String thumbnail, String pName, int pPrice, Date fStartDate, Date fEndDate) {
		super();
		this.pNo = pNo;
		this.bNo = bNo;
		this.thumbnail = thumbnail;
		this.pName = pName;
		this.pPrice = pPrice;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
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
	
	

	public Product(String pNo, String bNo, String thumbnail, String pName, String p_color, String p_size,
			int retailPrice, int dcRate, int pPrice, int pCategory, int sNo, String pDetail, String imgRouter,
			int pPoint, Date shipDate, Date fStartDate, Date fEndDate, int fGoal, int fSelPrice, String fYn,
			String calNo, int fPrgRate) {
		super();
		this.pNo = pNo;
		this.bNo = bNo;
		this.thumbnail = thumbnail;
		this.pName = pName;
		this.p_color = p_color;
		this.p_size = p_size;
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
	
	//product insert생성자
	public Product(String pNo, String bNo, String thumbnail, String pName, String p_color, String p_size,
			int retailPrice, int dcRate, int pPrice, int pCategory, int sNo, String pDetail, String imgRouter,
			int pPoint, Date shipDate, Date fStartDate, Date fEndDate, int fGoal, String fYn) {
		super();
		this.pNo = pNo;
		this.bNo = bNo;
		this.thumbnail = thumbnail;
		this.pName = pName;
		this.p_color = p_color;
		this.p_size = p_size;
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
		this.fYn = fYn;
	}


	public Product(String pNo, String thumbnail, String pName, int retailPrice, int pPrice, Date fStartDate,
			Date fEndDate, int fPrgRate) {
		super();
		this.pNo = pNo;
		this.thumbnail = thumbnail;
		this.pName = pName;
		this.retailPrice = retailPrice;
		this.pPrice = pPrice;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
		this.fPrgRate = fPrgRate;
	}
	
	

	//admin페이지 product수정 생성자
	public Product(int retailPrice, int dcRate, int pPrice, String pDetail, int pPoint,
			Date shipDate, Date fStartDate, Date fEndDate, int fGoal, int fSelPrice, String fYn, String calNo) {
		super();
		this.retailPrice = retailPrice;
		this.dcRate = dcRate;
		this.pPrice = pPrice;
		this.pDetail = pDetail;
		this.pPoint = pPoint;
		this.shipDate = shipDate;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
		this.fGoal = fGoal;
		this.fSelPrice = fSelPrice;
		this.fYn = fYn;
		this.calNo = calNo;
	}

	//admin페이지 상품search
	public Product(String pNo, String bNo, String pName, int pPrice, int pCategory, int sNo, Date fStartDate,
			Date fEndDate, String fYn) {
		super();
		
		this.pNo = pNo;
		this.bNo = bNo;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pCategory = pCategory;
		this.sNo = sNo;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
		this.fYn = fYn;
	}
	
	
	public Product(String pNo, String pName, int retailPrice, int dcRate, int pPrice, int pCategory, Date fStartDate,
			Date fEndDate, String fYn, int rNum) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.retailPrice = retailPrice;
		this.dcRate = dcRate;
		this.pPrice = pPrice;
		this.pCategory = pCategory;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
		this.fYn = fYn;
		this.rNum = rNum;
	}

	public Product(int rnum, String pNo, String bNo, String pName, int pPrice, int pCategory, int sNo, Date fStartDate,
			Date fEndDate, String fYn) {
		super();
		this.rNum = rnum;
		this.pNo = pNo;
		this.bNo = bNo;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pCategory = pCategory;
		this.sNo = sNo;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
		this.fYn = fYn;
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
	
	
	public String getP_color() {
		return p_color;
	}

	public void setP_color(String p_color) {
		this.p_color = p_color;
	}

	public String getP_size() {
		return p_size;
	}

	public void setP_size(String p_size) {
		this.p_size = p_size;
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

	public int getrNum() {
		return rNum;
	}
	
	public void setrNum(int rNum) {
		this.rNum = rNum;
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
