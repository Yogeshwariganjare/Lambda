package JavaAssignment7;
import java.util.Arrays;
import java.util.List;

public class Replaceup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"bit coin","stock market","coin master","master"};
		List<String> arrayList=Arrays.asList(arr);
		arrayList.replaceAll(e->e.toUpperCase());
		System.out.println(arrayList);
		
	}

}


