package test1;

public class Solution {
	 public int solution(Tree T) {
	        // write your code in Java SE 8
		 if (T==null){
			 return 0;
		 }
	     int result = traversal(T, Integer.MIN_VALUE);
		 return result;
	     
	     
	     
	 }
	 
	 private int traversal(Tree t, int maxValueOnPath){
		 int result = 0;
		 if(t.x>=maxValueOnPath){
			 result=1;
			 if(t.l!=null){
				 result += traversal(t.l, t.x);
			 }
			 if(t.r!=null){
				 result+=traversal(t.r,t.x);
			 }
			 
		 }else {
			 if(t.l!=null){
				 result += traversal(t.l,maxValueOnPath);
			 }
			 if(t.r!=null){
				 result+=traversal(t.r,maxValueOnPath);
			 }
		 }
		 
		 return result;
	 }
	 
	 private static class Tree{
		 public int x;
		 public Tree l;
		 public Tree r;
	 }
	 
	 public static void main(String[] args) {
		Tree t1 = new Tree();
		t1.x=5;
		Tree t2 = new Tree();
		t2.x=3;
		Tree t3 = new Tree();
		t3.x=10;
		Tree t4 = new Tree();
		t4.x=20;
		Tree t5 = new Tree();
		t5.x=21;
		Tree t6 = new Tree();
		t6.x=1;
		t1.l=t2;
		t1.r=t3;
		t2.l=t4;
		t2.r=t5;
		t3.l=t6;
		
		Solution s = new Solution();
		s.solution(t1);
	}
}

