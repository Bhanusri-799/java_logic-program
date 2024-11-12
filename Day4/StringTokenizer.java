import java.util.*;
class StringTokenizer
{
public static void main(String args[])
{
String='t';
String st1="Hai Hello Welcome To Java Program";
StringTokenizer t=new StringTokenizer(st1);
System.out.println("the no.of tokens available in given string is:"+t.countTokens());
while(t.hasMoreTokens())
{
System.out.println(t.nextToken());
}
}
}