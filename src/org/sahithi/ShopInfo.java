package org.sahithi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
//default document
@SOAPBinding(style=Style.RPC)

public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookupOutput")
	//faultMessage
	public String getShopInfo(@WebParam(partName="lookupInput") String property) throws InvalidInputException {
		
		String response = null;
		
		if ("shopName".equals(property)) {
			response = "Test";
		}
		else if ("since".equals(property)) {
			response = "since 1994";
		}
		else {
			throw new InvalidInputException("Invalid Input", property + " is not a valid input");
		}
		
		return response;
	}
	
	
}
