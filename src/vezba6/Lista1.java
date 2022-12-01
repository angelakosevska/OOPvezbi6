package vezba6;
import java.util.*;
public class Lista1 {

	public static void main(String[] args) {
		List <String> list =new ArrayList<>();

		for (int i=0; i<20; i++) {
			list.add("mail"+ (i+1) + "yahoo.com");
		}
		
		for (int i=0; i<20; i++) {
			System.out.println(list.get(i));
		}
	}

}
