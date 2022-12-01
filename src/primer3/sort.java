package primer3;
import java.util.ArrayList;
import java.util.List;
import java.util.* ;
public class sort {

	public static void main(String[] args) {
		List<String> fakulteti= new ArrayList<>();
		fakulteti.add("Fikt");
		fakulteti.add("TFB");
		fakulteti.add("BioTehn");
		
		Collections.sort(fakulteti);
		
		System.out.println(fakulteti);

	}

}
