package CountingElements;

import java.util.*;
public class PermCheck {
	
    public static int solution(int[] a) {
        // write your code in Java SE
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 1; i<=a.length; i++){
            set.add(i);
        }
        for(int i = 0; i<a.length;i++){
            set.remove(a[i]);
            }
        if(set.isEmpty())
            return 1;
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I am main
		//change by 2
		int a[] = {4,1,3,2};
		System.out.println(solution(a));
	}

}
