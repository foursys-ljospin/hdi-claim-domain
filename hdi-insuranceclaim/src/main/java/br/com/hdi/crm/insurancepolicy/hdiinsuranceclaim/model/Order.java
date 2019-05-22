package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Order Parts Claims Entity
 */
@ApiModel(description = "Order Parts Claims Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-22T14:53:12.701Z")

public class Order   {
  @JsonProperty("idPersonMediator")
  private Long idPersonMediator = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("orderCode")
  private String orderCode = null;

  @JsonProperty("creationDate")
  private LocalDate creationDate = null;

  @JsonProperty("authorizationDate")
  private LocalDate authorizationDate = null;

  @JsonProperty("sendDate")
  private LocalDate sendDate = null;

  @JsonProperty("receiveDate")
  private LocalDate receiveDate = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("itens")
  @Valid
  private List<OrderItem> itens = null;

  public Order idPersonMediator(Long idPersonMediator) {
    this.idPersonMediator = idPersonMediator;
    return this;
  }

  /**
   * Mediator person ID
   * @return idPersonMediator
  **/
  @ApiModelProperty(value = "Mediator person ID")


  public Long getIdPersonMediator() {
    return idPersonMediator;
  }

  public void setIdPersonMediator(Long idPersonMediator) {
    this.idPersonMediator = idPersonMediator;
  }

  public Order orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Id from order
   * @return orderId
  **/
  @ApiModelProperty(value = "Id from order")


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Order orderCode(String orderCode) {
    this.orderCode = orderCode;
    return this;
  }

  /**
   * Order code
   * @return orderCode
  **/
  @ApiModelProperty(value = "Order code")


  public String getOrderCode() {
    return orderCode;
  }

  public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
  }

  public Order creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Purchase order date, format YYYY-MM-DD. Ex.: 2018-11-14
   * @return creationDate
  **/
  @ApiModelProperty(value = "Purchase order date, format YYYY-MM-DD. Ex.: 2018-11-14")

  @Valid

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public Order authorizationDate(LocalDate authorizationDate) {
    this.authorizationDate = authorizationDate;
    return this;
  }

  /**
   * Purchase order authorization date, format formato YYYY-MM-DD. Ex.: 2018-11-14
   * @return authorizationDate
  **/
  @ApiModelProperty(value = "Purchase order authorization date, format formato YYYY-MM-DD. Ex.: 2018-11-14")

  @Valid

  public LocalDate getAuthorizationDate() {
    return authorizationDate;
  }

  public void setAuthorizationDate(LocalDate authorizationDate) {
    this.authorizationDate = authorizationDate;
  }

  public Order sendDate(LocalDate sendDate) {
    this.sendDate = sendDate;
    return this;
  }

  /**
   * Purchase order send date, format formato YYYY-MM-DD. Ex.: 2018-11-14
   * @return sendDate
  **/
  @ApiModelProperty(value = "Purchase order send date, format formato YYYY-MM-DD. Ex.: 2018-11-14")

  @Valid

  public LocalDate getSendDate() {
    return sendDate;
  }

  public void setSendDate(LocalDate sendDate) {
    this.sendDate = sendDate;
  }

  public Order receiveDate(LocalDate receiveDate) {
    this.receiveDate = receiveDate;
    return this;
  }

  /**
   * Purchase order receive date, format formato YYYY-MM-DD. Ex.: 2018-11-14
   * @return receiveDate
  **/
  @ApiModelProperty(value = "Purchase order receive date, format formato YYYY-MM-DD. Ex.: 2018-11-14")

  @Valid

  public LocalDate getReceiveDate() {
    return receiveDate;
  }

  public void setReceiveDate(LocalDate receiveDate) {
    this.receiveDate = receiveDate;
  }

  public Order status(Status status) {
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

  public Order itens(List<OrderItem> itens) {
    this.itens = itens;
    return this;
  }

  public Order addItensItem(OrderItem itensItem) {
    if (this.itens == null) {
      this.itens = new ArrayList<OrderItem>();
    }
    this.itens.add(itensItem);
    return this;
  }

  /**
   * Purchase Order Items
   * @return itens
  **/
  @ApiModelProperty(value = "Purchase Order Items")

  @Valid

  public List<OrderItem> getItens() {
    return itens;
  }

  public void setItens(List<OrderItem> itens) {
    this.itens = itens;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.idPersonMediator, order.idPersonMediator) &&
        Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.orderCode, order.orderCode) &&
        Objects.equals(this.creationDate, order.creationDate) &&
        Objects.equals(this.authorizationDate, order.authorizationDate) &&
        Objects.equals(this.sendDate, order.sendDate) &&
        Objects.equals(this.receiveDate, order.receiveDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.itens, order.itens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPersonMediator, orderId, orderCode, creationDate, authorizationDate, sendDate, receiveDate, status, itens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    idPersonMediator: ").append(toIndentedString(idPersonMediator)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderCode: ").append(toIndentedString(orderCode)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    authorizationDate: ").append(toIndentedString(authorizationDate)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    receiveDate: ").append(toIndentedString(receiveDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    itens: ").append(toIndentedString(itens)).append("\n");
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

