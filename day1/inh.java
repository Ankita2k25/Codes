package day1;
import java.lang.reflect.Method;
class check{
	private void m1() {
		System.out.println("Private method called from outside");
	}
}



class inh {
public static void main(String[]args) throws Exception {
	check c=new check();
	Method m=check.class.getDeclaredMethod("m1");
	m.setAccessible(true);
	m.invoke(c);
}
}
