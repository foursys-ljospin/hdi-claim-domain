package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * return data error of the api
 */
@ApiModel(description = "return data error of the api")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-22T14:53:12.701Z")

public class ApiErrorResponse {

	public ApiErrorResponse() {

	}

	public ApiErrorResponse(Integer code, String message, String description) {
		this.code = code;
		this.message = message;
		this.description = description;
	}

	@JsonProperty("code")
	private Integer code = null;

	@JsonProperty("message")
	private String message = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("errors")
	@Valid
	private List<Error> errors = null;

	public ApiErrorResponse code(Integer code) {
		this.code = code;
		return this;
	}

	/**
	 * Error Id
	 * 
	 * @return code
	 **/
	@ApiModelProperty(value = "Error Id")

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public ApiErrorResponse message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Error message
	 * 
	 * @return message
	 **/
	@ApiModelProperty(value = "Error message")

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ApiErrorResponse description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Details
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Details")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ApiErrorResponse errors(List<Error> errors) {
		this.errors = errors;
		return this;
	}

	public ApiErrorResponse addErrorsItem(Error errorsItem) {
		if (this.errors == null) {
			this.errors = new ArrayList<Error>();
		}
		this.errors.add(errorsItem);
		return this;
	}

	/**
	 * Relationship erros
	 * 
	 * @return errors
	 **/
	@ApiModelProperty(value = "Relationship erros")

	@Valid

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApiErrorResponse apiErrorResponse = (ApiErrorResponse) o;
		return Objects.equals(this.code, apiErrorResponse.code)
				&& Objects.equals(this.message, apiErrorResponse.message)
				&& Objects.equals(this.description, apiErrorResponse.description)
				&& Objects.equals(this.errors, apiErrorResponse.errors);
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, message, description, errors);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApiErrorResponse {\n");

		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
