class Addition
{
int a,b,c;
void add(int x,int y)
{
a=x;
b=y;
c=a+b;
System.out.println("the addition value is:"+c);
}
}
class Withoutarg1
{
public static void main(String args[])
{
int m=67,n=34;
Addition a1=new Addition();
a1.add(m,n);
}
}
