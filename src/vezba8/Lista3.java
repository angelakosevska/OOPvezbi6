package vezba8;
import java.util.*;

public class Lista3 {

	public static void main(String[] args) {
		List <String> list =new ArrayList<>();

		for (int i=0; i<20; i+=5) {
			list.add("mail"+ (i+5) + "yahoo.com");
		}
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	}

