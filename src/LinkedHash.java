import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHash {
public static void main(String[] args) {
	/*LinkedHashSet-ordered set,unsorted*/
	LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
	h.add(5);
	h.add(2);
	h.add(8);
	h.add(1);
	System.out.println(h);
	Iterator i=h.iterator();
	while(i.hasNext())
		System.out.println(i.next());
}
}
