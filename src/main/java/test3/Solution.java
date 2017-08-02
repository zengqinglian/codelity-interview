package test3;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
	public int solution(int[] A, int D) {
        // write your code in Java SE 8
		if(A.length<=D){
			return 0;
		}
		
		if(D<=0){
			return -1;
		}
		
	    Map<Integer, Integer> time = new TreeMap<>();
	    for(int i=0; i<A.length; i++){
	    	if(A[i]>=0){
	    		time.put(A[i], i);
	    	}
	    }
	    
	    boolean[] stones = new boolean[A.length];
	    int monkeyPosition = -1;

		for(int i : time.keySet()){
			stones[time.get(i)]=true;
			boolean canJump = true;
			while(canJump){
				for(int j=D; j>0; j--){
					canJump = false;
					if(stones[monkeyPosition +j]){
						monkeyPosition = monkeyPosition+j;
						if(monkeyPosition+D>=A.length){
							return i;
						}
						canJump=true;
						break;
					}
				}
			}
		}

		return -1;
		
    }
	
	public static void main(String[] args) {
		Solution s= new Solution();
		int[] A = {1, -1, 0, 2, 3, 5};
		//int[] A={3,2,1};
		s.solution(A, 3);
	}
}
