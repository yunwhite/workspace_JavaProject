import java.util.*;

public class updownbot {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int start = 1, end = 100, n, m;
		System.out.println("1���� 100 ������ ���ڸ� �������ּ���");
		while (true) {
			n = random.nextInt(end - start + 1) + start;
			System.out.println(n);
			System.out.print("1. Up / 2. Down / 3. ����! : ");
			m = sc.nextInt();
			if (m == 3) {
				System.out.println("��ī��ī ~~");
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