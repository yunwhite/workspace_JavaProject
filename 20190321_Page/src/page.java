import java.util.Scanner;

public class page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input;
		int result;
		while(true) {
			System.out.print("게시물 개수를 입력하세요(exit 입력시 종료) : ");
			input = sc.nextLine();
			if (input.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				result = Integer.parseInt(input) / 7;
				if (Integer.parseInt(input) % 7 != 0)
					result++;
				System.out.println("페이지 개수는 " + result + "개 입니다.");
			}
		}
	}

}
