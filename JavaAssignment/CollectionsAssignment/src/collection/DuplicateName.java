package collection;

import java.util.TreeSet;

public class DuplicateName {
	public static void main(String[] args) {
		TreeSet<String> name = new TreeSet<>();
		name.add("Vinayak");
		name.add("omkar");
		name.add("Akash");
		name.add("kirshna");
		name.add("Rahul");
		name.add("Shrey");
		name.add("Vinayak");
		
		System.out.println(name);
	}

}
