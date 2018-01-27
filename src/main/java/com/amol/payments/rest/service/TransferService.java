package com.amol.payments.rest.service;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.payments.rest.exception.PaymentsException;
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
	public Response transfer(TransferVO transferVO) throws PaymentsException {
		System.out.println("POST->From account number:"+ transferVO.getFromAccountnumber());
	
		return Response.ok().entity(trasferServiceHelper.transfer(transferVO)).build();

	}
}
