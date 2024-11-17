package programs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class UnionEx {

	public static void main(String[] args) {
		
      Set<Integer> l=new HashSet<Integer>();
       l.add(8);
       l.add(7);
       l.add(6);
       l.add(5);
       l.add(13);
       l.add(9);
       l.add(10);
       System.out.println(l);
       
       Set<Integer> l1=new HashSet<Integer>(l);
       l1.add(12);
       l1.add(21);
       l1.add(5);
       l1.add(8);
       l1.add(31);
       l1.add(66);
       l1.add(10);
       System.out.println(l1);
       
       l1.addAll(l1);
       System.out.println(l);
       
	}

}
