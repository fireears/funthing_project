package payment.model.vo;

import java.io.Serializable;

public class ShoppingPayment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2973116038487521235L;

	private String p_no;
	private String thumbnail;
	private String p_name;
	private String p_color;
	private String p_size;
	private int retail_price;
	private int dc_rate;
	private int p_price;
	private int p_point;
	private String number;
	public ShoppingPayment() {
		super();
	}
	public ShoppingPayment(String p_no, String number) {
		super();
		this.p_no = p_no;
		this.number = number;
	}
	public ShoppingPayment(String p_no, String thumbnail, String p_name, String p_color, String p_size,
			int retail_price, int dc_rate, int p_price, int p_point, String number) {
		super();
		this.p_no = p_no;
		this.thumbnail = thumbnail;
		this.p_name = p_name;
		this.p_color = p_color;
		this.p_size = p_size;
		this.retail_price = retail_price;
		this.dc_rate = dc_rate;
		this.p_price = p_price;
		this.p_point = p_point;
		this.number = number;
	}
	public String getP_no() {
		return p_no;
	}
	public void setP_no(String p_no) {
		this.p_no = p_no;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
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
	public int getRetail_price() {
		return retail_price;
	}
	public void setRetail_price(int retail_price) {
		this.retail_price = retail_price;
	}
	public int getDc_rate() {
		return dc_rate;
	}
	public void setDc_rate(int dc_rate) {
		this.dc_rate = dc_rate;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public int getP_point() {
		return p_point;
	}
	public void setP_point(int p_point) {
		this.p_point = p_point;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ShoppingPayment [p_no=" + p_no + ", thumbnail=" + thumbnail + ", p_name=" + p_name + ", p_color="
				+ p_color + ", p_size=" + p_size + ", retail_price=" + retail_price + ", dc_rate=" + dc_rate
				+ ", p_price=" + p_price + ", p_point=" + p_point + ", number=" + number + "]";
	}
	
	
}
