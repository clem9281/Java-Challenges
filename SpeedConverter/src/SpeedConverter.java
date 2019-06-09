public class SpeedConverter {
    public static void main(String[] args) {
//        System.out.println(toMilesPerHour(1.5));
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        double miles = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + (int) miles + " mi/h");
        }
    }
}
