package org.orange;

import javax.jws.WebParam; 
import javax.jws.WebService; 
import javax.xml.ws.Endpoint; 
 
@WebService 

public class Main {
	public String doSomething(@WebParam(name="value", targetNamespace = "http://demo/", mode = WebParam.Mode.IN)String value) { 
        return "Just do it," + value + "!"; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8080/jdkwsdemo/demo.JdkWebService", new Main()); 

	}

}
