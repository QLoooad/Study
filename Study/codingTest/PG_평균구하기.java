package codingTest;

public class PG_평균구하기 {
	class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
	        for(int i = 0; i < arr.length; i++) {
	        	answer += arr[i];
	        }
	        return answer/arr.length;
	    }
	}
}
