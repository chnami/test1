package com.naver.vo;
/*
	������ ��(DataBean) Ŭ���� �ۼ�
	��뿹�� �Խ��ǿ��� ���Ǵ� �������� ������ ���̶�� �ϳ��� ��ü�� �����ϰ� �ǰ�
	�� ��ü�� �����ϸ� �� ������ �ϳ��� ������ �ʿ䰡 ������ �Ѳ����� ��� ������ ���޵˴ϴ�.
	�̷� Ŭ������ DTO(Data Transfer Object), VO(Value Object)��� �մϴ�.
	DB���� ������� �÷���� �����ϰ� ������Ƽ���� �����մϴ�.
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
