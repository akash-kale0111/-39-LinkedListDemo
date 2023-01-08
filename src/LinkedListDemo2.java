import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
	
	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>(); //with string 
		
		l.add("Nagpur");
		l.add("Velocity");
		l.add("Banglore");
		
		Iterator<String> itr =l.iterator(); //by using iteretor
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}
}
