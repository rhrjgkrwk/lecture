package tv1;

//결합도가 높다
public class TvUser {
	public static void main(String[] args) {
		String com=args[0];
		
		if(com.equals("LG"))    // com=="LG" 같은 개념
		{
			LgTv tv=new LgTv();
			tv.powerOn();
			tv.powerOff();
			tv.volumeUp();
			tv.volumeDown();
		}else if(com.equals("SAMSUNG")){  // com=="SAMSUNG" 같은 개념
			SamsungTv tv=new SamsungTv();
			tv.turnOn();
			tv.turnOff();
			tv.soundUp();
			tv.soundDown();
		}else{
			System.out.println("error");
		}

	}
}
