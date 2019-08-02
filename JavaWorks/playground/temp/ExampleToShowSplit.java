package temp;

import java.util.StringTokenizer;

public class ExampleToShowSplit {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("coffee:capachino:blr", ":"); 
		
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
