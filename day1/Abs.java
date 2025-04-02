package day1;

abstract class abs1 {
	public abstract void run();
}
class Example2 extends abs1{
	public void run() {
		System.out.println("The program is running");
	}
}
class Abs extends Example2{
	public static void main(String[]args) {
		Abs obj=new Abs();
		obj.run();
	}
}
