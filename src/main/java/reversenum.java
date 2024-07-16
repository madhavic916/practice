
public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int rev =0;
		while(num!=0)
		{
			rev = rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		
		StringBuffer bf = new StringBuffer(String.valueOf(num));
		StringBuffer rev1 = bf.reverse();
		
		StringBuilder test = new StringBuilder();
		test.append(num);
		StringBuilder sb = test.reverse();
		
		
		

	}

}
