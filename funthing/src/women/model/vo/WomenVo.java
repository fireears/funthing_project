package women.model.vo;

public class WomenVo {
	private String p_name;
	private String p_type;
	private String thumbnail;
	private int o_price;
	private int dc_rate;
	private int p_price;
	private String start_date;
	private String end_date;
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
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
		return "WomenVo [p_name=" + p_name + ", p_type=" + p_type + ", thumbnail=" + thumbnail + ", o_price=" + o_price
				+ ", dc_rate=" + dc_rate + ", p_price=" + p_price + ", start_date=" + start_date + ", end_date="
				+ end_date + "]";
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
