package unlam.edu.ar.dominio;

import java.util.HashSet;

public class Parto {
	private Madre madre;
	private HashSet<Bebe> bebes = new HashSet<>();
	private HashSet<Partera> parteras = new HashSet<>();
	private Obstetra obstetra;
	
	public Parto(Madre madre, Obstetra obstetra) {
		this.obstetra = obstetra;
		this.parteras= new HashSet<Partera>();
		this.bebes= new HashSet<Bebe>();
		this.madre=madre;
	}


}
