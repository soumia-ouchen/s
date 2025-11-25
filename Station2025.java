package stationEx;

public class Station2025 {
	private int passengerEnAttente=0;
	private boolean busPresent=false;;
	private String nom;
	
	public Station2025(String nom) {
		super();
		this.nom = nom;
	}
	// appl par passenger
	public synchronized void attendreBus() throws InterruptedException { 
				passengerEnAttente++;
				System.out.println(Thread.currentThread().getName()+" attend le bus");	
				while(!busPresent) {
					wait();
				}
				System.out.println(Thread.currentThread().getName()+" monte dans le bus");
				passengerEnAttente--;
				if (passengerEnAttente ==0) {
					notify();
				} 
	}
	
	// appl par bus
	public synchronized void chargerPassengers() throws InterruptedException {
		busPresent=true;
		System.out.println("Bus "+Thread.currentThread().getName()+" ouvre ses portes"); 
		notifyAll();
		while(passengerEnAttente>0) {
			wait();
			}
		busPresent=false;
		System.out.println("tous les passangers sont montés le bus peut partir");
	}
	public String getNom() {
		return nom;
	}
	
}
