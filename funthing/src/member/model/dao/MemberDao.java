package member.model.dao;

import static common.JDBCTemplate.close;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import member.model.vo.Member;
import member.model.vo.MemberPoint;
import member.model.vo.MemberReview;
import member.model.vo.MemberShoppingBag;
import payment.model.vo.OrderUpdate;

public class MemberDao {

	Properties prop = new Properties();
	
	public MemberDao() {
		String fileName = MemberDao.class.getResource("/sql/member/member-query.properties").getPath();
		
		try {
			
			prop.load(new FileReader(fileName));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 로그인
	public Member loginMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginMember = null;
		
//		String query = prop.getProperty("loginMember");
		String query = "SELECT * FROM MEMBER WHERE M_ID=? AND M_PWD=?";
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getmId());
			pstmt.setString(2, member.getmPwd());
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				
				loginMember = new Member(rset.getString("M_NO"),
										 rset.getString("M_ID"),
										 rset.getString("M_PWD"),
										 rset.getString("M_NAME"),
										 rset.getString("B_DAY"),
										 rset.getString("M_EMAIL"),
										 rset.getDate("JOIN_DATE"),
										 rset.getString("REFERENCE"),
										 rset.getString("GRADE_CODE"),
										 rset.getString("ALARM_YN"),
										 rset.getString("STATUS_YN"),
										 rset.getInt("M_POINT"),
										 rset.getString("M_TELL"),
										 rset.getInt("H_POINT"));
			}
//			System.out.println(loginMember);
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return loginMember;
	}
	
	// 아이디 찾기
	public Member searchIdMember(Connection conn, Member member) {
		System.out.println("Dao단 까지 옴");
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member searchIdMember = null;
		
		String query = "SELECT * FROM MEMBER WHERE M_NAME=? AND (M_EMAIL=? OR M_TELL=?)";
						
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getmName());
			pstmt.setString(2, member.getmEmail());
			pstmt.setString(3, member.getmTell());
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				searchIdMember = new Member(rset.getString("M_NO"),
											 rset.getString("M_ID"),
											 rset.getString("M_PWD"),
											 rset.getString("M_NAME"),
											 rset.getString("B_DAY"),
											 rset.getString("M_EMAIL"),
											 rset.getDate("JOIN_DATE"),
											 rset.getString("REFERENCE"),
											 rset.getString("GRADE_CODE"),
											 rset.getString("ALARM_YN"),
											 rset.getString("STATUS_YN"),
											 rset.getInt("M_POINT"),
											 rset.getString("M_TELL"),
											 rset.getInt("H_POINT"));
			}
			
			System.out.println(searchIdMember);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return searchIdMember;
	}
	// 비밀번호 찾기
	public Member searchPwd(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member searchPwd = null;
		
		String query = "SELECT * FROM MEMBER WHERE M_ID=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			while(rset.next()) {
				searchPwd = new Member(rset.getString("M_NO"),
						 rset.getString("M_ID"),
						 rset.getString("M_PWD"),
						 rset.getString("M_NAME"),
						 rset.getString("B_DAY"),
						 rset.getString("M_EMAIL"),
						 rset.getDate("JOIN_DATE"),
						 rset.getString("REFERENCE"),
						 rset.getString("GRADE_CODE"),
						 rset.getString("ALARM_YN"),
						 rset.getString("STATUS_YN"),
						 rset.getInt("M_POINT"),
						 rset.getString("M_TELL"),
						 rset.getInt("H_POINT"));
			}
			System.out.println(searchPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return searchPwd;
	}
	// myPage 회원 정보 창
	public Member selectMember(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginMember = null;
		
		String query = "SELECT M_NO, M_ID, M_PWD, M_NAME, M_EMAIL, M_TELL, TO_CHAR(B_DAY,'YYYY/MM/DD'), JOIN_DATE, REFERENCE, GRADE_CODE, ALARM_YN, STATUS_YN, M_POINT, H_POINT FROM MEMBER WHERE M_ID=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				loginMember = new Member(rset.getString("M_NO"),
										 rset.getString("M_ID"),
										 rset.getString("M_PWD"),
										 rset.getString("M_NAME"),
										 rset.getString("TO_CHAR(B_DAY,'YYYY/MM/DD')"),
										 rset.getString("M_EMAIL"),
										 rset.getDate("JOIN_DATE"),
										 rset.getString("REFERENCE"),
										 rset.getString("GRADE_CODE"),
										 rset.getString("ALARM_YN"),
										 rset.getString("STATUS_YN"),
										 rset.getInt("M_POINT"),
										 rset.getString("M_TELL"),
										 rset.getInt("H_POINT"));
			}
			System.out.println(loginMember);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		
		return loginMember;
	}
	// 회원 가입
	public int insertMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "INSERT INTO MEMBER VALUES('M'||SEQ_MEM.NEXTVAL,?,?,?,TO_CHAR(TO_DATE(?,'YYYY/MM/DD'),'YY/MM/DD'),?,SYSDATE,?,'G1',?,'Y',10000,?,10000)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getmId());
			pstmt.setString(2, member.getmPwd());
			pstmt.setString(3, member.getmName());
			pstmt.setString(4, member.getbDay());
			pstmt.setString(5, member.getmEmail());
			pstmt.setString(6, member.getReference());
			pstmt.setString(7, member.getAlarm_YN());
			pstmt.setString(8, member.getmTell());
			
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	// 아이디 중복 체크
	public int idCheck(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int result = 0;
		
		String query = "SELECT COUNT(*) FROM MEMBER WHERE M_ID=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		return result;
	}
	
	// 회원 정보 수정 update
	public int updateMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "UPDATE MEMBER SET M_ID=?,M_NAME=?,B_DAY=TO_CHAR(TO_DATE(?,'YYYY/MM/DD'),'YY/MM/DD'),M_EMAIL=?,M_TELL=? WHERE M_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getmId());
			pstmt.setString(2, member.getmName());
			pstmt.setString(3, member.getbDay());
			pstmt.setString(4, member.getmEmail());
			pstmt.setString(5, member.getmTell());
			pstmt.setString(6, member.getmNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	public int InsertShoppingBagsql(String sql, Connection conn) {
	      int result=0;
	      Statement sm=null;
	      try {
	         sm=conn.createStatement();
	         result = sm.executeUpdate(sql);
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      return result;
	   }
	   public int getshoppingbagCount(Connection conn, String userNo) {
	      Statement stmt =null;
	      ResultSet rset = null;
	      int noticeCount=0;
	      
	      
	      try {          
	         if(userNo != null) {
	               
	            String query = "SELECT COUNT(*) FROM SHOPPINGBAG  WHERE M_NO LIKE '%"+userNo+"%'";
	            stmt =conn.createStatement();
	            rset=stmt.executeQuery(query);
	            if(rset.next()) {
	               noticeCount = rset.getInt(1);
	            }
	            
	         }else {
	            String query = "SELECT COUNT(*) FROM SHOPPINGBAG";
	            stmt =conn.createStatement();
	            rset=stmt.executeQuery(query);
	            if(rset.next()) {
	               noticeCount = rset.getInt(1);
	            }
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	         close(stmt);
	         close(rset);
	      }
	      
	      return noticeCount;
	   }


	public ArrayList<MemberShoppingBag> selectshoppingbaglist(String userId, Connection conn) {
		ArrayList<MemberShoppingBag> al = new ArrayList<MemberShoppingBag>();
		
		Statement sm = null;
		ResultSet rs = null;
		String query3 = "SELECT M_NO FROM MEMBER WHERE M_ID="+userId;
		String mno=null;
		try {
			sm=conn.createStatement();
			rs=sm.executeQuery(query3);
			mno=rs.getString("M_NO");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Statement stmt = null;
		ResultSet rset = null;
		String query ="SELECT * FROM SHOPPINGBAG WHERE M_NO ="+mno;
		
		try {
			stmt=conn.createStatement();
			rset=stmt.executeQuery(query);
			while(rset.next()) {
				String query2="SELECT THUMBNAIL,P_NAME,P_POINT,P_PRICE FROM PRODUCT WHERE P_NO ="+rset.getString("P_NO");
				
				Statement stmt2=conn.createStatement();
				ResultSet rset2=stmt2.executeQuery(query2);
				MemberShoppingBag msb = new MemberShoppingBag(rset2.getString("P_NAME"), rset2.getString("THUMBNAIL"), rset2.getInt("P_POINT"), rset.getInt("SHBAG_NUM"), rset2.getInt("P_PRICE"));
				al.add(msb);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	
	// 메일 인증(회원 메일 가져오기)
	public Member memberEmail(Connection conn, String email) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member memberEmail = null;
		
		String query = "SELECT M_NO, M_ID, M_PWD, M_NAME, M_EMAIL, M_TELL, TO_CHAR(B_DAY,'YYYY/MM/DD'), JOIN_DATE, REFERENCE, GRADE_CODE, ALARM_YN, STATUS_YN, M_POINT, H_POINT FROM MEMBER WHERE M_EMAIL=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, email);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				memberEmail = new Member(rset.getString("M_NO"),
										 rset.getString("M_ID"),
										 rset.getString("M_PWD"),
										 rset.getString("M_NAME"),
										 rset.getString("TO_CHAR(B_DAY,'YYYY/MM/DD')"),
										 rset.getString("M_EMAIL"),
										 rset.getDate("JOIN_DATE"),
										 rset.getString("REFERENCE"),
										 rset.getString("GRADE_CODE"),
										 rset.getString("ALARM_YN"),
										 rset.getString("STATUS_YN"),
										 rset.getInt("M_POINT"),
										 rset.getString("M_TELL"),
										 rset.getInt("H_POINT"));
			}
			System.out.println("memberEmail : " +   memberEmail);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		
		return memberEmail;
	}

	public Member memberSend(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member memberSend = null;
		
		String query = "SELECT M_NO, M_ID, M_PWD, M_NAME, M_EMAIL, M_TELL, TO_CHAR(B_DAY,'YYYY/MM/DD'), JOIN_DATE, REFERENCE, GRADE_CODE, ALARM_YN, STATUS_YN, M_POINT, H_POINT FROM MEMBER WHERE M_ID=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				memberSend = new Member(rset.getString("M_NO"),
										 rset.getString("M_ID"),
										 rset.getString("M_PWD"),
										 rset.getString("M_NAME"),
										 rset.getString("TO_CHAR(B_DAY,'YYYY/MM/DD')"),
										 rset.getString("M_EMAIL"),
										 rset.getDate("JOIN_DATE"),
										 rset.getString("REFERENCE"),
										 rset.getString("GRADE_CODE"),
										 rset.getString("ALARM_YN"),
										 rset.getString("STATUS_YN"),
										 rset.getInt("M_POINT"),
										 rset.getString("M_TELL"),
										 rset.getInt("H_POINT"));
			}
			System.out.println("memberSend : " +   memberSend);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		
		return memberSend;
	}
	
	// 비밀번호 변경(update)
	public int updatePwd(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		int result = 0;
		System.out.println("Dao는 왔니");
		System.out.println("M_Id : " + member.getmId());
		System.out.println("M_PWD : " + member.getmPwd());
		String query = "UPDATE MEMBER SET M_PWD=? WHERE M_ID=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getmPwd());
			pstmt.setString(2, member.getmId());
			
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println("DAO : " + result);
		return result;
	}

	   public ArrayList<MemberShoppingBag> selectshoppingbaglist(String userNo, Connection conn, ArrayList<String> list1, ArrayList<Integer> list2) {
	      ArrayList<MemberShoppingBag> al = new ArrayList<MemberShoppingBag>();
	      try {


	         for(int i=0;i<list1.size();i++) {            
	               String query2="SELECT 	P_NO,THUMBNAIL,P_NAME,P_POINT,P_PRICE FROM PRODUCT WHERE P_NO ='"+list1.get(i)+"'";   
	               Statement stmt2=conn.createStatement();
	               ResultSet rset2=stmt2.executeQuery(query2);
	               if(rset2.next()) {
	               MemberShoppingBag msb = new MemberShoppingBag(rset2.getString("P_NAME"), rset2.getString("THUMBNAIL"), rset2.getInt("P_POINT"),list2.get(i), rset2.getInt("P_PRICE"));
	               msb.setP_no(rset2.getString("P_NO"));
	               al.add(msb);            
	               }
	         }
	         
	         
	         
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      return al;
	   }


	   public String InsertShoppingbag(String p_no, Connection conn, int number, String userNo) {
	      
	      String b_no= null;
	      String p_name=null;
	      int p_price=0;
	      ResultSet rset=null;
	      Statement sm = null;
	      String quary = "SELECT B_NO,P_NAME,P_PRICE FROM PRODUCT WHERE P_NO ='"+p_no+"'";
	      try {
	         sm=conn.createStatement();
	         rset=sm.executeQuery(quary);
	         while(rset.next()) {
	         b_no = rset.getString("B_NO");
	         p_name = rset.getString("P_NAME");
	         p_price = rset.getInt("P_PRICE");
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
	      
	      String quary1 = "INSERT INTO SHOPPINGBAG VALUES('"+userNo+"','"+p_no+"','"+b_no+"','"+p_name+"',"+number+","+p_price+")";
	      
	      
	      return quary1;
	   }

	   public int DeleteShoppingbag(Connection conn, String[] check) {
	      int result=0;
	      
	         Statement stmt =null;
	         String quary = null;
	         try {
	            for(int i =0;i<check.length;i++) {
	               stmt=conn.createStatement();
	               quary ="DELETE  FROM SHOPPINGBAG WHERE P_NAME ='"+check[i]+"'";
	               System.out.println(quary);
	            result+=stmt.executeUpdate(quary);
	            }
	         } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	         
	         
	      
	      return result;
	   }

	   public ArrayList<String> selectshoppingbaglist2(String userNo, Connection conn) {
	      ArrayList<String> list = new ArrayList<String>();
	      Statement stmt = null;
	      ResultSet rset = null;
	      String query ="SELECT P_NO FROM SHOPPINGBAG WHERE M_NO ='"+userNo+"'";
	      try {
	         stmt=conn.createStatement();
	         rset=stmt.executeQuery(query);
	         while(rset.next()) {
	            list.add(rset.getString("P_NO"));
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
	      return list;
	   }

	   public ArrayList<Integer> selectshoppingbaglist3(String userNo, Connection conn) {
	      Statement stmt3 = null;
	      ResultSet rset3 = null;
	      String query11 = "SELECT SHBAG_NUM FROM SHOPPINGBAG WHERE M_NO ='"+userNo+"'";
	      ArrayList<Integer> list2 = new ArrayList<Integer>();
	      
	      try {
	         stmt3=conn.createStatement();
	         rset3=stmt3.executeQuery(query11);
	         while(rset3.next()) {
	            list2.add(rset3.getInt("SHBAG_NUM"));
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
	      return list2;
	   }

	
	// 마이페이지 회원 이름, 등급, 적립금 내역 가져오기_희지
	public MemberPoint memberInfo(Connection conn, String userNoM) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		MemberPoint mp  = null;
		
		String query = "SELECT M.M_NAME, G.GRADE_NAME, M.M_POINT \r\n" + 
				"FROM MEMBER M\r\n" + 
				"    JOIN GRADE G ON(M.GRADE_CODE = G.GRADE_CODE)\r\n" + 
				"WHERE M_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userNoM);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				mp = new MemberPoint(rset.getInt("M_POINT"),
						rset.getString("GRADE_NAME"),
						rset.getString("M_NAME"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		return mp;
	}

	

	public MemberPoint paymentMemberSearch(Connection conn, String userNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		MemberPoint m = null;
		
		String query = "SELECT M_NO, M_POINT, M.GRADE_CODE, POINT_RATE\r\n" + 
				"FROM MEMBER M\r\n" + 
				"JOIN GRADE G ON M.GRADE_CODE = G.GRADE_CODE\r\n" + 
				"WHERE M_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userNo);
			rset = pstmt.executeQuery();
			
			while(rset.next())
			{
				m = new MemberPoint();
				m.setmNo(rset.getString("m_no"));
				m.setmPoint(rset.getInt("m_point"));
				m.setGrade_code(rset.getString("grade_code"));
				m.setPoint_rate(rset.getDouble("point_rate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return m;
	}

	
	// 마이 페이지 최근 주문 목록 리스트 카운트_희지
	public int currentListCount(Connection conn, String userNoM) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int currentListCount = 0;
		System.out.println("dao에서 userNoM : " + userNoM);
		
		String query = "SELECT COUNT(*) \r\n" + 
				"FROM ORDER_LIST \r\n" + 
				"WHERE M_NO =? AND TO_DATE(O_DATE,'RRRR/MM/DD')>= TO_DATE(SYSDATE,'RRRR/MM/DD') -30";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userNoM);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				currentListCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		
		System.out.println("dao에서 리스트 카운트 : " + currentListCount);
		return currentListCount;
	}
	
	
	// 마이 페이지 최근 주문 목록 select_희지
	public ArrayList<OrderUpdate> selectCurrentOrderList(Connection conn, int currentPage, int limit, String userNoM) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		OrderUpdate co = null;
		
		ArrayList<OrderUpdate> coList = new ArrayList<>();
		System.out.println("memberDao 에서 currentPage, limit, userNo : " + currentPage + limit + userNoM);
		
		int startRow = (currentPage -1) * limit +1;
		int endRow = startRow + (limit -1);
		
		String query = " SELECT THUMBNAIL, P_NAME, P_COLOR, P_SIZE,  TOTAL_PRICE, O_NO, O_DATE,RCV_NAME, rcv_adrs, rcv_phone, COMMENTT, M_NO ,PRCS_STATUS,CANCEL_YN, O_NUM "
				+ " FROM(SELECT ROWNUM RNUM,PD.THUMBNAIL,PD.P_NAME, PD.P_COLOR, PD.P_SIZE,  PI.TOTAL_PRICE, PO.O_NO, PI.O_DATE,PI.RCV_NAME, PI.RCV_ADRS, PI.RCV_PHONE, PI.COMMENTT, M.M_NO, J.PRCS_STATUS, J.CANCEL_YN, PO.O_NUM "
				+ " FROM PRODUCT_ORDER PO "
				+ " JOIN PAYMENT_INFO PI ON PO.O_NO = PI.O_NO "
				+ " JOIN JUMUN J ON PO.O_NO = J.O_NO "
				+ " JOIN PRODUCT PD ON PO.P_NO = PD.P_NO "
				+ " JOIN MEMBER M ON PI.M_NO = M.M_NO "
				+ " WHERE M.M_NO= ?) " 
				+ " WHERE RNUM BETWEEN ? AND ? " ;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userNoM);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			
			rset = pstmt.executeQuery();
			
			
			while(rset.next()) {
				/* System.out.println("while(rset.next())"); */
				
				co = new OrderUpdate(
									rset.getString("THUMBNAIL"),
									rset.getString("P_NAME"),
									rset.getString("P_COLOR"),
									rset.getString("P_SIZE"),
									rset.getInt("TOTAL_PRICE"),
									rset.getString("O_NO"),
									rset.getDate("O_DATE"),
									rset.getString("RCV_NAME"),
									rset.getString("RCV_ADRS"),
									rset.getInt("RCV_PHONE"),
									rset.getString("COMMENTT"),
									rset.getString("M_NO"),
									rset.getString("PRCS_STATUS"),
									rset.getString("CANCEL_YN"),
									rset.getInt("O_NUM"));
				
				coList.add(co);
			}
				
			System.out.println("Dao에서 coList : " + coList);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		return coList;
	}

	public int getReviewCount(Connection conn, String search, String mNo) {
	      Statement stmt =null;
	      ResultSet rset = null;
	      int noticeCount=0;
	      
	      
	      try {          
	         if(search != null) {
	               
	            String query = "SELECT COUNT(*) FROM REVIEW  WHERE REV_TITLE LIKE '%"+search+"%' AND M_NO='"+mNo+"'";
	            stmt =conn.createStatement();
	            rset=stmt.executeQuery(query);
	            if(rset.next()) {
	               noticeCount = rset.getInt(1);
	            }
	            
	         }else {
	            String query = "SELECT COUNT(*) FROM REVIEW WHERE M_NO='"+mNo+"'";
	            stmt =conn.createStatement();
	            rset=stmt.executeQuery(query);
	            if(rset.next()) {
	               noticeCount = rset.getInt(1);
	            }
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	         close(stmt);
	         close(rset);
	      }
	      
	      return noticeCount;
	   }

	   public ArrayList<MemberReview> ReviewSelectList(Connection conn, String search, int currentPage, int limit,
	         String mNo) {
	      ArrayList<MemberReview> al = new ArrayList<MemberReview>();
	      try {
	      if(search != null) {
	         PreparedStatement pstmt = null;
	         String quary = "SELECT * FROM ( SELECT RATE,ROWNUM RN,REV_NO,M_NO,REV_TITLE,P_NO,REV_CONTENTS,REV_DATE FROM REVIEW   WHERE REV_TITLE LIKE '%"+search+"%' AND M_NO='"+mNo+"' ORDER BY REV_NO ASC) where RN >= ? AND RN<=?";
	         int startRow =(currentPage -1)*limit +1;
	         int endRow = startRow + limit -1;
	         pstmt = conn.prepareStatement(quary);
	         pstmt.setInt(1, startRow);
	         pstmt.setInt(2, endRow);
	         ResultSet rs = pstmt.executeQuery();
	         while(rs.next()) {
	            MemberReview nt = new MemberReview(rs.getInt("RN"),rs.getString("m_no"), rs.getString("REV_TITLE"), rs.getString("P_NO"),rs.getString("REV_CONTENTS"),rs.getString("REV_DATE"),rs.getInt("rate"));   
	            al.add(nt);
	         }
	      }else{
	         PreparedStatement pstmt = null;
	         String quary = "SELECT * FROM ( SELECT RATE,ROWNUM RN,REV_NO,M_NO,REV_TITLE,P_NO,REV_CONTENTS,REV_DATE FROM REVIEW  WHERE  M_NO='"+mNo+"' ORDER BY REV_NO ASC) where RN >= ? AND RN<=?";
	         int startRow =(currentPage -1)*limit +1;
	         int endRow = startRow + limit -1;
	         System.out.println("여기까진 가냐?");
	         pstmt = conn.prepareStatement(quary);
	         pstmt.setInt(1, startRow);
	         pstmt.setInt(2, endRow);
	         ResultSet rs = pstmt.executeQuery();
	         while(rs.next()) {
	            MemberReview nt = new MemberReview(rs.getInt("RN"),rs.getString("M_NO"), rs.getString("REV_TITLE"), rs.getString("P_NO"),rs.getString("REV_CONTENTS"),rs.getString("REV_DATE"),rs.getInt("RATE"));         
	            al.add(nt);
	         }
	   
	      }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }

	      return al;
	   }
	   
	


}
