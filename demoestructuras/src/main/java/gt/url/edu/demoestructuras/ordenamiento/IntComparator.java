package gt.url.edu.demoestructuras.ordenamiento;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 < o2) return -1;
		else if(o1 == o2) return 0;
		else return 1;
	}

}
