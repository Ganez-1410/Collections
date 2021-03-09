import java.util.HashSet;
import java.util.Iterator;

public class Hash {
public static void main(String[] args) {
	/*HashSet contains unordered nd unsorted*/
//	HashSet h=new HashSet();
//	h.add(7);
//	h.add("String");
//	h.add(5.5783);
//	h.add(4.5f);
//	h.add(true);
//	System.out.println(h);
//	Iterator i=h.iterator();
//	while(i.hasNext())
//		System.out.println(i.next());
	HashSet<Integer> h=new HashSet<Integer>();
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
