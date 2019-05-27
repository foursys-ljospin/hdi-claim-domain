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

		Object[][] results = this.repository.findOrdersByPolicyAndClaimPageable(idInsurancePolicy, idClaim, numPage, amountRows);

		for (Object[] result : results) {
			System.out.println("1: " + result[0]);
			System.out.println("2: " + result[1]);
			System.out.println("2: " + result[2]);
			System.out.println("2: " + result[3]);
			System.out.println("2: " + result[4]);
			System.out.println("2: " + result[5]);
			System.out.println("2: " + result[6]);
			System.out.println("2: " + result[7]);
			System.out.println("2: " + result[8]);
			System.out.println("2: " + result[9]);
			System.out.println("2: " + result[10]);
			System.out.println("2: " + result[11]);
			System.out.println("2: " + result[12]);
			System.out.println("2: " + result[13]);
			System.out.println("2: " + result[14]);
			System.out.println("2: " + result[15]);
			System.out.println("2: " + result[16]);
			System.out.println("2: " + result[17]);
		}
		
		return null;
	}

}
