package day8;

interface Test {
	

	public void display(int a);
}

class Test_Lambda{

	public static void main(String[] args) {
		Test t=(a)-> System.out.println("Integer value of a is"+a);
		t.display(10);
	}
}
