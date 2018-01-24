package com.amol.payments.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestParam;

import com.amol.payments.rest.vo.AccountVO;

/**
 * @author Amol Waghmare
 *
 */

@Path("/account")
public class AccountService {
	
	@GET
	public AccountVO getAccount(@RequestParam("name") String name) {
		AccountVO account = new AccountVO();
		account.setName(name);
		return account;
		
	}

	@POST
	public Response addAccount(AccountVO account) {
		System.out.println("Name:"+ account.getName());
		return Response.ok().build();		
	}
}
