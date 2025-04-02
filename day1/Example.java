package day1;

class encaps {
	String name;
	encaps(String naam)
	{
		name=naam;
	}
	void getname() {
		System.out.print("Student name is: "+name);	
		}
}

class Example{

		public static void main(String[]args) {
			encaps ex=new encaps("Ankita");
			ex.getname();
		}
}

