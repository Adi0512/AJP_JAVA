package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1
{
	int id;
	String Name;
    
	public Student1(int id, String Name){
		super();
		this.id=id;
		this.Name=Name;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", Name=" + Name + "]";
	}
	
}

class CompareId implements Comparator<Student1>
{
	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.id-o2.id;
		
	}
}
class CompareName implements Comparator<Student1>
{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.Name.compareTo(o2.Name);
		
	}
	
}

public class CompareEx {
	
	public static void main(String[] args) {
		
		ArrayList<Student1> al=new ArrayList<Student1>();
		al.add(new Student1(101,"Aditya"));
		al.add(new Student1(111,"Ashu"));
		al.add(new Student1(108,"vishu"));	
		al.add(new Student1(102,"sapna"));	
		Collections.sort(al,new CompareName());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Collections.sort(al,new CompareId());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		
		
	}

}


