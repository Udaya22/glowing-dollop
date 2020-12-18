package CountingElements;

import java.util.*;

public class MissingInteger {
	
    public static int solution(int[] a) {
        // write your code in Java SE 8
        if(a.length==0){
            return 1;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i<a.length; i++){
            set.add(a[i]);
        }
        for(int i = 1; i<a.length+1;i++){
            if(set.contains(i)!=true){
                return i;
            }
        }
        return a.length+1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,-3};
		System.out.println(solution(a));
	}

}
