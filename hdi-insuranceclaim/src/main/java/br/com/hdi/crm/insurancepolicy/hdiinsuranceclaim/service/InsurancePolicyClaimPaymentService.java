package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.service;

import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model.InsurancePolicyClaimPayment;
import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.repository.InsurancePolicyClaimPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsurancePolicyClaimPaymentService {

	@Autowired
	private InsurancePolicyClaimPaymentRepository repository;
	
	public List<InsurancePolicyClaimPayment> findPaymentsByPolicyAndClaimPageable(
			String seqSinistro, String numChaveDoc, Integer numPage, Integer amountRows) {
		
		return this.repository.findPaymentsByPolicyAndClaimPageable(seqSinistro, numChaveDoc, numPage, amountRows);
	}
	
}
