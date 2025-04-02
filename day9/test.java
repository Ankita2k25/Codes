package day9;
final class immutable{
private int age;
private String name;
	immutable(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Name "+name+" Age "+age);
	}
	
}
 public class test {
	 public static void main(String[]args) {
		 immutable obj=new immutable(24,"Aisha");
		 obj.display(); 
	 }
	 
}
