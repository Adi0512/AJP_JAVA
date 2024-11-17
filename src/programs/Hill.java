package programs;

//Superclass: HillStations
class HillStations {

	void location() {
		System.out.println("Location: Himalayas");
	}

	void famousFor() {
		System.out.println("Famous For: Natural Beauty");
	}
}

//Subclass: Manali
class Manali extends HillStations {
	void location() {
		System.out.println("Location: Himachal Pradesh, India");
	}

	void famousFor() {
		System.out.println("Famous For: Skiing,Trekking and Rohtang Pass");
	}
}

//Subclass: Mussoorie
class Mussoorie extends HillStations {
	void location() {
		System.out.println("Location: Uttarakhand, India");
	}

	void famousFor() {
		System.out.println("Famous For: Scenic Views,Lal Tibba and Gun Hill");
	}
}

//Subclass: Gulmarg
class Gulmarg extends HillStations {
	void location() {
		System.out.println("Location: Jammu and Kashmir, India");
	}

	void famousFor() {
		System.out.println("Famous For: Skiing,Gondola Rides and Snow-covered Landscapes");
	}
}

class Hill {
	public static void main(String[] args) {
		// Create objects
		HillStations hs = new HillStations();
		Manali m = new Manali();
		Mussoorie mu = new Mussoorie();
		Gulmarg gu = new Gulmarg();

		// call Methods and objects
		hs.location();
		hs.famousFor();
		m.location();
		m.famousFor();
		mu.location();
		mu.famousFor();
		gu.location();
		gu.famousFor();
	}

}
