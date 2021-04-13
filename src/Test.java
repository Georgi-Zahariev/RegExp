import java.util.regex.*;
public class Test {

	public static void main(String[] args) {
	
		Pattern p = Pattern.compile("1(0|1)*00" );
		Matcher m = p.matcher("100110100");
		if( m.matches()) System.out.println("Yes");
		else System.out.println("No");
		
		System.out.println((Pattern.matches("1(0|1)*00", "10100"))?"Yes":"No");
	}

}
