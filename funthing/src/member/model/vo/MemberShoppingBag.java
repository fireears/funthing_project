package member.model.vo;

import java.io.Serializable;

public class MemberShoppingBag implements Serializable{

   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   
   private String p_name;
   private String p_thumbnail;
   private int p_point;
   private int shbag_num;
   private int shbag_price;
   private String p_no;
   
   
   public String getP_no() {
      return p_no;
   }
   public void setP_no(String p_no) {
      this.p_no = p_no;
   }


   @Override
   public String toString() {
      return "MemberShoppingBag [p_name=" + p_name + ", p_thumbnail=" + p_thumbnail + ", p_point=" + p_point
            + ", shbag_num=" + shbag_num + ", shbag_price=" + shbag_price + ", p_no=" + p_no + "]";
   }
   public String getP_name() {
      return p_name;
   }
   public void setP_name(String p_name) {
      this.p_name = p_name;
   }
   public String getP_thumbnail() {
      return p_thumbnail;
   }
   public void setP_thumbnail(String p_thumbnail) {
      this.p_thumbnail = p_thumbnail;
   }
   public int getP_point() {
      return p_point;
   }
   public void setP_point(int p_point) {
      this.p_point = p_point;
   }
   public int getShbag_num() {
      return shbag_num;
   }
   public void setShbag_num(int shbag_num) {
      this.shbag_num = shbag_num;
   }
   public int getShbag_price() {
      return shbag_price;
   }
   public void setShbag_price(int shbag_price) {
      this.shbag_price = shbag_price;
   }
   public static long getSerialversionuid() {
      return serialVersionUID;
   }
   public MemberShoppingBag(String p_name, String p_thumbnail, int p_point, int shbag_num, int shbag_price) {
      super();
      this.p_name = p_name;
      this.p_thumbnail = p_thumbnail;
      this.p_point = p_point;
      this.shbag_num = shbag_num;
      this.shbag_price = shbag_price;
   }
   
}