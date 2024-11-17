package programs;


class Plane
{
void fly()
{
	System.out.println("hello");
}
}

class Cargoplane extends Plane
{
void fly()
{
	System.out.println("cargo1...");
}
}
class Fighterplane extends Plane
{
void fly()
{
	System.out.println("fighter1...");
}
}
public class PolyEx {

	public static void main(String[] args) {
		
		Cargoplane cp=new Cargoplane();
		Fighterplane fp=new Fighterplane();
		// cp.fly();
		// fp.fly();
		Plane ref;
		ref=cp;
		ref.fly();
		ref=fp;
		ref.fly();
		}

}
