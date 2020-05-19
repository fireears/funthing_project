package women.model.vo;

public class WomenVo {
	private String p_name;
	private String p_type;
	private String thumbnail;
	private int o_price;
	private int dc_rate;
	private int p_price;
	
	public WomenVo(String p_name, String p_type, String thumbnail, int o_price, int dc_rate, int p_price) {
		super();
		this.p_name = p_name;
		this.p_type = p_type;
		this.thumbnail = thumbnail;
		this.o_price = o_price;
		this.dc_rate = dc_rate;
		this.p_price = p_price;
	}
	@Override
	public String toString() {
		return "WomenVo [p_no=" + p_name + ", p_type=" + p_type + ", tumbnail=" + thumbnail + ", o_price=" + o_price
				+ ", dc_rate=" + dc_rate + ", p_price=" + p_price + "]";
	}
	public String getTumbnail() {
		return thumbnail;
	}
	public void setTumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public int getO_price() {
		return o_price;
	}
	public void setO_price(int o_price) {
		this.o_price = o_price;
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
	
	
	

}
