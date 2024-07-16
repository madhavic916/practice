import java.util.HashSet;

public class dupinArrayHashset {

	public static void main(String[] args) {
		
		String[] str = {"java", "test", "java"};
		boolean flag = false;
		HashSet<String> strset= new HashSet<>();
		for(String words:str)
		{
			if(strset.add(words)==false)
			{
				System.out.println("found duplicate" +strset);
				flag = true;
			}
			
			
		}
		
		if(flag==false)
		{
			System.out.println("found no duplicate" +strset);

		}

	}

}
