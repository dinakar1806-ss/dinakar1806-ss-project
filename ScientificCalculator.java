import java.util.Scanner;

public class ScientificCalculator {

    
    static double addition(double a, double b) {
        return a + b;
    }

    static double subtraction(double a, double b) {
        return a - b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    
    static double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    static double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot find modulus with zero.");
        }
        return a % b;
    }


    static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    static double squareRoot(double number) {
        if (number < 0) {
            throw new ArithmeticException(
                "Square root of a negative number is not possible."
            );
        }
        return Math.sqrt(number);
    }


    static double percentage(double number, double percent) {
        return (number * percent) / 100;
    }

    static long factorial(int number) {
        if (number < 0) {
            throw new ArithmeticException(
                "Factorial of a negative number is not possible."
            );
        }

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }


    static double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    
    static double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }


    static double tangent(double angle) {
        return Math.tan(Math.toRadians(angle));
    }

    
    static double logarithm(double number) {
        if (number <= 0) {
            throw new ArithmeticException(
        "Logarithm is defined only for positive numbers."
            );
        }
        return Math.log10(number);
    }

    static double naturalLogarithm(double number) {
        if (number <= 0) {
            throw new ArithmeticException(
                "Natural logarithm is defined only for positive numbers."
            );
        }
        return Math.log(number);
    }

    static void displayMenu() {

        System.out.println("\n==================================");
        System.out.println("       SCIENTIFIC CALCULATOR");
        System.out.println("==================================");

        System.out.println("1.  Addition");
        System.out.println("2.  Subtraction");
        System.out.println("3.  Multiplication");
        System.out.println("4.  Division");
        System.out.println("5.  Modulus");
        System.out.println("6.  Power");
        System.out.println("7.  Square Root");
        System.out.println("8.  Percentage");
        System.out.println("9.  Factorial");
        System.out.println("10. Sine");
        System.out.println("11. Cosine");
        System.out.println("12. Tangent");
        System.out.println("13. Logarithm (Base 10)");
        System.out.println("14. Natural Logarithm");
        System.out.println("15. Exit");

        System.out.println("==================================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************");
        System.out.println("   WELCOME TO JAVA CALCULATOR");
        System.out.println("**********************************");

        while (true) {

            displayMenu();

            System.out.print("Enter your choice: ");

            try {

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter first number: ");
                        double a1 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        double b1 = sc.nextDouble();

                        System.out.println(
                            "Result = " + addition(a1, b1)
                        );
                        break;

                    case 2:
                        System.out.print("Enter first number: ");
                        double a2 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        double b2 = sc.nextDouble();

                        System.out.println(
                            "Result = " + subtraction(a2, b2)
                        );
                        break;

                    case 3:
                        System.out.print("Enter first number: ");
                        double a3 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        double b3 = sc.nextDouble();

                        System.out.println(
                            "Result = " + multiplication(a3, b3)
                        );
                        break;

                    case 4:
                        System.out.print("Enter dividend: ");
                        double a4 = sc.nextDouble();

                        System.out.print("Enter divisor: ");
                        double b4 = sc.nextDouble();

                        System.out.println(
                            "Result = " + division(a4, b4)
                        );
                        break;

                    case 5:
                        System.out.print("Enter first number: ");
                        double a5 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        double b5 = sc.nextDouble();

                        System.out.println(
                            "Result = " + modulus(a5, b5)
                        );
                        break;

                    case 6:
                        System.out.print("Enter base: ");
                        double base = sc.nextDouble();

                        System.out.print("Enter exponent: ");
                        double exponent = sc.nextDouble();

                        System.out.println(
                            "Result = " + power(base, exponent)
                        );
                        break;

                    case 7:
                        System.out.print("Enter number: ");
                        double number = sc.nextDouble();

                        System.out.println(
                            "Square Root = " + squareRoot(number)
                        );
                        break;

                    case 8:
                        System.out.print("Enter number: ");
                        double value = sc.nextDouble();

                        System.out.print("Enter percentage: ");
                        double percent = sc.nextDouble();

                        System.out.println(
                            percent + "% of " + value +
                            " = " + percentage(value, percent)
                        );
                        break;

                    case 9:
                        System.out.print("Enter a non-negative integer: ");
                        int factorialNumber = sc.nextInt();

                        System.out.println(
                            "Factorial = " + factorial(factorialNumber)
                        );
                        break;

                    case 10:
                        System.out.print("Enter angle in degrees: ");
                        double angle1 = sc.nextDouble();

                        System.out.println(
                            "sin(" + angle1 + ") = " + sine(angle1)
                        );
                        break;

                    case 11:
                        System.out.print("Enter angle in degrees: ");
                        double angle2 = sc.nextDouble();

                        System.out.println(
                            "cos(" + angle2 + ") = " + cosine(angle2)
                        );
                        break;

                    case 12:
                        System.out.print("Enter angle in degrees: ");
                        double angle3 = sc.nextDouble();

                        System.out.println(
                            "tan(" + angle3 + ") = " + tangent(angle3)
                        );
                        break;

                    case 13:
                        System.out.print("Enter number: ");
                        double logNumber = sc.nextDouble();

                        System.out.println(
                            "log10(" + logNumber + ") = " +
                            logarithm(logNumber)
                        );
                        break;

                    case 14:
                        System.out.print("Enter number: ");
                        double lnNumber = sc.nextDouble();

                        System.out.println(
                            "ln(" + lnNumber + ") = " +
                            naturalLogarithm(lnNumber)
                        );
                        break;

                    case 15:
                        System.out.println("\nThank you for using");
                        System.out.println("JAVA SCIENTIFIC CALCULATOR!");
                        System.out.println("Goodbye! 👋");
                        sc.close();
                        return;

                    default:
                        System.out.println(
                            "Invalid choice! Please select 1-15."
                        );
                }

            } catch (ArithmeticException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {

                System.out.println(
                    "Invalid input! Please enter the correct data type."
                );

                sc.nextLine();
            }
        }
    }
}