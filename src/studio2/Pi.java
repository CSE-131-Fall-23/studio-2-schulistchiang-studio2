package studio2;

public class Pi {

	public static void main(String[] args) {
		
		int nsims = 10000000;
		
		int inside = 0;
		
		for (int i = 0; i < nsims; i++) {
			if (simulant()) {
				inside ++;
			}
		}
		
		System.out.println(((double) inside / nsims) * 4.);
		

	}
	
	public static boolean simulant() {
		double x_coord = Math.random();
		double y_coord = Math.random();
		
		double distance = Math.sqrt(x_coord * x_coord + y_coord * y_coord);
		
		if (distance <= 1) {
			return true;
		} 
		return false;
	}

}
