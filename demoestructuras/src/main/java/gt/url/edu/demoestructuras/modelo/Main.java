package gt.url.edu.demoestructuras.modelo;

import gt.url.edu.demoestructuras.ds.ArrayList;
import gt.url.edu.demoestructuras.ds.List;

public class Main {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add(0, "Marco");
		myList.add(0, "Polo");
		for (String string : myList) {
			System.out.println(string);
		}
		
	}
	

}
