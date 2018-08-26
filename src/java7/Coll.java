package java7;

import java.util.ArrayList;

public class Coll {
	public static void add(ArrayList<?> c, Object e)
	{
		//c.add(e.toString());
	}
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	add(al,"one");
	//System.out.println("ss %s"al.size());
	
}
}
