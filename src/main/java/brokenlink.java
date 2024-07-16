import java.util.HashSet;

public class brokenlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dghjgddsef";
		HashSet<Character> set = new HashSet<>();
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		String st1 = set.toString();
		
		System.out.println(st1.length());
		

	}

}
