package primer2;
import java.util.ArrayList;
import java.util.List;
public class Primer2 {

	public static void main(String[] args) {
		List<String> iminja= new ArrayList<>();
		iminja.add("Ana");
		iminja.add("Maja");
		iminja.add("Davor");
		
		System.out.println(iminja);
		
		iminja.add(0, "Angela");
		
		System.out.println(iminja.get(1));
		
		for(int i=0; i< iminja.size(); i++) {
			System.out.println(iminja.get(i));
		}

	}

}
