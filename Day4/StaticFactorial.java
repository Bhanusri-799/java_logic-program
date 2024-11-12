class StaticFactorial
{
static int i,n=5,f=1;
static void fact()
{
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("the factorial value is:"+f);
}
}
class Main
{
public static void main(String[] args)
{
StaticFactorial.fact();
}
}