package vezba7;
import java.util.*;
public class Lista2 {

	public static void main(String[] args) {
		List <String> list =new ArrayList<>();

		for (int i=0; i<20; i++) {
			if (i<9) {
			list.add("mail0"+ (i+1) + "yahoo.com");}
			else 
				list.add("mail"+ (i+1) + "yahoo.com");
		}
		
		for (int i=0; i<20; i++) {
			System.out.println(list.get(i));
		}
	}


}
