
package personalQnA.model.vo;

import java.sql.Date;

public class PersonalQnA {


		private int perNo;
		private String perTitle;
		private String perContents;
		private String pNo;
		private String bNo;
		private String mNo;
		private String perReYn;
		private String addfile;
		private String oNo;
		private String perCate;
		private Date perDate;
		
		
		public PersonalQnA() {
		}


		public PersonalQnA(int perNo, String perTitle, String perContents, String pNo, String bNo, String mNo,
				String perReYn, String addfile, String oNo, String perCate, Date perDate) {
			this.perNo = perNo;
			this.perTitle = perTitle;
			this.perContents = perContents;
			this.pNo = pNo;
			this.bNo = bNo;
			this.mNo = mNo;
			this.perReYn = perReYn;
			this.addfile = addfile;
			this.oNo = oNo;
			this.perCate = perCate;
			this.perDate = perDate;
		}


		public int getPerNo() {
			return perNo;
		}


		public void setPerNo(int perNo) {
			this.perNo = perNo;
		}


		public String getPerTitle() {
			return perTitle;
		}


		public void setPerTitle(String perTitle) {
			this.perTitle = perTitle;
		}


		public String getPerContents() {
			return perContents;
		}


		public void setPerContents(String perContents) {
			this.perContents = perContents;
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


		public String getmNo() {
			return mNo;
		}


		public void setmNo(String mNo) {
			this.mNo = mNo;
		}


		public String getPerReYn() {
			return perReYn;
		}


		public void setPerReYn(String perReYn) {
			this.perReYn = perReYn;
		}


		public String getAddfile() {
			return addfile;
		}


		public void setAddfile(String addfile) {
			this.addfile = addfile;
		}


		public String getoNo() {
			return oNo;
		}


		public void setoNo(String oNo) {
			this.oNo = oNo;
		}


		public String getPerCate() {
			return perCate;
		}


		public void setPerCate(String perCate) {
			this.perCate = perCate;
		}


		public Date getPerDate() {
			return perDate;
		}


		public void setPerDate(Date perDate) {
			this.perDate = perDate;
		}


		@Override
		public String toString() {
			return "PersonalQnA [perNo=" + perNo + ", perTitle=" + perTitle + ", perContents=" + perContents + ", pNo="
					+ pNo + ", bNo=" + bNo + ", mNo=" + mNo + ", perReYn=" + perReYn + ", addfile=" + addfile + ", oNo="
					+ oNo + ", perCate=" + perCate + ", perDate=" + perDate + "]";
		}
		
		
		
		
		

	}

