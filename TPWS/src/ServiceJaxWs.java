import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServiceJaxWs {

	public static void main(String[] args) {
		String url = "http://0.0.0.0:8686/";
		Endpoint.publish(url,new BanqueService());
		System.out.println("Web service déployé sur :"+url);
	}

}
