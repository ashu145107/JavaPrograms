import java.util.ArrayList;
import java.util.TreeMap;
public class Highest {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<String>();
	        TreeMap<String, Integer> map = new TreeMap<String, Integer> ();
	        list.add("arun#12#12#19");
	        
	        list.add("deepak#13#12#100");
	        
	        for (int i = 0; i < list.size(); i++) {
	            String[] list1 = list.get(i).split("#");
	            int sum = Integer.parseInt(list1[1]) +Integer.parseInt(list1[2]) +Integer.parseInt(list1[2]);
	            map.put(list1[0], sum);
	        }

	        String output = "";
	        int marks = 0;
	        for (String key: map.keySet()) {
	            if (map.get(key) > marks) {
	                output = key;
	                marks = map.get(key);
	            }
	        }

	        System.out.println(output);
	    }
	
		// TODO Auto-generated method stub

	}


