import java.util.*;

public class updownbot {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int start = 1, end = 100, n, m;
		System.out.println("1부터 100 사이의 숫자를 생각해주세요");
		while (true) {
			n = random.nextInt(end - start + 1) + start;
			System.out.println(n);
			System.out.print("1. Up / 2. Down / 3. 정답! : ");
			m = sc.nextInt();
			if (m == 3) {
				System.out.println("추카추카 ~~");
				break;
			}
			else if (m == 1) {
				start = n + 1;
			} else {
				end = n - 1;
			}
		}
	}	
}