package collection;

import java.util.*;

public class ContactDetails {
	public static void main(String[] args) {
		TreeMap<Long,Contact> ts = new TreeMap<>();
		Contact contactdetail1 = new Contact(6362011796l,"Vinayak","pujarivnk81@gmail.com");
		Contact contactdetail2 = new Contact(8123146619l,"vnk","pujarivnk63@gmail.com");
		Contact contactdetail3 = new Contact(9481104182l,"Geeta","pujarigeeta94@gmail.com");
		Contact contactdetail4 = new Contact(9481104183l,"Sadashiv","pujarisadashuv62@gmail.com");
		
		ts.put(1l, contactdetail1);
		ts.put(2l, contactdetail2);
		ts.put(3l, contactdetail3);
		ts.put(4l, contactdetail4);
		
		for(long l:ts.keySet()) {
			System.out.println(l+" ");
		}
		
		System.out.println("-------------------");
		
		System.out.println(ts.get(1l));
		System.out.println(ts.get(2l));
		System.out.println(ts.get(3l));
		System.out.println(ts.get(4l));
		
		System.out.println("-------------------");
		
		System.out.println(ts);
		
		
	}

}
