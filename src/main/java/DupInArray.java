
public class DupInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"java1", "test", "java"};
		boolean flag = false;
		for(int i=0; i<str.length;i++)
		{
			for(int j=i+1; j<str.length;j++)
				
			{
				if(str[i]==str[j])
				{
					System.out.println("dup ele found"+str[i]);
					flag=true;
				}
			}
			
		}
		if(flag==false)
		{
			System.out.println("dup ele not found");

		}
		
		

	}

}
