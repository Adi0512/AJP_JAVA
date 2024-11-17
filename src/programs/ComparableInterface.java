package programs;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	int sid;
	String sName;
	
	public Student(int sid,String sName) {
		super();
		this.sid=sid;
		this.sName=sName;
		
	}
	
	@Override
	public int compareTo(Student ob) {
		if(sid==ob.sid)
			return 0;
		else if(sid>ob.sid)
			return 1;
		else
			return -1 ;
			
		// yeh Example me ek baar me kevel ek element compare krwa sakte hai aur ushko sort krwwa ke print krwa sakte hai 
	}
}

public class ComparableInterface {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Aditya"));
		al.add(new Student(104,"Ashu"));
		al.add(new Student(108,"vishu"));	
		al.add(new Student(102,"sapna"));	
       // System.out.println();
		Collections.sort(al);
		
		for(Student s:al)
		{
			System.out.println(s.sid+" "+s.sName);
		}
	}

}










