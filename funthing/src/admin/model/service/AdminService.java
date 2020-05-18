package admin.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import admin.model.dao.AdminDao;
import brand.model.vo.Brand;
import member.model.vo.Member;
import payment.model.vo.OrderInfo;
import payment.model.vo.OrderInfoDetail;
import personalQnA.model.vo.PersonalQnA;
import personalQnA.model.vo.PersonalQnaReply;
import product.model.vo.Product;
import productQnA.model.vo.AdminProductQnA;
import productQnA.model.vo.ProductQnAReply;
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
	public int getOrderListCount() {

		Connection conn = getConnection();
		
		AdminDao aDao = new AdminDao();
		
		int listCount = aDao.getOrderListCount(conn);
		
		close(conn);
		
		return listCount;
		
	}
	
	// 주문관리 페이지 상세보기_혜린
	public OrderInfoDetail selectOrderDetail(String mid) {
		Connection conn = getConnection();
		OrderInfoDetail od = new AdminDao().selectOrderDetail(conn,mid);
		
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
	
	// 멤버 select_진교 
	public ArrayList<Member> selectList(int currentPage, int limit, String userName, String userId) {
		Connection conn = getConnection();
		
		ArrayList<Member> list = new AdminDao().selectList(conn, currentPage, limit, userName, userId);
		
		close(conn);
		
		return list;
	}



	// 1:1문의 페이지 검색_햬린
	public ArrayList<PersonalQnA> selectTenPersonQnaList(int currentPage, int limit, String searchKind,String searchText) {
		Connection conn = getConnection(); 
		ArrayList<PersonalQnA> list = new AdminDao().selectTenPersonQnaList(conn,currentPage, limit , searchKind,searchText);
		
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
	public int getListPerQnaCount() {
		Connection  conn = getConnection();
		int result = new AdminDao().getListPerQnaCount(conn);
		
		close(conn);
		return result;

	}


	public ArrayList<Product> productSearch(Product p) {
		Connection conn = getConnection();
		
		ArrayList<Product> plist = new ArrayList<>();
		
		plist = new AdminDao().Productsearch(conn, p);
		
		close(conn);
		return plist;

	}


	
	
}
