import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		SortedSet<Employ> employs=new TreeSet<Employ>();
		employs.add(new Employ(21,"Sai","SWE","Manager",56980));
		employs.add(new Employ(34,"Priya","SWE","Programmer",96900));
		employs.add(new Employ(54,"Somya","SWE","Assistant manager",78900));
		for (Employ employ : employs) {
			System.out.println(employ);
		}
		
	}
	
}
