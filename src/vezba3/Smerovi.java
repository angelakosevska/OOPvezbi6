package vezba3;
import java.util.ArrayList;
import java.util.List;
public class Smerovi {

	public static void main(String[] args) {
		List <String> smerovi= new ArrayList<>();
		smerovi.add("INKI");
		smerovi.add("IKT");
		smerovi.add("IKM");
		
		smerovi.add(2, "IKN");
		System.out.println(smerovi);
		

	}

}
