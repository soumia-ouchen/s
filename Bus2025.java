package stationEx;

public class Bus2025 extends Thread {
	private String id;
	private int heureArrivee;
	private Station2025 station; 
	 
	public Bus2025(String id, int heureArrivee, Station2025 station) {
		super(id);
		this.id = id;
		this.heureArrivee = heureArrivee;
		this.station = station;
	}


	@Override
	public void run() {
		try {
			Thread.sleep(heureArrivee);
			System.out.println("bus "+id+" arrive a la station");
			station.chargerPassengers();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
}

																										