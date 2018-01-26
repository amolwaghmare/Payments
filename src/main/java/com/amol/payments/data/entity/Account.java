package com.amol.payments.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Amol Waghmare
 *
 */
@Entity (name="ACCOUNT")
public class Account {
	
	@Id
	private int accountnumber;
	
	private String name;
	
	private double balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
