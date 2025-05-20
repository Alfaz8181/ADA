public class LCMCalculator {
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int lcmArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {

            result = lcm(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 15, 20, 25 };
        int result = lcmArray(numbers);
        System.out.println("LCM of the array is: " + result);
    }

}