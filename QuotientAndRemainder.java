import java.util.Scanner;

class QuotientAndRemainder 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
    }
}
