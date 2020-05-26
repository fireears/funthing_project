package payment.model.vo;

import java.io.Serializable;

public class ProductOrder implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4578560398653668975L;

	private String p_no;
	private String o_no;
	private String b_no;
	private int o_num;
	public ProductOrder() {
		super();
	}
	
	public ProductOrder(String p_no, String b_no, int o_num) {
		super();
		this.p_no = p_no;
		this.b_no = b_no;
		this.o_num = o_num;
	}
	
	public ProductOrder(String p_no, String o_no, String b_no, int o_num) {
		super();
		this.p_no = p_no;
		this.o_no = o_no;
		this.b_no = b_no;
		this.o_num = o_num;
	}
	public String getP_no() {
		return p_no;
	}
	public void setP_no(String p_no) {
		this.p_no = p_no;
	}
	public String getO_no() {
		return o_no;
	}
	public void setO_no(String o_no) {
		this.o_no = o_no;
	}
	public String getB_no() {
		return b_no;
	}
	public void setB_no(String b_no) {
		this.b_no = b_no;
	}
	public int getO_num() {
		return o_num;
	}
	public void setO_num(int o_num) {
		this.o_num = o_num;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ProductOrder [p_no=" + p_no + ", o_no=" + o_no + ", b_no=" + b_no + ", o_num=" + o_num + "]";
	}
	
	
	
}
