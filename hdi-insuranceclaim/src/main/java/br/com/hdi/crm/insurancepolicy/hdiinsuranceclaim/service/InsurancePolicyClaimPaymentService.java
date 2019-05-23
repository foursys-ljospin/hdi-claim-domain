package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model.InsurancePolicyClaimPayment;
import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.repository.InsurancePolicyClaimPaymentRepository;

@Service
public class InsurancePolicyClaimPaymentService {

	@Autowired
	private InsurancePolicyClaimPaymentRepository repository;
	
	public ArrayList<InsurancePolicyClaimPayment> findPaymentsByClaimPageable(
    		Long idInsurancePolicy, Long idClaim, Integer noRecordsPerPage, Integer noStartPage) {
		
		return this.repository.findPaymentsByClaimPageable(idInsurancePolicy, idClaim, noRecordsPerPage, noStartPage);
	}
	
}
