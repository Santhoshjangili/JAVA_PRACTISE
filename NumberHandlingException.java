import java.util.*;
public class NumberHandlingException
{
public static void main(String[] args) {
String s="santhosh";


try {
 int num=Integer.parseInt(s);   
System.out.println(num);

}
catch (Exception e)
    {
        System.out.println(e);
    }
        System.out.println("Hello World");
}
}