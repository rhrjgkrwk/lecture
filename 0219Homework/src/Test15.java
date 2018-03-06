import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class Test15 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("콩쥐팥쥐", 15000);
		map.put("백설공주", 10000);
		map.put("보물섬", 18000);
		NumberFormat nf = NumberFormat.getInstance();
		for (String k : map.keySet()) {
			//System.out.println(k+"의 책가격="+priceFormat(map.get(k)));
			System.out.println(k+"의 책가격="+nf.format(map.get(k))+"원");
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
		return  p+"원";
	}
}
/*
[문제15] HashMap컬렉션을 이용하여 다음 자료를 추가하시오

(1)사용데이터
    key          value
  -----------------------
   콩쥐팥쥐   15000
   백설공주   10000
   보물섬      18000

(2) 조건 
     1) main()메서드에서  Map클래스로 객체를 만들어 HashMap으로 인스턴스할당할것 o
     2) 제네릭스를 이용하여 데이터를 추가할것 o
     3) 아래 화면처럼 출력하되, 책가격은 세자리마다콤마찍고 화폐단위 "원"을 표시할것 o
       
[출력화면]
콩쥐팥쥐의 책가격=15,000원
보물섬의 책가격=18,000원
*/