import java.util.Scanner;

public class updownbot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 25, m, guess = 50;
		System.out.println("1���� 100 ������ ���ڸ� �������ּ���");
		while (true) {
			System.out.println(guess);
			System.out.print("1. Up / 2. Down / 3. ����! : ");
			m = sc.nextInt();
			if (m == 3)
				break;
			else if (m == 1) {
				guess += n;
			}
			else
				guess -= n;
			n /= 2;
		}
	}

}
