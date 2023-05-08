package unlam.edu.ar.dominio;

import java.util.HashSet;

public class Parto {
	private Madre madre;
	private HashSet<Bebe> bebes = new HashSet<>();
	private HashSet<Partera> parteras = new HashSet<>();
	private HashSet<Obstetra> obstetras;
	
	public Parto(Madre madre) {
		this.obstetras= new HashSet<Obstetra>();
		this.parteras= new HashSet<Partera>();
		this.bebes= new HashSet<Bebe>();
		this.madre=madre;
	}


}
