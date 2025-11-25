package stationEx;

public class Passenger2025 extends Thread {
	private String nom;
	private int heureArrivee;
	private Station2025 station; 
	
	public Passenger2025(String nom, int heureArrivee, Station2025 station) {
		super(nom);
		this.nom = nom;
		this.heureArrivee = heureArrivee;
		this.station = station;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(heureArrivee);
			System.out.println(nom+" arrive a la station");
			station.attendreBus();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}
