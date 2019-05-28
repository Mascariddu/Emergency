package it.polito.tdp.emergency.model;

import java.util.Comparator;

import it.polito.tdp.emergency.model.Paziente.StatoPaziente;

public class prioritaPaziente implements Comparator<Paziente>{

	@Override
	public int compare(Paziente o1, Paziente o2) {
		// TODO Auto-generated method stub
		if(o1.getStato() == StatoPaziente.WAITING_RED && o2.getStato() != StatoPaziente.WAITING_RED)
			return -1;
		if(o1.getStato() != StatoPaziente.WAITING_RED && o2.getStato() == StatoPaziente.WAITING_RED)
			return 1;
		
		if(o1.getStato() == StatoPaziente.WAITING_YELLOW && o2.getStato() != StatoPaziente.WAITING_YELLOW)
			return -1;
		if(o1.getStato() != StatoPaziente.WAITING_YELLOW && o2.getStato() == StatoPaziente.WAITING_YELLOW)
			return -1;
		
		return o1.getOraArrivo().compareTo(o2.getOraArrivo());
	}

}
