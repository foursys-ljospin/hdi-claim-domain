package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface InsurancePolicyClaimOrderRepository {

	String queryFindOrders =
			" select pc.\"codigo\"+' - '+pc.\"nome\"    as Piece__c, " +
			" stpc.\"des-stapc\" as Status__c, " +
			" pc.\"quantidade\" as Qtdy__c, " +
			" pc.\"quantidade\" * pc.\"valoralterado\" + pc.\"desconto\"    as Gross_Value_Audatex__c, " +
			" pc.\"quantidade\" * pdxpc.\"vlr-pc\" + pdxpc.\"vlr-desconto\" as Gross_Value_Mediator__c, " +
			" pc.\"quantidade\" * pc.\"valoralterado\"                    as Net_Value_Audatex__c, " +
			" pc.\"quantidade\" * pdxpc.\"vlr-pc\"                        as Net_Value_Mediator__c, " +
			" pdxpc.\"perc-desconto\"                                   as Percent_Discount__c, " +
			" pdxpc.\"dat-prevent\"                                     as Expected_Delivery_Date__c, " +
			" pdxpc.\"dat-receb\"                                       as Delivery_Date__c, " +
			" md.\"des-mediadora\"                                      as Mediator__c, " +
			" case when pdxpc.\"idped\" is null then 'OFICINA' " +
			" else 'HDI' " +
			" end  as Provider__c, " +
			" pd.\"idped\" as Order_Number__c, " +
			" pd.\"dat-criacao\" as Order_Date__c, " +
			" pd.\"dat-autoriza\" as Autorization_Date__c, " +
			" pd.\"dat-envio\" as Order_Delivery_Date__c, " +
			" pd.\"dat-retorno\" as Order_Return_Date__c, " +
			" l.\"seq-siniuss\" as Claim__c " +
			" from emimr.pub.mrdocum mrd " +
			" inner join pub.mrproces mpc  on mpc.\"cod-empresa\"  = mrd.\"cod-empresa\" " +
			" and mpc.\"cod-sucursal\" = mrd.\"cod-sucursal\" " +
			" and mpc.\"cod-carteira\" = mrd.\"cod-carteira\" " +
			" and mpc.\"seq-docum\"    = mrd.\"seq-docum\" " +
			" and mpc.\"seq-endosso\"  = mrd.\"seq-endosso\" " +
			" inner join pub.mraviter mat  on mat.\"cod-empresa\"  = mpc.\"cod-empresa\" " +
			" and mat.\"cod-sucursal\" = mpc.\"cod-sucursal\" " +
			" and mat.\"cod-ramo\"     = mpc.\"cod-ramo\" " +
			" and mat.\"seq-sinistro\" = mpc.\"seq-sinistro\" " +
			" inner join pub.mrsilau l          on l.\"seq-siniuss\"     = mat.\"seq-siniuss\" " +
			" inner join pub.mrsilauxpc lpc     on lpc.\"idlaudo\"       = l.\"idlaudo\" " +
			" inner join pub.mrsipc pc          on pc.\"idpec\"          = lpc.\"idpec\" " +
			" and pc.\"trc\"           = '1' " +
			" and pc.\"ref\"           = '1' " +
			" left join pub.mrsipedxlau pdxl    on pdxl.\"idlaudo\"      = l.\"idlaudo\" " +
			" left join pub.mrsiped pd          on pd.\"idped\"          = pdxl.\"idped\" " +
			" left join bas.pub.issimed md      on md.\"cod-mediadora\"  = pd.\"cod-mediadora\" " +
			" left join pub.mrsipedxpc pdxpc    on pdxpc.\"idped\"       = pd.\"idped\"  " +
			" and pdxpc.\"idpec\"      = pc.\"idpec\" " +
			" left join bas.pub.issistapc stpc  on stpc.\"cod-stapc\"    = pdxpc.\"cod-stapc\" " +
			" where mat.\"seq-siniuss\"  = ?1 " +
			" and mrd.\"num-chavedoc\" = ?2 " +
			" order by mat.\"seq-siniuss\" " +
			" OFFSET ?3 ROWS " +
			" FETCH NEXT ?4 ROWS ONLY ";

		@Query(value = queryFindOrders, nativeQuery = true)
		Object[][] findOrdersByPolicyAndClaimPageable(
				String idInsurancePolicy, String idClaim, Integer numPage, Integer amountRows);
	
}
