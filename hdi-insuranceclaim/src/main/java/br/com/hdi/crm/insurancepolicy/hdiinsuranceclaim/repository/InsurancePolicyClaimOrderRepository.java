package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model.Order;

public interface InsurancePolicyClaimOrderRepository extends Repository<Order, Long> {

	String queryFindOrders = 
			" select id, name, roll_no from USER_INFO_TEST " +
			" where rollNo = ?1 ";
	
	@Query(value = queryFindOrders, 
			nativeQuery = true)
    List<Order> findPaymentsByClaimPageable(
    		Long idInsurancePolicy, Long idClaim, Integer noRecordsPerPage, Integer noStartPage);
	
}
