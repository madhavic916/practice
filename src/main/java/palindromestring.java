
public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "madhavi";
		String rev = "";
		
		for(int i=txt.length()-1;i>=0;i--)
		{
			rev = rev+txt.charAt(i);
		}
		System.out.println(rev);
		

	}

}
