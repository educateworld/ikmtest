package java7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;



public class My 
{
	
public static void main(String[] args) {
	Date aDate=null;
	try {
		aDate=new SimpleDateFormat("yyyy-mm-dd").parse("2012-01-15");
		Calendar a=Calendar.getInstance();
		a.setTime(aDate);
		System.out.println(a.DAY_OF_MONTH+""+a.get(a.MONTH));
	}
	catch(ParseException ex)
	{
		System.out.println(ex);
	}

}

}

