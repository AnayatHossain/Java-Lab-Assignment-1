import java.util.Scanner;

class AreaOfCircle{
    public static void main(String [] args)
{
 Scanner inp = new Scanner(System.in);
        System.out.print("Enter area number: ");
        double r = inp.nextDouble();
        double a= 3.1416*(r*r);
 
System.out.println("The Area Of Circle is:"+a);
}

}
