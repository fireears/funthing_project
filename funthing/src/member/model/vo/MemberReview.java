package member.model.vo;

public class MemberReview {
	private String m_no;
	private String rev_title;
	private String p_no;
	private String rev_contents;
	private String rev_date;
	private int rate;
	
	public String getM_no() {
		return m_no;
	}
	public void setM_no(String m_no) {
		this.m_no = m_no;
	}
	public String getRev_title() {
		return rev_title;
	}
	public void setRev_title(String rev_title) {
		this.rev_title = rev_title;
	}
	public String getP_no() {
		return p_no;
	}
	public void setP_no(String p_no) {
		this.p_no = p_no;
	}
	public String getRev_contents() {
		return rev_contents;
	}
	public void setRev_contents(String rev_contents) {
		this.rev_contents = rev_contents;
	}
	public String getRev_date() {
		return rev_date;
	}
	public void setRev_date(String rev_date) {
		this.rev_date = rev_date;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "MemberReview [m_no=" + m_no + ", rev_title=" + rev_title + ", p_no=" + p_no + ", rev_contents="
				+ rev_contents + ", rev_date=" + rev_date + ", rate=" + rate + "]";
	}
	public MemberReview(String m_no, String rev_title, String p_no, String rev_contents, String rev_date, int rate) {
		super();
		this.m_no = m_no;
		this.rev_title = rev_title;
		this.p_no = p_no;
		this.rev_contents = rev_contents;
		this.rev_date = rev_date;
		this.rate = rate;
	}
	

}


