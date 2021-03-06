package admin.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import admin.model.dao.AdminDao;
import admin.model.vo.ProductStatic;
import admin.model.vo.SalesManage;
import brand.model.vo.Brand;
import member.model.vo.Member;
import member.model.vo.MemberPoint;
import payment.model.vo.OrderInfo;
import payment.model.vo.OrderInfoDetail;
import personalQnA.model.vo.AdmimPersonalQna;
import personalQnA.model.vo.PersonalQnaReply;
import product.model.vo.Product;
import productQnA.model.vo.AdminProductQnA;
import productQnA.model.vo.ProductQnAReply;
import review.model.vo.Review;
public class AdminService {
	
	
	public int getListCount() {
	 	
		Connection conn = getConnection();
		
		AdminDao aDao = new AdminDao();
		
		int listCount = aDao.getListCount(conn);
		
		close(conn);
		return listCount;
	}

	public ArrayList<Product> selectProductList(int currentPage, int limit) {

		ArrayList<Product> list = new ArrayList<>();
		AdminDao aDao = new AdminDao();
		
		Connection conn = getConnection();
		
		list = aDao.selectProductList(conn, currentPage, limit);
		
		close(conn);
		return list;
	}

	// 주문관리 페이지 검색_혜린	
	public ArrayList<OrderInfo> selectOrderSearch(int currentPage, int limit, String searchKind, String searchText) {
		Connection conn = getConnection();
		
		ArrayList<OrderInfo> searchList = new AdminDao().selectOrderSearch(conn, currentPage, limit,searchKind, searchText);
		
		close(conn);
		
		return searchList;
		
	}

	// 주문관리 페이지_혜린	
	public int getOrderListCount(String searchKind, String searchText) {

		Connection conn = getConnection();
		
		AdminDao aDao = new AdminDao();
		
		int listCount = aDao.getOrderListCount(conn, searchKind,searchText);
		
		close(conn);
		
		return listCount;
		
	}
	
	// 주문관리 페이지 상세보기_혜린
	public OrderInfoDetail selectOrderDetail(String oNo) {
		Connection conn = getConnection();
		OrderInfoDetail od = new AdminDao().selectOrderDetail(conn,oNo);
		
		close(conn);
		
		
		return od;
		
	}
	//  상품문의 페이지_혜린
	public int getListQnaCount(String searchKind, String searchText) {
		Connection  conn = getConnection();
		int result = new AdminDao().getListQnaCount(conn,searchText,searchKind);
		
		close(conn);
		return result;
	}

	// 상품문의 페이지 검색_혜린
	public ArrayList<AdminProductQnA> selectTenProductQnaList(int currentPage, int limit, String searchKind ,String searchText ) {
		Connection conn = getConnection(); 
		ArrayList<AdminProductQnA> list = new AdminDao().selectTenProductQnaList(conn,currentPage, limit, searchKind,searchText);
		
		close(conn);
		return list;
	}

	public Product selectOneProductDetail(String pNo) {
		Connection conn = getConnection();
		Product product = new AdminDao().selectOneProductDetail(conn, pNo);
		
		close(conn);
		return product;
	}

	public int productDelete(String pNo) {
		Connection conn = getConnection();
		
		int result = new AdminDao().productDelete(conn, pNo);
		
		if(result > 0)
		{
			commit(conn);
		}
		else
		{
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int productUpdate(Product p, String pNo) {
		Connection conn = getConnection();
		
		int result = new AdminDao().productUpdate(conn, p, pNo);
		
		if(result > 0)
		{
			commit(conn);
		}
		else
		{
			rollback(conn);
		}
		close(conn);
		return result;
	}

	// 상품문의 댓글 페이지_혜린
	public ArrayList<ProductQnAReply> insertReply(ProductQnAReply r) {
		Connection conn = getConnection();
		
		// BoardDao 메소드 두개를 호출하기 때문에 그냥 참조변수로 선언하자
		AdminDao bDao = new AdminDao();
		
		int result = bDao.insertReply(conn, r);
		// BoardDao로 가서 insertReply 메소드 완성시키고오자
		
		
		ArrayList<ProductQnAReply> rlist = null;
		
		if(result > 0) {
			commit(conn);
			rlist = bDao.selectReplyList(conn, r.getQnaNo());
		}else {
			rollback(conn);
		}
		close(conn);
		return rlist;
	}

	
	// 브랜드 관리자 페이지(리스트 카운트 메소드)_희지
	public int getBrandListCount() {
		
		Connection conn = getConnection();
		
		int brandListCount = new AdminDao().getBrandListCount(conn);
		
		close(conn);
		
		return brandListCount;
	}

	
	// 브랜드 관리자 페이지(브랜드 조회하는 메소드)_희지
	public ArrayList<Brand> selectBrandList(int currentPage, int limit) {
		
		Connection conn = getConnection();
		
		ArrayList<Brand> brandList = new AdminDao().selectBrandList(conn, currentPage, limit);
		
		close(conn);
		
		return brandList;
	}

	
	// 브랜드 등록 페이지(정보 insert 메소드)_희지
	public int insertBrand(Brand b) {
		Connection conn = getConnection();
		
		int result = new AdminDao().insertBrand(conn, b);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	
	// 브랜드 update위해 한 브랜드 정보 select_희지
	public Brand selectOneBrand(String bNo) {
		Connection conn = getConnection();
		
		Brand brand = new AdminDao().selectOneBrand(conn, bNo);
		
		close(conn);
		
		
		return brand;
	}

	
	// 브랜드 update_희지
	public int updateBrand(Brand b, String bNo) {
		Connection conn = getConnection();
		
		int result = new AdminDao().updateBrand(conn, b, bNo);
		
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	
	// 브랜드 delete_희지
	public int brandDelete(String bNo) {
		Connection conn = getConnection();
		
		int result = new AdminDao().deleteBrand(conn, bNo);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
	
	// 회원list select_진교 
	public ArrayList<Member> selectList(int currentPage, int limit, String userName, String userId) {
		Connection conn = getConnection();
		
		ArrayList<Member> list = new AdminDao().selectList(conn, currentPage, limit, userName, userId);
		
		close(conn);
		
		return list;
	}



	// 1:1문의 페이지 검색_햬린
	public ArrayList<AdmimPersonalQna> selectTenPersonQnaList(int currentPage, int limit, String searchKind,String searchText) {
		Connection conn = getConnection(); 
		ArrayList<AdmimPersonalQna> list = new AdminDao().selectTenPersonQnaList(conn,currentPage, limit , searchKind,searchText);
		
		close(conn);
		
		
		return list;
	}

	public int insertPersonalReply(PersonalQnaReply re) {
		Connection conn = getConnection();
		
		int result = new AdminDao().insertMember(conn,re);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;	}






	// 브랜드 search_희지
	public ArrayList<Brand> searchBrand(int currentPage, int limit, String searchKind, String searchVal) {
		Connection conn = getConnection();
		
		ArrayList<Brand> list = new AdminDao().searchBrand(conn, currentPage, limit, searchKind, searchVal);
	
		close(conn);
		
		
		return list;
	}

	

	public int productInsert(Product p) {
		Connection conn = getConnection();
		
		int result = new AdminDao().productInsert(conn, p);
		
		if(result > 0)
		{
			commit(conn);
		}
		else
		{
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	// 1:1문의 페이지_혜린
	public int getListPerQnaCount(String searchKind, String searchText) {
		Connection  conn = getConnection();
		int result = new AdminDao().getListPerQnaCount(conn,searchText,searchKind);
		
		close(conn);
		return result;

	}


	public ArrayList<Product> productSearch(int currentPage, int limit, Product p) {
		Connection conn = getConnection();
		
		ArrayList<Product> plist = new ArrayList<>();
		
		plist = new AdminDao().Productsearch(conn, p , currentPage, limit);
		
		close(conn);
		return plist;

	}
	
	// 회원 리스트-회원 정보_진교
	public Member selectMember(String userId) {
		Connection conn = getConnection();
		
		Member selectMember = new AdminDao().selectMember(conn,userId);
		
		close(conn);
		
		return selectMember;
	}
	
	// 회원 리스트- 회원 정보 update_진교
	public int updateMember(Member member) {
		Connection conn = getConnection();
		
		int result = new AdminDao().updateMember(conn, member);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		} 
		close(conn);
		
		return result;
	}
	
	// 회원 페이지_진교
	public int getMemberListCount(String userName, String userId) {
		Connection conn = getConnection();
		
		AdminDao aDao = new AdminDao();
		
		int result = aDao.getMemberListCount(conn, userName, userId);
		
		close(conn);
		
		return result;
		
	}

	public int getListCount(Product p) {
		Connection conn = getConnection();
		
		int listCount = new AdminDao().getListCount(conn, p);
		
		close(conn);
		return listCount;
		
	}
	// 상품문의 관리자페이지 답변_혜린
	public int insertProductReply(AdminProductQnA re) {
		Connection conn = getConnection();
		
		int result = new AdminDao().insertProductRe(conn,re);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;	
	}

	// 리뷰 조회 카운트 * 서윤
		public int getRvListCount(String searchpName) {
			Connection conn = getConnection();
			
			AdminDao aDao = new AdminDao();

			int rvListCont = aDao.getRvListCount(conn,searchpName);
			
			close(conn);

			return rvListCont;
		}

		public ArrayList<Review> selectReviewLIst(int currentPage, int limit, String searchpName) {
			ArrayList<Review> rvList = new ArrayList<>();
			AdminDao aDao = new AdminDao();
			
			Connection conn = getConnection();
			
			rvList = aDao.selectReviewList(conn, currentPage, limit, searchpName);
			
			
			close(conn);
			
			return rvList;
		}

		public ArrayList<ProductStatic> searchProduct(ProductStatic pStatic) {
			System.out.println("service");
			Connection conn = getConnection();
			ArrayList<ProductStatic> list = new ArrayList<>();
			
			list = new AdminDao().searchProduct(conn, pStatic);
			
			close(conn);
			return list;
		}


		public ArrayList<SalesManage> searchSales(SalesManage sManage) {
			Connection conn = getConnection();
			ArrayList<SalesManage> list = new ArrayList<>();
			
			list = new AdminDao().searchSales(conn, sManage);
			
			close(conn);
			return list;
		}

		
		// 리뷰 디테일 * 서윤
		public Review reviewDatail(int revNo) {
			Connection conn = getConnection();
			Review rv = new AdminDao().reviewDetail(conn,revNo);			

			close(conn);
			
			return rv;
		}
		
		// 적립금 관리자 페이지_희지
		public int getPointListCount(String searchKind, String searchText) {
			Connection conn = getConnection();
			
			int result = new AdminDao().getPointListCount(conn, searchKind, searchText);
			
			close(conn);
			
			
			return result;
		}

		
		// 적립금 관리자 페이지_희지
		public ArrayList<MemberPoint> selectPointList(int currentPage, int limit, String searchKind,
				String searchText) {
			Connection conn = getConnection();
			
			ArrayList<MemberPoint> list = new AdminDao().selectPointList(conn, currentPage, limit, searchKind, searchText);
			
			close(conn);
			
			
			return list;
		}
		//공지사항 삭제 페이지 한솔 
		public int deleteNotice(String[] nNo) {
			Connection conn = getConnection();
			
			int result = new AdminDao().deleteNotice(conn, nNo);
			
			close(conn);
			
			
			return result;
		}

		public ArrayList<Brand> selectBrandNameList() {
			Connection conn = getConnection();
			
			ArrayList<Brand> blist = new ArrayList<>();
			
			blist = new AdminDao().selectBrandNameList(conn);
			
			close(conn);
			return blist;
		}

		public String selectSno() {
			Connection conn = getConnection();
			
			String s_no = new AdminDao().selectSno(conn);
			
			close(conn);
			return s_no;
		}
	
	
}
