import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator:(+,-,*,/");
        char operator = sc.next().charAt(0);

        int result;

        if (operator == '+'){
            result = num1 + num2;
            System.out.println("Result: "+ result);
        }else if(operator == '-'){
            result = num1 - num2;
            System.out.println("Result: "+ result);
        }else if(operator == '*'){
            result = num1 * num2;
            System.out.println("Result: "+ result);
        }else if(operator == '/'){
            result = num1 / num2;
            System.out.println("Result: "+ result);
        }else{
            System.out.println("enter valid operator");
        }
        

    }
    
}
