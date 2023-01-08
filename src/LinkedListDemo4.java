import java.util.LinkedList;

public class LinkedListDemo4 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add(10);
		l.add(15);
		l.add(45);
		l.add(10);
		l.add("Pune");
		l.add("Nagpur");
		l.add(null);
		l.add("pune");
		l.add("Velocity");

		// System.out.println(l.getFirst());
		// System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);

	}

}
