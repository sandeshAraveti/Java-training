import java.util.SortedSet;
import java.util.TreeSet;


public class SortStudent {
public static void main(String[] args) {
	SortedSet<Studentt> students=new TreeSet<Studentt>();
	students.add(new Studentt(1,"Sowmya","Nellore",7.2));
	students.add(new Studentt(3,"Harika","tirupati",9.4));
	students.add(new Studentt(4,"gayi","chittoor",9.4));
	students.add(new Studentt(5,"sai","guntur",9.8));
	for (Studentt student2 : students) {
		System.out.println(student2);
		
	}
	
}
}
