public class FeetToCentimeters {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(50));
        System.out.println(calcFeetAndInchesToCentimeters(1, 2));

    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            double centimeters = (feet * 12 + inches) * 2.54;
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        } else {
            int feet = inches / 12;
            int remainingInches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}
