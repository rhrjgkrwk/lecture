import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;




public class VectorSort {
	public static void main(String[] args) {
		Vector v1 = new Vector(3);
		
		for (int i = 6; i >=1; i--) {
			v1.add(new Integer(i+100));
		}
		for (int i = 0; i < v1.size(); i++) {
			System.out.print(v1.elementAt(i)+"\t");
		}
		System.out.println();
		//v1.sort(null);
		Collections.sort(v1);
		Object obj[] = v1.toArray();
		Arrays.sort(obj);
		
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < v1.size(); i++) {
			System.out.print(v1.get(i)+"\t");
		}
	}
}