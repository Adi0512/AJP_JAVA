package programs;

import java.util.LinkedList;

public class LinklistEx {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		System.out.println(ll + " ");
		//System.out.println(ll.getFirst());
		//System.out.println(ll.getLast());
		//System.out.println(ll.peekFirst());
		//System.out.println(ll.peekLast());
		// System.out.println(ll.removeFirst());
		// System.out.println(ll.removeLast());
		// ll.clear();
		System.out.println(ll.removeLast());
		 System.out.println(ll + " ");
	}

}
