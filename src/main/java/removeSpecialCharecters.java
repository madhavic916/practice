
public class removeSpecialCharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "@#$%$assaf   sdfADDGGF0$%%^&^&*98    878%%$$";
		
		String str1 = str.replaceAll("[^0-9]", "");
		int num = Integer.valueOf(str1);
		System.out.println(num);
		String sent = String.valueOf(num);
		//replace spaces
		
		String str2 = "Java   test  java";
		str1 = str1.replaceAll("\\s", "");
		System.out.println(str2);

		
		
		
		
		

	}

}
