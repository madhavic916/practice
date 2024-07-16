
public class Reverse {

	public static void main(String[] args) {
		
		String str = "Reverse";
		String reverser = "";
		char[] ch = str.toCharArray();
		StringBuilder out = new StringBuilder();
		for(int i=ch.length-1; i>=0 ;i--)
		{
			
         out.append(ch[i]);		
		
	
	}
		System.out.println(out.toString());



}
}
