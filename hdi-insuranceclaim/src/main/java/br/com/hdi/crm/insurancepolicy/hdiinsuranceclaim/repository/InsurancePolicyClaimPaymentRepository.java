package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model.InsurancePolicyClaimPayment;

public interface InsurancePolicyClaimPaymentRepository extends Repository<InsurancePolicyClaimPayment, Long>{
	
	String queryFindPayments = 
			" select id, name, roll_no from USER_INFO_TEST " +
			" where rollNo = ?1 ";
	
	@Query(value = queryFindPayments, 
			nativeQuery = true)
    ArrayList<InsurancePolicyClaimPayment> findPaymentsByClaimPageable(
    		Long idInsurancePolicy, Long idClaim, Integer noRecordsPerPage, Integer noStartPage);

}
