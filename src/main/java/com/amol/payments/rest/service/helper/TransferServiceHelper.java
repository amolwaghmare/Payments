package com.amol.payments.rest.service.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amol.payments.data.entity.Transfer;
import com.amol.payments.data.repository.TransferRepository;
import com.amol.payments.rest.vo.AccountVO;
import com.amol.payments.rest.vo.TransferVO;

/**
 * @author Amol Waghmare 
 *
 */
@Component
public class TransferServiceHelper {
	
	@Autowired
	TransferRepository trasferRepository;
	
	
	@Transactional
	public TransferVO transfer(TransferVO transferVO) {
		System.out.println("From account: "+transferVO.getFromAccountnumber());
		Transfer transfer = new Transfer();
		transfer.setFromAccountnumber(transferVO.getFromAccountnumber());
		transfer.setToAccountnumber(transferVO.getToAccountnumber());
		transfer = trasferRepository.save(transfer);
		System.out.println(" TransactionNumber: "+transfer.getId());
		
		transferVO.setTransferNumber(transfer.getId());
		return transferVO;
	}

}
