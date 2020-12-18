package CountingElements;

import java.util.Map;
import java.util.TreeMap;

public class FrogJump {
	
	public FrogJump() {
		// TODO Auto-generated constructor stub
		System.out.println("I am a constructor");
	}
	
	static int timeTaken(int a[],int x) {
        if(a.length<x)
        return -1;
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for(int i = 0; i<a.length; i++) {
			if(!map.containsKey(a[i]))
			map.put(a[i], i);
		}
		int pos =1;
		int max = Integer.MAX_VALUE;
		for(int i = 0 ; i<x; i++) {
			if(map.get(i)!=i)
				return -1;
			max = Math.max(max, map.get(i));
			pos++;
		}
		return max;
    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,1,4,2,3,5,4};
		System.out.println(timeTaken(a,5));
	}

}
