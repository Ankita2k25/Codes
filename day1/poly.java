package day1;
class poly1{
	public void numbers(int a,int b) {
		System.out.println(a+b);
	}
	public void numbers(double c) {
		System.out.print(c);
	}
}
public class poly{
	public static void main(String []args) {
		poly1 p=new poly1();
		p.numbers(2,3);
		p.numbers(2.3);
	}
	
	
}
