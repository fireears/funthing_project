	// 상품 문의 클라이언트 페이지_혜린
package productQnA.model.vo;

import java.io.Serializable;
import java.util.Date;

public class ProductQnaIn  implements Serializable	{

		/**
	 * 
	 */
	private static final long serialVersionUID = -1008573522184295870L;
		private int qnaNo;			// qna번호
		private String mNo;				// 회원정보
		private String qnaTitle;		// qna제목
		private String qnaContents;		// qna내용
		private Date qnaDate;			// 작성날짜
		private String pNo;				// 상품번호
		private String bNo;				// 브랜드번호
		private String reYn;			// 답변유무
		public ProductQnaIn() {
			super();
		}
		
		public ProductQnaIn(String mNo, String qnaTitle, String qnaContents, String pNo, String bNo) {
			super();
			this.mNo = mNo;
			this.qnaTitle = qnaTitle;
			this.qnaContents = qnaContents;
			this.pNo = pNo;
			this.bNo = bNo;
		}

		public ProductQnaIn(int qnaNo, String mNo, String qnaTitle, String qnaContents, Date qnaDate, String pNo,
				String bNo, String reYn) {
			super();
			this.qnaNo = qnaNo;
			this.mNo = mNo;
			this.qnaTitle = qnaTitle;
			this.qnaContents = qnaContents;
			this.qnaDate = qnaDate;
			this.pNo = pNo;
			this.bNo = bNo;
			this.reYn = reYn;
		}
		public int getQnaNo() {
			return qnaNo;
		}
		public void setQnaNo(int qnaNo) {
			this.qnaNo = qnaNo;
		}
		public String getmNo() {
			return mNo;
		}
		public void setmNo(String mNo) {
			this.mNo = mNo;
		}
		public String getQnaTitle() {
			return qnaTitle;
		}
		public void setQnaTitle(String qnaTitle) {
			this.qnaTitle = qnaTitle;
		}
		public String getQnaContents() {
			return qnaContents;
		}
		public void setQnaContents(String qnaContents) {
			this.qnaContents = qnaContents;
		}
		public Date getQnaDate() {
			return qnaDate;
		}
		public void setQnaDate(Date qnaDate) {
			this.qnaDate = qnaDate;
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
		public String getReYn() {
			return reYn;
		}
		public void setReYn(String reYn) {
			this.reYn = reYn;
		}
		@Override
		public String toString() {
			return "ProductQnaIn [qnaNo=" + qnaNo + ", mNo=" + mNo + ", qnaTitle=" + qnaTitle + ", qnaContents="
					+ qnaContents + ", pNo=" + pNo + ", bNo=" + bNo + ", reYn=" + reYn + "]";
		}
		

}
