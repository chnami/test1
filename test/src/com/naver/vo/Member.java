package com.naver.vo;
/*
	데이터 빈(DataBean) 클래스 작성
	사용예로 게시판에서 사용되는 정보들을 데이터 빈이라는 하나의 객체에 저장하게 되고
	이 객체를 전달하면 각 정보를 하나씩 전달할 필요가 없으며 한꺼번에 모든 정보가 전달됩니다.
	이런 클래스를 DTO(Data Transfer Object), VO(Value Object)라고 합니다.
	DB에서 만들었던 컬럼명과 동일하게 프로퍼티들을 생성합니다.
 */
import java.sql.Date;

public class Member {
	private String id;
	private String pass;
	private String name;
	private Date reg_date;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pass=" + pass + ", name=" + name + ", reg_date=" + reg_date + "]";
	}
}
