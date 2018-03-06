package test4;

public class Main {
	public static void main(String[] args) {
		Day[] d = MyDay.class.getAnnotationsByType(Day.class);
		for (Day day : d) {
			System.out.println(day.name());
		}
	}
}
