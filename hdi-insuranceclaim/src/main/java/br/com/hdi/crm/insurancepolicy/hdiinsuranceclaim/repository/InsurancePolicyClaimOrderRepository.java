package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.repository;

import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model.InsurancePolicyClaimPayment;
import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class InsurancePolicyClaimOrderRepository {

	@PersistenceContext
	EntityManager entityManager;

	String queryFindOrders = 
			" select id, name, roll_no from USER_INFO_TEST " +
			" where rollNo = ? ";

	public List<Order> findOrdersByPolicyAndClaimPageable(
			String seqSinistro, String numChaveDoc, Integer numPage, Integer amountRows) {

		Query query = entityManager.createNativeQuery(queryFindOrders, InsurancePolicyClaimPayment.class);
		query.setParameter(1, seqSinistro);
		query.setParameter(2, numChaveDoc);
		query.setParameter(3, numPage);
		query.setParameter(4, amountRows);

		return query.getResultList();
	}
	
}
