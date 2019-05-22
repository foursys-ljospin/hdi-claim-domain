package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model.InsurancePolicyClaimPayments;
import br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model.Order;
import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-22T14:53:12.701Z")

@Controller
public class InsurancepolicyApiController implements InsurancepolicyApi {

	private static final Logger log = LoggerFactory.getLogger(InsurancepolicyApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public InsurancepolicyApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<List<Order>> getInsuranePolicyClaimOrders(
			@ApiParam(value = "Company ID", required = true) @RequestHeader(value = "X-Company-Id", required = true) String xCompanyId,
			@ApiParam(value = "Application ID", required = true) @RequestHeader(value = "X-Application-Id", required = true) String xApplicationId,
			@ApiParam(value = "User ID", required = true) @RequestHeader(value = "X-User-Id", required = true) String xUserId,
			@ApiParam(value = "insurancepolicy ID", required = true) @PathVariable("idInsurancePolicy") Long idInsurancePolicy,
			@ApiParam(value = "Claim ID", required = true) @PathVariable("idClaim") Long idClaim,
			@Min(0) @ApiParam(value = "Number of start record") @Valid @RequestParam(value = "skip", required = false) Integer skip,
			@Min(1) @Max(100) @ApiParam(value = "Quantity of records", defaultValue = "20") @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") Integer limit,
			@ApiParam(value = "Fields list to return data") @Valid @RequestParam(value = "fieldsFilter", required = false) String fieldsFilter) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<Order>>(objectMapper.readValue(
						"[ {  \"itens\" : [ {    \"mediatorDiscountPercent\" : 2.027123,    \"idPersonProvider\" : 1,    \"referenceAmount\" : 2.3021358869347655,    \"referenceGrossAmount\" : 7.061401241503109,    \"quantity\" : 5,    \"expectedDeliveryDate\" : \"2000-01-23\",    \"part\" : {      \"code\" : \"code\",      \"name\" : \"name\",      \"id\" : 5.962133916683182377482808078639209270477294921875    },    \"id\" : 6,    \"mediatorAmount\" : 9.301444243932576,    \"deliveryDate\" : \"2000-01-23\",    \"mediatorGrossAmount\" : 3.616076749251911,    \"status\" : {      \"description\" : \"description\",      \"id\" : 5.962133916683182377482808078639209270477294921875    }  }, {    \"mediatorDiscountPercent\" : 2.027123,    \"idPersonProvider\" : 1,    \"referenceAmount\" : 2.3021358869347655,    \"referenceGrossAmount\" : 7.061401241503109,    \"quantity\" : 5,    \"expectedDeliveryDate\" : \"2000-01-23\",    \"part\" : {      \"code\" : \"code\",      \"name\" : \"name\",      \"id\" : 5.962133916683182377482808078639209270477294921875    },    \"id\" : 6,    \"mediatorAmount\" : 9.301444243932576,    \"deliveryDate\" : \"2000-01-23\",    \"mediatorGrossAmount\" : 3.616076749251911,    \"status\" : {      \"description\" : \"description\",      \"id\" : 5.962133916683182377482808078639209270477294921875    }  } ],  \"authorizationDate\" : \"2000-01-23\",  \"orderId\" : \"orderId\",  \"sendDate\" : \"2000-01-23\",  \"idPersonMediator\" : 0,  \"receiveDate\" : \"2000-01-23\",  \"orderCode\" : \"orderCode\",  \"creationDate\" : \"2000-01-23\",  \"status\" : {    \"description\" : \"description\",    \"id\" : 5.962133916683182377482808078639209270477294921875  }}, {  \"itens\" : [ {    \"mediatorDiscountPercent\" : 2.027123,    \"idPersonProvider\" : 1,    \"referenceAmount\" : 2.3021358869347655,    \"referenceGrossAmount\" : 7.061401241503109,    \"quantity\" : 5,    \"expectedDeliveryDate\" : \"2000-01-23\",    \"part\" : {      \"code\" : \"code\",      \"name\" : \"name\",      \"id\" : 5.962133916683182377482808078639209270477294921875    },    \"id\" : 6,    \"mediatorAmount\" : 9.301444243932576,    \"deliveryDate\" : \"2000-01-23\",    \"mediatorGrossAmount\" : 3.616076749251911,    \"status\" : {      \"description\" : \"description\",      \"id\" : 5.962133916683182377482808078639209270477294921875    }  }, {    \"mediatorDiscountPercent\" : 2.027123,    \"idPersonProvider\" : 1,    \"referenceAmount\" : 2.3021358869347655,    \"referenceGrossAmount\" : 7.061401241503109,    \"quantity\" : 5,    \"expectedDeliveryDate\" : \"2000-01-23\",    \"part\" : {      \"code\" : \"code\",      \"name\" : \"name\",      \"id\" : 5.962133916683182377482808078639209270477294921875    },    \"id\" : 6,    \"mediatorAmount\" : 9.301444243932576,    \"deliveryDate\" : \"2000-01-23\",    \"mediatorGrossAmount\" : 3.616076749251911,    \"status\" : {      \"description\" : \"description\",      \"id\" : 5.962133916683182377482808078639209270477294921875    }  } ],  \"authorizationDate\" : \"2000-01-23\",  \"orderId\" : \"orderId\",  \"sendDate\" : \"2000-01-23\",  \"idPersonMediator\" : 0,  \"receiveDate\" : \"2000-01-23\",  \"orderCode\" : \"orderCode\",  \"creationDate\" : \"2000-01-23\",  \"status\" : {    \"description\" : \"description\",    \"id\" : 5.962133916683182377482808078639209270477294921875  }} ]",
						List.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<List<Order>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<Order>>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<List<InsurancePolicyClaimPayments>> getInsuranePolicyClaimPayments(
			@ApiParam(value = "Company ID", required = true) @RequestHeader(value = "X-Company-Id", required = true) String xCompanyId,
			@ApiParam(value = "Application ID", required = true) @RequestHeader(value = "X-Application-Id", required = true) String xApplicationId,
			@ApiParam(value = "User ID", required = true) @RequestHeader(value = "X-User-Id", required = true) String xUserId,
			@ApiParam(value = "insurancepolicy ID", required = true) @PathVariable("idInsurancePolicy") Long idInsurancePolicy,
			@ApiParam(value = "Claim ID", required = true) @PathVariable("idClaim") Long idClaim,
			@Min(0) @ApiParam(value = "Number of start record") @Valid @RequestParam(value = "skip", required = false) Integer skip,
			@Min(1) @Max(100) @ApiParam(value = "Quantity of records", defaultValue = "20") @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") Integer limit,
			@ApiParam(value = "Fields list to return data") @Valid @RequestParam(value = "fieldsFilter", required = false) String fieldsFilter) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<List<InsurancePolicyClaimPayments>>(objectMapper.readValue(
						"[ {  \"idInsurancePolicy\" : 0,  \"amount\" : 1.4658129,  \"idPerson\" : 5,  \"idClaim\" : 6,  \"dueDate\" : \"2000-01-23\",  \"payDate\" : \"2000-01-23\",  \"status\" : {    \"description\" : \"description\",    \"id\" : 5.962133916683182377482808078639209270477294921875  }}, {  \"idInsurancePolicy\" : 0,  \"amount\" : 1.4658129,  \"idPerson\" : 5,  \"idClaim\" : 6,  \"dueDate\" : \"2000-01-23\",  \"payDate\" : \"2000-01-23\",  \"status\" : {    \"description\" : \"description\",    \"id\" : 5.962133916683182377482808078639209270477294921875  }} ]",
						List.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<List<InsurancePolicyClaimPayments>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<List<InsurancePolicyClaimPayments>>(HttpStatus.NOT_IMPLEMENTED);
	}

}
