// Method OverLoading

class Addition {
int c;
void Add(int a, int b) {
c=a+b;
System.out.println("The Addition Of Values is:"+c);
}
void Add(int a, int b, int d) {
c=a+b+d;
System.out.println("The Addition Of Values is:"+c);
}
}
class Main {
public static void main(String args[]) {
Addition a1=new Addition();
a1.Add(10,20);
a1.Add(10,20,30);
}
}