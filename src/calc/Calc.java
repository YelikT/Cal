package calc;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        int num1, num2, num3;
        String operator1;
        String operator2;
        int result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        num1 = sc.nextInt();
       // System.out.println("Enter the first operator ( + , - , * , / ):");
        operator1 = sc.next();
       // System.out.println("Please enter the second number: ");
        num2 = sc.nextInt();
      //  System.out.println("Enter the second operator ( + , - , * , / ): ");
        operator2 = sc.next();
     //   System.out.println("Please enter the third number: ");
        num3 = sc.nextInt();
        sc.close();

        if (operator1.equals("+")){
            switch(operator2) {
                   case "+":
                        result = num1 + num2 + num3;
                        break;
                    case "-":
                        result = num1 + num2 - num3;
                        break;
                    case "*":
                        result = num1 + num2 * num3;
                        break;
                    case "/":
                        result = num1 + num2 / num3;
                        break;
                    default:
                        System.out.println("Error! Please enter a valid input");
                }
        }
        else if (operator1.equals("-")){
            switch(operator2) {
                case "+":
                    result = num1 - num2 + num3;
                    break;
                case "-":
                    result = num1 - num2 - num3;
                    break;
                case "*":
                    result = num1 - num2 * num3;
                    break;
                case "/":
                    result = num1 - num2 / num3;
                    break;
                default:
                    System.out.println("Error! Please enter a valid input");
            }
        }
        else if (operator1.equals("/")) {
                switch (operator2) {
                    case "+":
                        result = num1 / num2 + num3;
                        break;
                    case "-":
                        result = num1 / num2 - num3;
                        break;
                    case "*":
                        result = num1 / num2 * num3;
                        break;
                    case "/":
                        result = num1 / num2 / num3;
                        break;
                    default:
                        System.out.println("Error! Please enter a valid input");
                }
            }


       /* if (operator1.equals("+") && operator2.equals("+") ){
            result = num1 + num2 + num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("+") && operator2.equals("-") ){
            result = num1 + num2 - num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("+") && operator2.equals("*") ){
            result = num1 + num2 * num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("+") && operator2.equals("/") ) {
            result = num1 + num2 / num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("-") && operator2.equals("+") ){
            result = num1 - num2 + num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("-") && operator2.equals("-") ){
            result = num1 - num2 - num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("-") && operator2.equals("*") ) {
            result = num1 - num2 * num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("-") && operator2.equals("/") ){
            result = num1 - num2 / num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("*") && operator2.equals("+") ){
            result = num1 * num2 + num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("*") && operator2.equals("-") ) {
            result = num1 * num2 - num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("*") && operator2.equals("*") ){
            result = num1 * num2 * num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("*") && operator2.equals("/") ) {
            result = num1 * num2 / num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("/") && operator2.equals("+") ){
            result = num1 / num2 + num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("/") && operator2.equals("-") ) {
            result = num1 / num2 - num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("/") && operator2.equals("*") ){
            result = num1 / num2 * num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else if (operator1.equals("/") && operator2.equals("/") ) {
            result = num1 * num2 / num3;
            System.out.println(num1 + operator1 + num2 + operator2 + num3 + "=" + result);
        }
        else
            System.out.println("Please enter valid number or operator.");*/
        System.out.println(result);
    }
}
