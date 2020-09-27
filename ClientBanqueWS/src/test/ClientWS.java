package test;

import java.rmi.RemoteException;
import ws.BanqueServiceProxy;
import ws.Compte;

public class ClientWS {

	public static void main(String[] args) throws RemoteException {
		BanqueServiceProxy stub = new BanqueServiceProxy();
	    System.out.println(stub.conversionEuroToDH(34));
	    Compte compte = stub.getCompte(3);
	    System.out.println("Code="+compte.getCode());
	    System.out.println("Code="+compte.getSolde());
	    Compte[] comptes = stub.listComptes();
	    for(Compte cp:comptes) {
	    	System.out.println("+++++++++++++++++++++++++");
	    	System.out.println("code = "+ cp.getCode());
	    	System.out.println("solde = "+ cp.getSolde());
	    	System.out.println("+++++++++++++++++++++++++");
	    }
	}

}
