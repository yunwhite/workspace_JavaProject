import java.util.*;

public class updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int n = random.nextInt(100) + 1, m;
		while (true) {
			System.out.print("숫자를 맞추세요(1 ~ 100) : ");
			m = sc.nextInt();
			if (n == m) {
				System.out.println("맞췄습니다!");
				break;
			} else if (n > m) {
				System.out.println("Up");
			} else
				System.out.println("Down");
		}
		
	}

}
