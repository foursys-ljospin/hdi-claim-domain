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
			System.out.println("3: " + result[2]);
			System.out.println("4: " + result[3]);
			System.out.println("5: " + result[4]);
			System.out.println("6: " + result[5]);
			System.out.println("7: " + result[6]);
			System.out.println("8: " + result[7]);
			System.out.println("9: " + result[8]);
			System.out.println("10: " + result[9]);
			System.out.println("11: " + result[10]);
			System.out.println("12: " + result[11]);
			System.out.println("13: " + result[12]);
			System.out.println("14: " + result[13]);
			System.out.println("15: " + result[14]);
			System.out.println("16: " + result[15]);
			System.out.println("17: " + result[16]);
			System.out.println("18: " + result[17]);
		}
		
		return null;
	}

}
