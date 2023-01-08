import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		// how to add element into linkedlist- by using add() method
		l.add(10); // Insertion order is preserved
		l.add(15);
		l.add(45);
		l.add(null); // Duplicate is allowed
		l.add("Pune");
		l.add("Nagpur");// Hetereogenius Object is allowed
		l.add(null); // null insertion is allowed
		l.addLast("pune");// addLast method use when we want the element at Last position
		l.addFirst("Velocity"); // addFirstt method use when we want the element at Fisrt position

		System.out.println(l);

	}

}
