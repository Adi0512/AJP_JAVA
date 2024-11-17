package programs;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingElement {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(80);
		al.add(44);
		al.add(22);
		al.add(88);
		al.add(50);
		System.out.println(al);
		
		//Collections.swap(al,0,4);
		//System.out.println("List after swapping:" +al);
		
		//Collections.reverse(al);
		//System.out.println("List after reverse:" +al);
		
		Collections.sort(al);
		System.out.println("List after sorting:" +al);
	}

}
