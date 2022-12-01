package vezba9;
import java.util.*;

public class Glavna {

	public static void main(String[] args) {
		List <Fakultet> faks = new ArrayList<Fakultet>();
		Fakultet faks1 = new Fakultet("Fikt", 2, 350);
		faks.add(faks1); //1
		faks.add(new Fakultet("BioTehn", 5, 400)); //2
		faks.add(new Fakultet("Tehn", 7, 330)); //3
		Fakultet faks4 = new Fakultet("Masinski", 4, 420);
		faks.add(faks4); //4
		Fakultet faks5 = new Fakultet("Pedagoski", 6, 150);
		faks.add(faks5); //5
		for (int i=0; i<faks.size(); i++) {
			System.out.println(faks.get(i).getIme()+" "+faks.get(i).getSmerovi()+" "+faks.get(i).getStudenti());
			
		}
	}

}
