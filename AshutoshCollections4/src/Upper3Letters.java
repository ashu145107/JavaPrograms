import java.util.*;
public class Upper3Letters {

	public static void main(String[] args) {
		String[] str= {"goa","kerala","gujarat"};
		
		HashMap<String,String> map=new HashMap<>();
		for(int i=0;i<str.length;i++)
		{
			map.put(str[i].substring(0, 3).toUpperCase(), str[i]);
			
		}
		System.out.println(map);
		// TODO Auto-generated method stub

	}

}
