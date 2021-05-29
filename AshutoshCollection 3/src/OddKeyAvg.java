import java.util.*;
public class OddKeyAvg {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map =new HashMap<>();
		map.put(12,90);
		map.put(35, 90);
		map.put(33, 90);
		map.put(56, 88);
		
		double sum = 0;
		int count = 0;
		for(int key:map.keySet()) {
			if (key %2 != 0) {
				sum += map.get(key);
				count += 1;
			}
		}
		
		System.out.println(sum / count);
		

	}

}
