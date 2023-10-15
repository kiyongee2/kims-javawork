package banking.domain;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID = 11111L;
	
	//필드
	private String ano;    //계좌 번호
	private String owner;  //계좌주
	private int balance;   //잔고
	
	//생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//getter, setter
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

}
