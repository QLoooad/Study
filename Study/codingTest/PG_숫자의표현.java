package codingTest;

public class PG_숫자의표현 {

	public static int solution(int n) {
		int answer = 0;
		return answer;
	}

	public static void main(String[] args) {
		int n = 15;

		int answer = 1;

		for (int i = 1; i <= n / 2; i++) {
			int sum = i;
			for (int j = i + 1; sum < n; j++) {
				sum += j;
			}
			if (sum == n)
				answer++;
		}
		System.out.println(answer);

	}

}
