package com.amol.payments.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.payments.rest.service.helper.TransferServiceHelper;
import com.amol.payments.rest.vo.TransferVO;

/**
 * @author Amol Waghmare
 *
 */

@Path("/transfer")
@Service
public class TransferService {
	
	@Autowired
	private TransferServiceHelper trasferServiceHelper; 
	
	@POST 
	@Consumes("application/json")
	@Produces("application/json")
	public TransferVO transfer(TransferVO transferVO) {
		System.out.println("POST->From account number:"+ transferVO.getFromAccountnumber());
		
		return trasferServiceHelper.transfer(transferVO);
	}
}
