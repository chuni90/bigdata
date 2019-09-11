package com.test;

public class Account {
		
		private int regNumber;
		private String name;
		private int balance;
		
		public int getRegNumber() {
			return regNumber;
		}
		public void setRegNumber(int regNumber) {
			this.regNumber = regNumber;      // this 라는 객체는 임시로 현재 나의 클래스를 지칭하는 의미
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
		

}
