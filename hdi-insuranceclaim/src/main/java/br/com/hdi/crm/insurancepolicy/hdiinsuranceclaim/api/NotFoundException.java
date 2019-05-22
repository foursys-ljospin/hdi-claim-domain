package br.com.hdi.crm.insurancepolicy.hdiinsuranceclaim.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-22T14:53:12.701Z")

public class NotFoundException extends ApiException {
	private static final long serialVersionUID = 1L;
	
	private int code;
	
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
