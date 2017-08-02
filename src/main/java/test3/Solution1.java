package test3;

public class Solution1 {
	public int solution(int[] A, int D) {
        // write your code in Java SE 8
		if(A.length<=D){
			return 0;
		}
		
		if(D<=0){
			return -1;
		}
		
	   int[] result = new int[A.length+1];
	   
	   for(int i=0; i< A.length; i++){
		   if(A[i]==-1){
			   continue;
		   }
		   result[i] = Math.max(result[i], A[i]);
		   
		   boolean canJump = false;
		   for(int j=1; j<=D; j++){
			   if(i+j>A.length-1 || A[i+j]!=-1){
				   result[i+j] = Math.max(result[i], A[i]);
				   canJump = true;
			   }
			   if(i+j>=A.length){
				   return result[i+j];
			   }
		   }
		   
		   if(!canJump){
			   return -1;
		   }
		   
	   }

	   return -1;
		
    }
	
	public static void main(String[] args) {
		Solution1 s= new Solution1();
		//int[] A = {1, -1, 0, 2, 3, 5};
		int[] A={3,2,1};
		System.out.println(s.solution(A,1));
	}
}
