package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.repository;

import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model.InsurancePolicyClaimPayment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class InsurancePolicyClaimPaymentRepository {

	@PersistenceContext
	EntityManager entityManager;

	private final String queryPayments =
					" select a.\"vlr-indeniza\"  as amount, " +
					" c.\"seq-siniuss\"   as idClaim, " +
					" p.\"dat-venciment\" as dueDate, " +
					" ec.\"dtpgto\"       as payDate, " +
					" case when a.\"sta-estima\" = '0' then 'Pendente' " +
					" when a.\"sta-estima\" = '1' then 'Autorizado' " +
					" end as status, " +
					" a.\"cpfcgc\"        as cpfcgc " +
					" from emimr.pub.mrdocum e " +
					" inner join pub.mrproces d    on d.\"cod-empresa\"  = e.\"cod-empresa\" " +
					" and d.\"cod-sucursal\" = e.\"cod-sucursal\" " +
					" and d.\"cod-carteira\" = e.\"cod-carteira\" " +
					" and d.\"seq-docum\"    = e.\"seq-docum\" " +
					" and d.\"seq-endosso\"  = e.\"seq-endosso\" " +
					" inner join pub.mraviter c    on c.\"cod-empresa\"  = d.\"cod-empresa\" " +
					" and c.\"cod-sucursal\" = d.\"cod-sucursal\" " +
					" and c.\"cod-ramo\"     = d.\"cod-ramo\" " +
					" and c.\"seq-sinistro\" = d.\"seq-sinistro\" " +
					" inner join pub.mrestima a    on a.\"cod-empresa\"  = c.\"cod-empresa\" " +
					" and a.\"cod-sucursal\" = c.\"cod-sucursal\" " +
					" and a.\"cod-ramo\"     = c.\"cod-ramo\" " +
					" and a.\"seq-sinistro\" = c.\"seq-sinistro\" " +
					" and a.\"seq-rcla\"     = c.\"seq-rclater\" " +
					" left join pub.mrpropar p     on p.\"cod-empresa\"  = a.\"cod-empresa\" " +
					" and p.\"cod-sucursal\" = a.\"cod-sucursal\" " +
					" and p.\"cod-ramo\"     = a.\"cod-ramo\" " +
					" and p.\"seq-sinistro\" = a.\"seq-sinistro\" " +
					" and p.\"seq-estima\"   = a.\"seq-estima\" " +
					" left join fin.pub.ecregper ec on ec.\"cod-empresa\"  =  p.\"cod-empresa\" " +
					" and ec.\"cod-sucursal\" =  p.\"cod-sucursal\" " +
					" and ec.\"numseq\"       =  p.\"numseq-cp\" " +
					" where c.\"seq-siniuss\"  = ? " +
					" and e.\"num-chavedoc\" = ? " +
					" order by c.\"seq-siniuss\" " +
					" OFFSET ? ROWS " +
					" FETCH NEXT ? ROWS ONLY ";
	
	public List<InsurancePolicyClaimPayment> findPaymentsByPolicyAndClaimPageable(
			String seqSinistro, String numChaveDoc, Integer numPage, Integer amountRows) {

		Query query = entityManager.createNativeQuery(queryPayments, InsurancePolicyClaimPayment.class);
		query.setParameter(1, seqSinistro);
		query.setParameter(2, numChaveDoc);
		query.setParameter(3, numPage);
		query.setParameter(4, amountRows);

		return query.getResultList();
	}

}
