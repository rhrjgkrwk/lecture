//command line args �� ����غ���.
//���α׷� ����� ���α׷��� �ڿ� ���� �Է��ϸ� ������� String args[]�� ����.(" "���� ����)
//�� ���� �޾� ���� ���� �����ϴ� ���α׷��� ������.
//args�� �̿��� ���α׷����� args �Է��� ���� ���� üũ�Ϸ��� args.length == 0 �� Ȯ���ϸ� �ȴ�.

public class CommandLineArgs {
	public static void main(String[] args) {
		
//cmd ���� java /���/CommandLineArgs 13 24 �ϰų�
//��Ŭ���ÿ��� �޴��߿� run --> run config --> args���� ���Է�.
		
		if (args.length==2) {
			int result = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
			System.out.println(result);
		}
		else {
			System.out.println("���� ����");
			System.out.println("���� : ��� ���� ����");
		}
		return ; //����
		//C������ �������� exit(1);
		//java������ System.exit(1);
		//C#������ Environment.exit(1);
		//return ; �� ��� ���� ������.
	}
}
