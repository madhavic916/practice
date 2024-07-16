
public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "HI I am Madhavi";
		String[] arry = str.split(" ");
		String revarr = "";
		
		for(int i=arry.length-1; i>=0; i--)
		{
			revarr = revarr+" "+arry[i];
		
		}
		System.out.println(revarr);
		

	}

}
