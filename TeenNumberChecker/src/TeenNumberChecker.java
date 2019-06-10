public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int first, int second, int third) {
        boolean firstBool = first <= 19 && first >= 13;
        boolean secondBool = second <= 19 && second >= 13;
        boolean thirdBool = third <= 19 && third >= 13;
        return firstBool || secondBool || thirdBool;
    }
    public static boolean isTeen(int num) {
        return num <= 19 && num >= 13;
    }
}
