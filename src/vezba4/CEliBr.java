package vezba4;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class CEliBr {

	public static void main(String[] args) {
		List<Integer> broevi =new ArrayList<>();
		broevi.add(5);
		broevi.add(2);
		broevi.add(4);
		broevi.add(1);
		broevi.add(7);

		Collections.sort(broevi);
		System.out.println(broevi);
	}

}
