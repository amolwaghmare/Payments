package com.amol.payments.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.amol.payments.rest.vo.AccountVO;

/**
 * @author Amol Waghmare
 *
 */

@Path("/account")
public class AccountService {
	
		
	@GET
	@Produces("application/json")
	public AccountVO getAccount(@QueryParam("name") String name) {
		System.out.println("Name:"+ name);
		AccountVO account = new AccountVO();
		account.setName(name);
		return account;
		
	}

	@POST 
	@Consumes("application/json")
	public Response addAccount(AccountVO account) {
		System.out.println("POST->Name:"+ account.getName());
		System.out.println("POST->Balance:"+ account.getBalance());
		return Response.ok().build();		
	}
}
