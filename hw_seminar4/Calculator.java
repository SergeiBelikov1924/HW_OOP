package HWSeminar4.Calculator;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Нельзя делить на ноль!");
        }
        return num1 / num2;
    }

    public String toBinaryString(int num) {
        return Integer.toBinaryString(num);
    }

    public String toBinaryString(String num) {
        int intValue = Integer.parseInt(num);
        return Integer.toBinaryString(intValue);
    }
}
