package org.framestudy.springmvc20170818.pojos;

import java.util.Arrays;

public class Register {
	private String userName;
	private int age;
	private double income;
	private boolean marry;
	private String[] interest;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public boolean isMarry() {
		return marry;
	}
	public void setMarry(boolean marry) {
		this.marry = marry;
	}
	public String[] getInterest() {
		return interest;
	}
	public void setInterest(String[] interest) {
		this.interest = interest;
	}
	@Override
	public String toString() {
		return "Register [userName=" + userName + ", age=" + age + ", income=" + income + ", marry=" + marry
				+ ", interest=" + Arrays.toString(interest) + "]";
	}
}
