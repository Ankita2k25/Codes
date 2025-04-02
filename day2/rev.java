package day2;

public class rev {
	public static void main(String[]args) {
		String a="Ankita";
		char c;
		String s="";
		for(int i=a.length()-1;i>=0;i--) {
			c=a.charAt(i);
			s+=c;	
		}
		System.out.print(s);
	}
	}

