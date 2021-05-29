import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
        int total=0;
		Palindrome obj=new Palindrome();
		for(int i=90;i<=120;i++)
		{
			
			int sum=0;
			int temp=i;
			while(temp>0)
			{
				int digit=temp%10;
				sum=sum*10+digit;
	             temp=temp/10;
	            
			}
			
		
		if(i==sum)
		{
			total=total+sum;
			
			obj.list.add(sum);
			
		}
		
	}
		
		
		System.out.println(obj.list);
		System.out.println(total);
}
		
	
			
		
		
	
		// TODO Auto-generated method stub

}


