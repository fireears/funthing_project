package notice.model.vo;

import java.io.Serializable;
import java.sql.Date;


public class Notice implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5875954839993211121L;
	
	private int nNo;			//공지사항 번호
	private String nTitle;		//공지사항 제목
	private String nContents;	//공지사항 내용
	private Date nDate;			//공지사항 작성날짜
	private String nDelYn;		//공지사항 삭제여부
	private String nDaatee;     //한솔 용 
	
	public Notice() {
		super();
	}
	
	
	
	
	public Notice(int nNo, String nTitle, String nContents, String nDaatee ,String nDelYn) {
		super();
		this.nNo = nNo;
		this.nTitle = nTitle;
		this.nContents = nContents;
		this.nDelYn = nDelYn;
		this.nDaatee = nDaatee;
	}




	public Notice(int nNo, String nTitle, String nContents, Date nDate, String nDelYn) {
		super();
		this.nNo = nNo;
		this.nTitle = nTitle;
		this.nContents = nContents;
		this.nDate = nDate;
		this.nDelYn = nDelYn;
	}

	public String getnDaatee() {
		return nDaatee;
	}

	public void setnDaatee(String nDaatee) {
		this.nDaatee = nDaatee;
	}

	public Notice(String nTitle, Date nDate) {
		super();
		this.nTitle = nTitle;
		this.nDate = nDate;
	}
	public int getnNo() {
		return nNo;
	}
	public void setnNo(int nNo) {
		this.nNo = nNo;
	}
	public String getnTitle() {
		return nTitle;
	}
	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}
	public String getnContents() {
		return nContents;
	}
	public void setnContents(String nContents) {
		this.nContents = nContents;
	}
	public Date getnDate() {
		return nDate;
	}
	public void setnDate(Date nDate) {
		this.nDate = nDate;
	}
	public String getnDelYn() {
		return nDelYn;
	}
	public void setnDelYn(String nDelYn) {
		this.nDelYn = nDelYn;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Notice [nNo=" + nNo + ", nTitle=" + nTitle + ", nContents=" + nContents + ", nDate=" + nDate
				+ ", nDelYn=" + nDelYn + "]";
	}
	
	
	
}
