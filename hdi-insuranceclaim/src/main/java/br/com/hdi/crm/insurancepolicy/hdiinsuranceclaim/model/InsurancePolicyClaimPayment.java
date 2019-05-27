package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Claim Payment Entity
 */
@ApiModel(description = "Claim Payment Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-22T14:53:12.701Z")

public class InsurancePolicyClaimPayment {
  @JsonProperty("idInsurancePolicy")
  private String idInsurancePolicy = null;

  @JsonProperty("idClaim")
  private String idClaim = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("dueDate")
  private LocalDate dueDate = null;

  @JsonProperty("payDate")
  private LocalDate payDate = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("cpfcgc")
  private String cpfcgc = null;

  @JsonProperty("idPerson")
  private Long idPerson = null;

  public InsurancePolicyClaimPayment idInsurancePolicy(String idInsurancePolicy) {
    this.idInsurancePolicy = idInsurancePolicy;
    return this;
  }

  /**
   * Insurancepolicy ID
   * @return idInsurancePolicy
  **/
  @ApiModelProperty(value = "Insurancepolicy ID")


  public String getIdInsurancePolicy() {
    return idInsurancePolicy;
  }

  public void setIdInsurancePolicy(String idInsurancePolicy) {
    this.idInsurancePolicy = idInsurancePolicy;
  }

  public InsurancePolicyClaimPayment idClaim(String idClaim) {
    this.idClaim = idClaim;
    return this;
  }

  /**
   * Claim ID
   * @return idClaim
  **/
  @ApiModelProperty(value = "Claim ID")


  public String getIdClaim() {
    return idClaim;
  }

  public void setIdClaim(String idClaim) {
    this.idClaim = idClaim;
  }

  public InsurancePolicyClaimPayment amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Claim value
   * @return amount
  **/
  @ApiModelProperty(value = "Claim value")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public InsurancePolicyClaimPayment dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Payment schedule date, format YYYY-MM-DD. Ex.: 2018-11-14
   * @return dueDate
  **/
  @ApiModelProperty(value = "Payment schedule date, format YYYY-MM-DD. Ex.: 2018-11-14")

  @Valid

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public InsurancePolicyClaimPayment payDate(LocalDate payDate) {
    this.payDate = payDate;
    return this;
  }

  /**
   * Efective data of payment, format YYYY-MM-DD. Ex.: 2018-11-14
   * @return payDate
  **/
  @ApiModelProperty(value = "Efective data of payment, format YYYY-MM-DD. Ex.: 2018-11-14")

  @Valid

  public LocalDate getPayDate() {
    return payDate;
  }

  public void setPayDate(LocalDate payDate) {
    this.payDate = payDate;
  }

  public InsurancePolicyClaimPayment status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Get cpfcgc
   * @return cpfcgc
   **/
  public String getCpfcgc() {
    return cpfcgc;
  }

  public void setCpfcgc(String cpfcgc) {
    this.cpfcgc = cpfcgc;
  }

  public InsurancePolicyClaimPayment idPerson(Long idPerson) {
    this.idPerson = idPerson;
    return this;
  }

  /**
   * Person recipinet ID, with isnured, Financial, Forward agent
   * @return idPerson
  **/
  @ApiModelProperty(value = "Person recipinet ID, with isnured, Financial, Forward agent")


  public Long getIdPerson() {
    return idPerson;
  }

  public void setIdPerson(Long idPerson) {
    this.idPerson = idPerson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsurancePolicyClaimPayment insurancePolicyClaimPayments = (InsurancePolicyClaimPayment) o;
    return Objects.equals(this.idInsurancePolicy, insurancePolicyClaimPayments.idInsurancePolicy) &&
        Objects.equals(this.idClaim, insurancePolicyClaimPayments.idClaim) &&
        Objects.equals(this.amount, insurancePolicyClaimPayments.amount) &&
        Objects.equals(this.dueDate, insurancePolicyClaimPayments.dueDate) &&
        Objects.equals(this.payDate, insurancePolicyClaimPayments.payDate) &&
        Objects.equals(this.status, insurancePolicyClaimPayments.status) &&
        Objects.equals(this.idPerson, insurancePolicyClaimPayments.idPerson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idInsurancePolicy, idClaim, amount, dueDate, payDate, status, idPerson);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsurancePolicyClaimPayments {\n");
    
    sb.append("    idInsurancePolicy: ").append(toIndentedString(idInsurancePolicy)).append("\n");
    sb.append("    idClaim: ").append(toIndentedString(idClaim)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    payDate: ").append(toIndentedString(payDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    idPerson: ").append(toIndentedString(idPerson)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

