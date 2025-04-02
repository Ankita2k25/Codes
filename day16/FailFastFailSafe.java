package day16;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe{
	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
//		Iterator<Integer> it = list.iterator();
//		while (it.hasNext()) {
//		    int num = it.next();
//		    if (num == 2) {
//		        list.remove(num); // ConcurrentModificationException!
//		    }
//		}
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3));
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
		    int num = it.next();
		    if (num == 2) {
		        list.remove(num); // No Exception! (But iterator may not see the change)
		    }
		}
		System.out.println(list);
	}

}
