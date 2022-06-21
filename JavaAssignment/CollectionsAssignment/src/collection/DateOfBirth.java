package collection;

import java.sql.Date;
import java.util.LinkedList;

public class DateOfBirth {
	public Date date;
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("29-09-1998");
		l.add("23-03-1993");
		l.add("25-04-2016");
		l.add("26-05-1994");
		l.add("22-01-1999");
		
		for(int i=0;i<l.size();i++) {
			String s=l.get(i).toString();
			String [] s1 = s.split("-");
			int year = Integer.parseInt(s1[2]);
			if((year%4==0) && (year%100!=0) || year%400==0) {
				System.out.println("The date is "+l.get(i)+" is a leap year");
			}
			else {
				System.out.println("The date is "+l.get(i)+" is not a leap year");
			}
			
		}
		
		
	}

}
