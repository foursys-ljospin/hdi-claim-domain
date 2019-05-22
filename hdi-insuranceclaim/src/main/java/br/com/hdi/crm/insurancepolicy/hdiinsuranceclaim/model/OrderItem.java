package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Purchase Order of Parts item Entity
 */
@ApiModel(description = "Purchase Order of Parts item Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-22T14:53:12.701Z")

public class OrderItem   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("idPersonProvider")
  private Long idPersonProvider = null;

  @JsonProperty("part")
  private Part part = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("quantity")
  private Long quantity = null;

  @JsonProperty("referenceAmount")
  private Double referenceAmount = null;

  @JsonProperty("referenceGrossAmount")
  private Double referenceGrossAmount = null;

  @JsonProperty("mediatorAmount")
  private Double mediatorAmount = null;

  @JsonProperty("mediatorGrossAmount")
  private Double mediatorGrossAmount = null;

  @JsonProperty("mediatorDiscountPercent")
  private Float mediatorDiscountPercent = null;

  @JsonProperty("expectedDeliveryDate")
  private LocalDate expectedDeliveryDate = null;

  @JsonProperty("deliveryDate")
  private LocalDate deliveryDate = null;

  public OrderItem id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Id from item
   * @return id
  **/
  @ApiModelProperty(value = "Id from item")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderItem idPersonProvider(Long idPersonProvider) {
    this.idPersonProvider = idPersonProvider;
    return this;
  }

  /**
   * Provider Person ID
   * @return idPersonProvider
  **/
  @ApiModelProperty(value = "Provider Person ID")


  public Long getIdPersonProvider() {
    return idPersonProvider;
  }

  public void setIdPersonProvider(Long idPersonProvider) {
    this.idPersonProvider = idPersonProvider;
  }

  public OrderItem part(Part part) {
    this.part = part;
    return this;
  }

  /**
   * Get part
   * @return part
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Part getPart() {
    return part;
  }

  public void setPart(Part part) {
    this.part = part;
  }

  public OrderItem status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public OrderItem quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of order
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity of order")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public OrderItem referenceAmount(Double referenceAmount) {
    this.referenceAmount = referenceAmount;
    return this;
  }

  /**
   * Reference value {Audatex}
   * @return referenceAmount
  **/
  @ApiModelProperty(value = "Reference value {Audatex}")


  public Double getReferenceAmount() {
    return referenceAmount;
  }

  public void setReferenceAmount(Double referenceAmount) {
    this.referenceAmount = referenceAmount;
  }

  public OrderItem referenceGrossAmount(Double referenceGrossAmount) {
    this.referenceGrossAmount = referenceGrossAmount;
    return this;
  }

  /**
   * Reference gross value {Audatex}
   * @return referenceGrossAmount
  **/
  @ApiModelProperty(value = "Reference gross value {Audatex}")


  public Double getReferenceGrossAmount() {
    return referenceGrossAmount;
  }

  public void setReferenceGrossAmount(Double referenceGrossAmount) {
    this.referenceGrossAmount = referenceGrossAmount;
  }

  public OrderItem mediatorAmount(Double mediatorAmount) {
    this.mediatorAmount = mediatorAmount;
    return this;
  }

  /**
   * Mediator value
   * @return mediatorAmount
  **/
  @ApiModelProperty(value = "Mediator value")


  public Double getMediatorAmount() {
    return mediatorAmount;
  }

  public void setMediatorAmount(Double mediatorAmount) {
    this.mediatorAmount = mediatorAmount;
  }

  public OrderItem mediatorGrossAmount(Double mediatorGrossAmount) {
    this.mediatorGrossAmount = mediatorGrossAmount;
    return this;
  }

  /**
   * Mediator gross value
   * @return mediatorGrossAmount
  **/
  @ApiModelProperty(value = "Mediator gross value")


  public Double getMediatorGrossAmount() {
    return mediatorGrossAmount;
  }

  public void setMediatorGrossAmount(Double mediatorGrossAmount) {
    this.mediatorGrossAmount = mediatorGrossAmount;
  }

  public OrderItem mediatorDiscountPercent(Float mediatorDiscountPercent) {
    this.mediatorDiscountPercent = mediatorDiscountPercent;
    return this;
  }

  /**
   * Mediator discount percent value
   * @return mediatorDiscountPercent
  **/
  @ApiModelProperty(value = "Mediator discount percent value")


  public Float getMediatorDiscountPercent() {
    return mediatorDiscountPercent;
  }

  public void setMediatorDiscountPercent(Float mediatorDiscountPercent) {
    this.mediatorDiscountPercent = mediatorDiscountPercent;
  }

  public OrderItem expectedDeliveryDate(LocalDate expectedDeliveryDate) {
    this.expectedDeliveryDate = expectedDeliveryDate;
    return this;
  }

  /**
   * Expected date of delivery of part, format YYYY-MM-DD. Ex.: 2018-11-14
   * @return expectedDeliveryDate
  **/
  @ApiModelProperty(value = "Expected date of delivery of part, format YYYY-MM-DD. Ex.: 2018-11-14")

  @Valid

  public LocalDate getExpectedDeliveryDate() {
    return expectedDeliveryDate;
  }

  public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
    this.expectedDeliveryDate = expectedDeliveryDate;
  }

  public OrderItem deliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

  /**
   * Date of delivery of part, format YYYY-MM-DD. Ex.: 2018-11-14
   * @return deliveryDate
  **/
  @ApiModelProperty(value = "Date of delivery of part, format YYYY-MM-DD. Ex.: 2018-11-14")

  @Valid

  public LocalDate getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.id, orderItem.id) &&
        Objects.equals(this.idPersonProvider, orderItem.idPersonProvider) &&
        Objects.equals(this.part, orderItem.part) &&
        Objects.equals(this.status, orderItem.status) &&
        Objects.equals(this.quantity, orderItem.quantity) &&
        Objects.equals(this.referenceAmount, orderItem.referenceAmount) &&
        Objects.equals(this.referenceGrossAmount, orderItem.referenceGrossAmount) &&
        Objects.equals(this.mediatorAmount, orderItem.mediatorAmount) &&
        Objects.equals(this.mediatorGrossAmount, orderItem.mediatorGrossAmount) &&
        Objects.equals(this.mediatorDiscountPercent, orderItem.mediatorDiscountPercent) &&
        Objects.equals(this.expectedDeliveryDate, orderItem.expectedDeliveryDate) &&
        Objects.equals(this.deliveryDate, orderItem.deliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idPersonProvider, part, status, quantity, referenceAmount, referenceGrossAmount, mediatorAmount, mediatorGrossAmount, mediatorDiscountPercent, expectedDeliveryDate, deliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idPersonProvider: ").append(toIndentedString(idPersonProvider)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    referenceAmount: ").append(toIndentedString(referenceAmount)).append("\n");
    sb.append("    referenceGrossAmount: ").append(toIndentedString(referenceGrossAmount)).append("\n");
    sb.append("    mediatorAmount: ").append(toIndentedString(mediatorAmount)).append("\n");
    sb.append("    mediatorGrossAmount: ").append(toIndentedString(mediatorGrossAmount)).append("\n");
    sb.append("    mediatorDiscountPercent: ").append(toIndentedString(mediatorDiscountPercent)).append("\n");
    sb.append("    expectedDeliveryDate: ").append(toIndentedString(expectedDeliveryDate)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
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

