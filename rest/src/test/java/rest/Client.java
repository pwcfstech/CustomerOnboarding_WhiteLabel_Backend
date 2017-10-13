package rest;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.afrAsia.soap.IDTDPSSoapService;

public class Client {

	static {
	    //for localhost testing only
	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){

	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	            if (hostname.equals("localhost")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}

	/*public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:8090/DigitalTransaction?wsdl");
		QName qname = new QName("http://ubi.com", "DTDPSSoapServiceService");

		Service service = Service.create(url, qname);
		IDTDPSSoapService rs = service.getPort(IDTDPSSoapService.class);
		System.out.println(rs.getDigitalTransaction("", "", "", ""));
	}*/

}
