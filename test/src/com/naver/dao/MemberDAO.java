/*
	DAO(Data Access Object)클래스
	- 데이터베이스와 연동하여 레코드의 추가, 수정, 삭제 작업이 이루어지는 클래스 입니다.
	- 어떤 Action 클래스가 호출되더라도 그에 해당하는 데이터베이스 연동 처리는
		DAO 클래스에서 이루어지게 됩니다.

 */
package com.naver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.sql.DataSource;

import com.naver.vo.Member;

//연지 수정 toString 메소드 추가
public class MemberDAO {
	DataSource ds;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	int result;
	
	
	
	public MemberDAO() {
		try {
			Context init = new InitialContext();
			ds=(DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			
		}catch(Exception ex) {
			System.out.println("DB 연결 실패 : "+ex);
		}
	}
	public int insert(Member m) throws SQLException{
		try {
			con=ds.getConnection();
			System.out.println("getConnection");
			
			pstmt=con.prepareStatement("insert into cookie_member values (?,?,?,sysdate)");
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPass());
			pstmt.setString(3, m.getName());
			
			result=pstmt.executeUpdate();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				}catch(SQLException ex){
					ex.printStackTrace();					
				}
			}
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		return result;
	}
	public int isId(String id, String pass){
		try {
			con=ds.getConnection();
			System.out.println("getConnection");
			
			String sql= "select id, pass from cookie_member where id=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString(2).equals(pass)) {
					result=1;	//아이디와 비밀번호 일치하는 경우	
				}else {
					result=0;	//비밀번호가 일치하지 않는 경우
				}
			}else {
				result=-1;	//아이디가 존재하지 않습니다.
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					pstmt.close();
				}catch(SQLException ex){
					ex.printStackTrace();					
				}
			}
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		return result;
	}
	public Member member_info(String id) {
		Member m = new Member();
		try {
			con=ds.getConnection();
			
			String sql= "select * from cookie_member where id=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				m.setId(rs.getString(1));
				m.setPass(rs.getString(2));
				m.setName(rs.getString(3));
				m.setReg_date(rs.getDate(4));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					pstmt.close();
				}catch(SQLException ex){
					ex.printStackTrace();					
				}
			}
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		return m;
	}
	public List<Member> getList() {
		List<Member> list = new ArrayList<Member>();
		try {
			con=ds.getConnection();
			
			String sql="select * from cookie_member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member m = new Member();
				m.setId(rs.getString("id"));	//컬럼명도 사용 가능
				m.setPass(rs.getString(2));
				m.setName(rs.getString(3));
				m.setReg_date(rs.getDate(4));
				list.add(m);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					pstmt.close();
				}catch(SQLException ex){
					ex.printStackTrace();					
				}
			}
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
		return list;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 4:26 분에 한거
		return super.clone();
	}
	public String toString() {
		return "check";
	}
}
