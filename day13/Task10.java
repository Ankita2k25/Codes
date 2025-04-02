package day13;
class B<T> {
private T test;
B(T test){
	this.test=test;
}
T getTest() {
	return test;
}
}

class Task10{
	public static void main(String[] args) {
		B<String>obj=new B("S");
		System.out.println(obj.getTest());
	}
}