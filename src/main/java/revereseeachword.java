
public class revereseeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi I Am Madhavi";
		String[] arr = str.split(" ");
		String revfull ="";

		for(String words:arr)
		{
			String rev = "";
			for(int i=words.length()-1;i>=0;i--)
			{
				rev = rev+words.charAt(i);				 
			}
			
			revfull=revfull+rev+" ";
		}
		System.out.println(revfull);

	}


}
