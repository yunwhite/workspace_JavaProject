import java.util.*;

public class major {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String major[] = {"���ͷ�Ƽ��̵���", "���̵�����Ʈ�����", "���̵��ַ�ǰ�", "���̵������ΰ�"};
		System.out.print("�й��� �Է��ϼ��� : ");
		String n = sc.next();
		String grade = n.substring(0, 1);
		String classn = n.substring(1, 2);
		System.out.println(major[Integer.parseInt(classn) / 2]);
	}
}
