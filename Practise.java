class P {
int a = 5;
}
class Q extends P {
void display() {
System.out.println("The value of a into Q class is:" + a);
}
}
class R extends P {
void display() {
System.out.println("The value of a into R class is:" + a);
}
}
class Practise
{
public static void main(String args[])
{
Q q1 = new Q();
q1.display();
R r1 = new R();
r1.display();
}
}