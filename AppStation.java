package stationEx;

public class AppStation {

	public static void main(String[] args) {
		Station2025 staion=new Station2025("tilila");
		Bus2025 bus=new Bus2025("16", 2000, staion);
		Passenger2025[] passengers= {
				new Passenger2025("kaoutar", 1800, staion),
				new Passenger2025("hl", 1500, staion),				
				new Passenger2025("sm", 2500, staion),
				new Passenger2025("kl", 1200, staion)
				};	
		bus.start();
		for (Passenger2025 passenger  : passengers) {
			passenger.start();	
		}
	
		
	}

}
