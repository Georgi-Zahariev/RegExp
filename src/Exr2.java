import  autom.*;
import java.util.regex.*;
class Proc2 implements Callback{
	private String rEx="";
	private Pattern pat;
	private long count;
	
	public long getCount() {
		return count;
	}
	public String getrEx() {
		return rEx;
	}
	public void setrEx(String a) {
		rEx = a;
		pat=Pattern.compile(rEx);
		count = 0;
	}

@Override
 public void proceed(String s) {
	count ++;
	Matcher m =pat.matcher(s);
	System.out.println(s+": " + m.matches());
}
}
public class Exr2 {
	public static void main(String[] args) {
     Automaton a;
     try {
    	 a=new Automaton ("exr2.txt");
     }catch(Exception e) {
    	 System.out.println("No file");
    	 return;
     }
     Proc2 p = new Proc2();
     p.setrEx("(01|10)*1(01)*");
     a.makeWords(5,p);
     System.out.println("Count: " + p.getCount());
	}
}
