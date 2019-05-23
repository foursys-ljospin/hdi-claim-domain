package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model.Order;
import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.repository.InsurancePolicyClaimOrderRepository;

@Service
public class InsuranePolicyClaimOrderService {
	
	@Autowired
	private InsurancePolicyClaimOrderRepository repository;
	
	public List<Order> findPaymentsByClaimPageable(
    		Long idInsurancePolicy, Long idClaim, Integer noRecordsPerPage, Integer noStartPage) {
		
		return this.repository.findPaymentsByClaimPageable(idInsurancePolicy, idClaim, noRecordsPerPage, noStartPage);
	}

}
