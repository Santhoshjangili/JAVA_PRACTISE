import java.util.Scanner;
public class Evenodd
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("size of an array");
        n = sc.nextInt();
        int a[] = new int[n];
      
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
       
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print("Odd nums"+a[i]);
            }
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print("even num"+a[i]);
            }
        }
    }
}