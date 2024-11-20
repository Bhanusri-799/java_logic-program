// Method Overriding

class Addition {
int c=100;
void Disp() {
System.out.println("The c Value is:"+c);
}
}
class Addition1 extends Addition {
int b=200;
void Disp() {
System.out.println("The b Value is:"+b);
}
}
class Addition2 {
public static void main(String args[]) {
Addition a1=new Addition();
Addition a2=new Addition();
Addition a;
a=a1;
a.Disp();
a=a2;
a.Disp();
}
}