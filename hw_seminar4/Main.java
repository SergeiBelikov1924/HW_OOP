package HWSeminar4.Calculator;


public class Main {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();
    
            int num1 = 7;
            int num2 = 25;
            int sum = calculator.add(num1, num2);
            System.out.println("Sum: " + sum);
    
            int difference = calculator.subtract(num1, num2);
            System.out.println("Difference: " + difference);
    
            int product = calculator.multiply(num1, num2);
            System.out.println("Product: " + product);
    
            int quotient = calculator.divide(num1, num2);
            System.out.println("Quotient: " + quotient);
    
            String binary = calculator.toBinaryString(num1);
            System.out.println("Binary representation of " + num1 + ": " + binary);
    
            String binary2 = calculator.toBinaryString("15");
            System.out.println("Binary representation of 15: " + binary2);
        }
    }
    