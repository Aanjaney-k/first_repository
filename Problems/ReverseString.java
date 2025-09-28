import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String str = "", strrev = "";
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = s.nextLine();

        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            strrev = strrev + str.charAt(i);
        }

        System.out.println("String Reversed = " + strrev);
        s.close();
    }
}
