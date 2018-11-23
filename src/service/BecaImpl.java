package service;



import java.util.List;

import beca.BecaPOA;
import beca.Llistado;
import profesion.Listado;
import profesion.ProfesionBeca;

public class BecaImpl extends BecaPOA {
	private ProfesionBeca profesion;

	public BecaImpl() {
		profesion = new ProfesionBeca();
	}
	@Override
	public Llistado[] getListado(String cs) {
		List<Listado> cots = profesion.getListado(cs);
		Llistado[] lessLits= new Llistado[cots.size()];
		for(int i=0; i<cots.size(); i++) {
			Listado mc=cots.get(i);
			Llistado cc=new Llistado();
			cc.numListado  = mc.getNumList();
			cc.codeSociety = mc.getCodeSociety();
			cc.dateListado = mc.getDateList().toString();
			cc.valAction   = mc.getValAction();
			lessLits[i] = cc;
			
		}
		return lessLits;
	}

	@Override
	public double getPromedioListado(String cs) {
		List<Listado> cots = profesion.getListado(cs);
		double somme=0;
		for(Listado c:cots) {
			somme+=c.getValAction();
		}
		return somme/cots.size();
	}

}
