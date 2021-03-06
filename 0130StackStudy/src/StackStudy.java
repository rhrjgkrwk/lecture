import java.util.Iterator;
import java.util.Stack;

//Stack聖 因採背左切.
//DFS拝凶 什澱聖 彰陥. (獣什奴 什澱 - 仙瑛硲窒)..

public class StackStudy {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("逸球傾剛");
		st.push("巾壕奄災壱奄 ばばばばば");
		st.push("神臓嬢査製 ばばば");
		System.out.println(st.size());
		
		
		//Iterator研 紫遂背左切. 隔精 授辞企稽 蟹紳陥(Stack 莫殿 X)
		Iterator<String> itr = st.iterator(); //Iterator 持失
		while(itr.hasNext()){ //陥製 推社亜 赤澗走 端滴
			System.out.println(itr.next()); //窒径
		}
		System.out.println();
		for (Iterator iterator = st.iterator(); iterator.hasNext();) { //for庚生稽 宜険凶澗 戚係惟 馬檎 吉陥.
			System.out.println(iterator.next());
		}
		
		//Stack 莫殿稽 窒径背左切.\
		System.out.println();
		System.out.println("pop生稽 窒径廃球焼");
		/*		
		if (!st.isEmpty()) {
			System.out.println(st.pop());
		}
		*/
		while(!st.isEmpty()){ //葵戚 赤澗 疑照 儀陥.
			System.out.println(st.pop()); //pop精 什澱拭辞 焼森 推社研 薦暗.
		}
		
		
		
		System.out.println();
	}
}
