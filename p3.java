/**
 * By : Ahad Ulla Baig
 * Date : 26-11-2022
 * STD : 11 A
 */
public class p3
{
    public static void main(String[]args)
    {
        int k=1;
        for(int i=1; i<=5; i++) // row loop
        {
            for(int j=1; j<=i; j++, k++) // column loop
            {
                System.out.print(k+" "); // printing pattern
            }
            System.out.println();
        }
    }    
}