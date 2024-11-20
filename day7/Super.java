// Metnod Overriding with Super Keyword

class Addition {
int c;
void Add(int a, int b) {
c=a+b;
System.out.println("The Addition Value is:"+c);
}
}
class Addition1 extends Addition {
void Add(int a, int b) {
super.Add(33,22);
c=a+b;
System.out.println("The Addition Value is:"+c);
}
}
class Super {
public static void main(String args[]) {
Addition a1=new Addition();
a1.Add(11,22);
}
}