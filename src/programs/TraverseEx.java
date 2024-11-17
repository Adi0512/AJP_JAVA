package programs;

import java.util.*;

public class TraverseEx {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Rahul");
		al.add("Aditya");
		al.add("Ramu");
		al.add("Pathak");
		
		ListIterator<String> it=al.listIterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
			
		}
		System.out.println();
		while(it.hasPrevious())
		{
			System.out.print(it.previous() + " ");
		}
		

	}

}
