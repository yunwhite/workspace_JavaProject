import java.util.Scanner;

public class echo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input;
		while(true) {
			System.out.print("아무말이나 입력하세요(exit 입력시 종료) : ");
			input = sc.nextLine();
			if (input.equals("exit")) {
				System.out.println("끝");
				System.exit(0);
			}
			else
				System.out.println(input);
		}
	}

}
