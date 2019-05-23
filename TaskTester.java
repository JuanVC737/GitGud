import java.util.*;
public class TaskTester 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner( System.in );
        System.out.println( "Enter your name: ");
        String name = s.nextLine();
        System.out.println( "Your new name is: " + reverse(name) );
    }
    
    public static String reverse(String name) 
    {
        String boi = "";
        for ( int x = name.length() - 1; x >= 0; x-- ) {
            boi += name.charAt(x);
        }
        return boi;
    }
}
