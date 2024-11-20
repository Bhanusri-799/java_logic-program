// Final Keyword

class Final1 {
void Disp() {
System.out.println("it is Super Class");
}
}
class Final2 extends Final1 {
final void Disp() {
super.Disp();
System.out.println("it is Sub Class");
}
}

class Final3 { 
public static void main(String args[]) {
Final2 f=new Final2();
f.Disp();
}
}