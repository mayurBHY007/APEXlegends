package collection;

import java.util.LinkedList;

public class Link_list {
	public static void main(String[] args) {
	LinkedList ll=new LinkedList();
	ll.add("Ganapati");
	ll.add(100);
	ll.add('A');
	ll.add(null);
	ll.add(null);
	ll.add(100);
	//print entire data
	System.out.println(ll);
	//get the size
	System.out.println(ll.size());
	//chceck whether it is empty
	System.out.println(ll.isEmpty());//false
	//insertion operation(right shift)
	ll.add(1,"Suresh");
	System.out.println(ll);
	//deletion operation(left shift)
	ll.remove(1);

	}
}
