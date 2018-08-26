package java7;

import java.util.Calendar;

public class Caldemo {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		c.set(2000, Calendar.AUGUST, 30);
		c.roll(Calendar.MONTH, 7);
		System.out.println(c.get(Calendar.DATE)+""+c.get(Calendar.MONTH)+""+c.get(Calendar.YEAR));
		c.add(Calendar.MONTH, 11);
		System.out.println(c.get(Calendar.DATE)+""+c.get(Calendar.MONTH)+""+c.get(Calendar.YEAR));
	}

}
