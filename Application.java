package TpProducteurConsommateur;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoiteLettre bl=new BoiteLettre();
		Lettre lettre1=new Lettre("hello olaya this is the letter \n"+"bonne journee, On se voit demain", "kaoutar", "olaya");
		Lettre lettre2=new Lettre("Salut kaoutar Allons y pour un café à 12h \n"+"b.w, On se voit demain", "olaya", "kaoutar");
		Producteur prod1=new Producteur("kaoutar", lettre1, bl);
		Producteur prod2=new Producteur("olaya", lettre2, bl);
		Consommateur cons1=new Consommateur("olaya", lettre1, bl);
		Consommateur cons2=new Consommateur("kaoutar", lettre2, bl);
		prod1.start();
		prod2.start();
		cons1.start();
		cons2.start();

	}

}
