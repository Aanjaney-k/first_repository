import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        int reversed = 0;
        int original = num;
        
        while (num != 0) {
            int digit = num % 10;                
            reversed = reversed * 10 + digit;    
            num = num / 10;                       
        }
        
        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);
        
        sc.close();
    }
}

