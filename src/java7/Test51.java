package java7;

public class Test51 {
	public Test51() {
this(10);	
}

	public Test51(int i) {
this.i=i;	
}
public void diplay()
{
	class Dc{
		public void dc()
		{
			i--;
		}
	}
	
	Dc d=new Dc();
	d.dc();
	System.out.println("data"+i);
}
private int i;
public static void main(String[] args) {
	int i=0;
	Test51 t=new Test51();
	t.diplay();System.out.println(i);
}
}
