import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
public static void main(String[] args) {
	/*TreeSet-sorted set*/
	TreeSet<Integer> t=new TreeSet<Integer>();
	t.add(5);
	t.add(2);
	t.add(8);
	t.add(1);
	Iterator i=t.iterator();
	while(i.hasNext())
		System.out.println(i.next());
}
}
