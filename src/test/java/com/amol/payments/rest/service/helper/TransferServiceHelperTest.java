package com.amol.payments.rest.service.helper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.amol.payments.data.config.DataConfig;
import com.amol.payments.rest.config.AppConfig;
import com.amol.payments.rest.exception.PaymentsException;
import com.amol.payments.rest.vo.AccountVO;
import com.amol.payments.rest.vo.TransferVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class,DataConfig.class})
public class TransferServiceHelperTest {
	
	@Autowired
	private TransferServiceHelper trasferServiceHelper; 
	

	@Autowired
	private AccountServiceHelper accountServiceHelper; 
	
	@Before
	public void setUp() {
		
		AccountVO accountVO = new AccountVO();
		accountVO.setAccountNumber(1);
		accountVO.setBalance("1000");
		accountVO.setName("TestAccount");
		accountServiceHelper.addAccount(accountVO);
		
		AccountVO accountVO2 = new AccountVO();
		accountVO2.setAccountNumber(2);
		accountVO2.setBalance("2000");
		accountVO2.setName("TestAccount");
		accountServiceHelper.addAccount(accountVO2);
		
		
	}

	@Test (expected= PaymentsException.class)
	public void testTransfer() throws PaymentsException {
		
		
		TransferVO transferVO = new TransferVO();
		transferVO.setFromAccountnumber(1);
		transferVO.setToAccountnumber(2);
		transferVO.setTransferAmount(10000);
		
		trasferServiceHelper.transfer(transferVO);
		
	}

}
