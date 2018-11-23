package profesion;

import java.util.Iterator;

public class TestProfesion {
	public static void main(String[] args) {
		ProfesionBeca Prof = new ProfesionBeca();
		Iterator<Listado> it = Prof.getListado("SGMB").iterator();
		while(it.hasNext()) {
			Listado list = it.next();
			System.out.println(list.getDateList()+"\t"+list.getValAction());
		}
		
	}

}
