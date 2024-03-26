public class Spheroid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter equatorial radius in km: ");
		double Eratious =  scanner.nextDouble();
		System.out.print("Enter polar radius in km: ");
		double Pratious =  scanner.nextDouble();
		scanner.close();
		double Asquare = Math.pow(Eratious, 2);
		double Csquare = Math.pow(Pratious, 2);
		double Esquare = 1-(Csquare/Asquare);
		double Eccentricity = Math.sqrt(Esquare);
	    System.out.printf("Eccentricity = %.3f%n", Eccentricity);
		double pi = Math.PI;
		double Volume = 4*pi*Asquare*Pratious/3;
		int magnitude = (int) Math.floor(Math.log10(Volume));
		double power = Math.pow(10, magnitude);
		double Enumber = Volume/power;
		System.out.printf("Volume = %.5fe+%d cubic km%n", Enumber, magnitude);
	}
}
