package vezba2;
import java.util.ArrayList;
import java.util.List;
public class Drzavi {

	public static void main(String[] args) {
		List<String> drzava= new ArrayList<>();
		drzava.add("MK");
		drzava.add("SR");
		//drzava.add("BIH");
		drzava.add("HR");
		System.out.println("Golemina na listata: "+ drzava.size());
		//int size = drzava.size();
		if (drzava.size() ==3) {
			drzava.add("BG");
			drzava.add("GR");
			System.out.println(drzava);
		}
			else {
				System.out.println(drzava);
		}
	}

}
