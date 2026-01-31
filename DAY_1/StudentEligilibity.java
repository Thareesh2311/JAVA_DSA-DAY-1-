import java.util.Scanner;

public class StudentEligilibity {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the name:");
    String name = sc.nextLine();

    System.out.println("Enter the age:");
    int age = sc.nextInt();

    System.out.println("Enter the marks:");
    int marks = sc.nextInt();

    if(marks>=80){
        System.out.println("Student is eligible for Scholorship");
    }else{
        System.out.println("Student is not eligible for Scholorship");

    }

    
   } 
}
