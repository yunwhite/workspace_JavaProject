import java.util.Scanner;

public class page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input;
		int result;
		while(true) {
			System.out.print("�Խù� ������ �Է��ϼ���(exit �Է½� ����) : ");
			input = sc.nextLine();
			if (input.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			} else {
				result = Integer.parseInt(input) / 7;
				if (Integer.parseInt(input) % 7 != 0)
					result++;
				System.out.println("������ ������ " + result + "�� �Դϴ�.");
			}
		}
	}

}
