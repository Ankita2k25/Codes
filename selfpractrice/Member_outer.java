package selfpractrice;

public class Member_outer {
	private String name="Ankita Mitra";
	class Member_inner{
		void msg() {
			System.out.println("My name is : "+name);
		}
	}
	public static void main(String[] args) {
		Member_outer obj1=new Member_outer();
		Member_outer.Member_inner obj2=obj1.new Member_inner();
		obj2.msg();
	}
}
