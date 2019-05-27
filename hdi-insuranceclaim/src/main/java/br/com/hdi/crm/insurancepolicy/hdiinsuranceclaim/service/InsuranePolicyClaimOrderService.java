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
	
	public List<Order> findOrdersByPolicyAndClaimPageable(
    		String idInsurancePolicy, String idClaim, Integer numPage, Integer amountRows) {
		
		return this.repository.findOrdersByPolicyAndClaimPageable(idInsurancePolicy, idClaim, numPage, amountRows);
	}

}
