import java.util.Scanner;

public class echo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input;
		while(true) {
			System.out.print("�ƹ����̳� �Է��ϼ���(exit �Է½� ����) : ");
			input = sc.nextLine();
			if (input.equals("exit")) {
				System.out.println("��");
				System.exit(0);
			}
			else
				System.out.println(input);
		}
	}

}
