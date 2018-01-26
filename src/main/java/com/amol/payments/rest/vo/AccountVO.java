package com.amol.payments.rest.vo;

import javax.xml.bind.annotation.XmlRootElement;
/**
 * @author Amol Waghmare
 *
 * Value object class which is java representation of the Account information in JSON/XML format
 */

@XmlRootElement
public class AccountVO {
	
	private String name;
	
	private String balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

}
