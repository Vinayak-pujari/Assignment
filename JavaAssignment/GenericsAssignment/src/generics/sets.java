package generics;

import java.util.HashSet;

public class sets {
	public static void main(String[] args) {
        HashSet<employee> act= new HashSet();
        employee a=new employee(1,"vinayak",30000,"Manager");
        employee b=new employee(2,"akash",30000,"Testing");
        employee c=new employee(3,"shrey",60000,"Dev");
        employee d=new employee(4,"prachi",40000,"Manager");
        act.add(a);
        act.add(b);
        act.add(c);
        act.add(d);
        //printing all the details of the objects
        System.out.println(act);
    }


}
