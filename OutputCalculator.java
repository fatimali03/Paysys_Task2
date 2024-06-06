// OutputCalculator.java
public class OutputCalculator {
    public static Object calculateOutput(int a, int b) {
        if (a <= 0 || b <= 0) {
            return "Error";
        }
        int sumOfNumbers = a + b;
        if (sumOfNumbers > 100) {
            return sumOfNumbers;
        } else if (sumOfNumbers == 100) {
            return a * b;
        } else {
            return Math.abs(a - b);
        }
    }
}
