class calculator
{
 void send( double x)
{
System.out.println("display no "+x);
}
 void send( String y)
{
System.out.println("display msg "+y);
}
 void send( double x,String y)
{
System.out.println("display no display msg "+x+y);
}

}
class maincul
{
public static void main(String[] args)
{
calculator t1=new calculator();
t1.send(5454.5454);
t1.send("hi");
t1.send(123.36,"hello");
}
}
