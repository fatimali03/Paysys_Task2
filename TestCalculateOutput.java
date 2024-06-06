public class TestCalculateOutput {
    public static void main(String[] args) {
        testSumGreaterThan100();
        testSumEqualTo100();
        testSumLessThan100();
        testNegativeInput();
        testZeroInput();
    }

    public static void testSumGreaterThan100() {
        int result = (int) calculateOutput(80, 60);
        if (result == 140) {
            System.out.println("testSumGreaterThan100 passed");
        } else {
            System.out.println("testSumGreaterThan100 failed");
        }
    }

    public static void testSumEqualTo100() {
        int result = (int) calculateOutput(25, 75);
        if (result == 1875) {
            System.out.println("testSumEqualTo100 passed");
        } else {
            System.out.println("testSumEqualTo100 failed");
        }
    }

    public static void testSumLessThan100() {
        int result = (int) calculateOutput(30, 50);
        if (result == 20) {
            System.out.println("testSumLessThan100 passed");
        } else {
            System.out.println("testSumLessThan100 failed");
        }
    }

    public static void testNegativeInput() {
        String result1 = (String) calculateOutput(15, -30);
        String result2 = (String) calculateOutput(-15, 30);
        String result3 = (String) calculateOutput(-15, -30);
        if (result1.equals("Error") && result2.equals("Error") && result3.equals("Error")) {
            System.out.println("testNegativeInput passed");
        } else {
            System.out.println("testNegativeInput failed");
        }
    }

    public static void testZeroInput() {
        String result1 = (String) calculateOutput(30, 0);
        String result2 = (String) calculateOutput(0, 30);
        String result3 = (String) calculateOutput(0, 0);
        if (result1.equals("Error") && result2.equals("Error") && result3.equals("Error")) {
            System.out.println("testZeroInput passed");
        } else {
            System.out.println("testZeroInput failed");
        }
    }

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
