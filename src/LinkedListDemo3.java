import java.util.LinkedList;

public class LinkedListDemo3 {
	//Design the method with return the LInkedList object to the method...
		public LinkedList getData() {
		
		LinkedList l = new LinkedList();
			l.add("velocity");
			l.add(12);
			l.add("pune");
			l.add(45);
		
			return l;
			
		}
			public static void main(String[] args) {
				
				LinkedListDemo3 lnk = new LinkedListDemo3();
				
				LinkedList list =lnk.getData();
		
				System.out.println(list);
	}

}
