import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Test15 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("��������", 15000);
		map.put("�鼳����", 10000);
		map.put("������", 18000);
		NumberFormat nf = NumberFormat.getInstance();
		for (String k : map.keySet()) {
			//System.out.println(k+"�� å����="+priceFormat(map.get(k)));
			System.out.println(k+"�� å����="+nf.format(map.get(k))+"��");
		}
	}
	public static String priceFormat(int price){
		String p = String.valueOf(price);
		if (p.length()>3) {
			int i = p.length()-3;
			while (i>0) {
				p = p.substring(0,i).concat(",")+p.substring(i);
				i-=3;
			}
		}
		return  p+"��";
	}
}
/*
[����15] HashMap�÷����� �̿��Ͽ� ���� �ڷḦ �߰��Ͻÿ�

(1)��뵥����
    key          value
  -----------------------
   ��������   15000
   �鼳����   10000
   ������      18000

(2) ���� 
     1) main()�޼��忡��  MapŬ������ ��ü�� ����� HashMap���� �ν��Ͻ��Ҵ��Ұ� o
     2) ���׸����� �̿��Ͽ� �����͸� �߰��Ұ� o
     3) �Ʒ� ȭ��ó�� ����ϵ�, å������ ���ڸ������޸���� ȭ����� "��"�� ǥ���Ұ� o
       
[���ȭ��]
���������� å����=15,000��
�������� å����=18,000��
*/