import java.util.Scanner;
class Factors
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        num=sc.nextInt();
       for(int i=1;i<=num;i++)
        {
           if(num%i==0)
           {
           System.out.println(i);
           }
        }
        
    }
}