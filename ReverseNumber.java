import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter 4 number: ");
        int number1 = inp.nextInt();
        int number2 = inp.nextInt();
        int number3 = inp.nextInt();
        int number4 = inp.nextInt();

        System.out.println("Number: " + number1 +" "+ +number2 +" "+ +number3 +" "+ +number4);
        System.out.println("Reversed Number: " +number4 +" "+ +number3 +" "+ +number2 +" "+ + number1);
    }

    
}
