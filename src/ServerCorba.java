import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import service.BecaImpl;

public class ServerCorba {
	public static void main (String[]args) {
		try {
			
			//Initial ORB
			ORB orb= ORB.init(args, null);
			//Activate POA manager
			POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			//Activate POA manager
			BecaImpl banc = new BecaImpl();
			//Crear el contexto de nombres
			NamingContext root = NamingContextHelper.narrow(orb.resolve_initial_references("NameService"));
			//Crear una tabla de nombres que valua los atributos del objeto
			NameComponent[] nsNom = new NameComponent[1];
			//Definir un nombre publico del objeto distante
			nsNom[0] = new NameComponent("BECA","");
			//Registrar la referencia del objeto distante dando el nombre
			//Servicio
			root.rebind(nsNom, rootPOA.servant_to_reference(banc));
			//Inicio del servicio
			orb.run();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
