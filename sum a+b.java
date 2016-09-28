package practice;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        //codeabbey
        //sum "A+B"
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int a = input.nextInt(); //requests user input and stores it in "a"
        System.out.print("Please input another number: ");
        int b = input.nextInt();
        
        System.out.println(a + " + " + b + " = " + (a+b));   
    }
    
}
