package com.amol.payments.rest.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class PaymentsExceptionMapper implements ExceptionMapper<PaymentsException> {
    public Response toResponse(PaymentsException ex) {
    	System.out.println("ExceptionMapper" +ex.getMessage());
        return Response.status(Response.Status.BAD_REQUEST).build();
    }

	
}