public class VolOfEarth {
	public static void main(String[] args) {
		// Radius of the Earth in kilometers
        double radiusKm = 6378;

        // Constant for PI
        double pi = 3.14;

        // Volume of sphere formula: (4/3) * π * r cube
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        double kmToMilesFactor = Math.pow(0.621371, 3); // Convert km cube to mi cube (1 km = 0.621371 miles => (km cube to mi cube = 0.621371 cube))
        double volumeMiles3 = volumeKm3 * kmToMilesFactor;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3); // Output the result
    

	}
}