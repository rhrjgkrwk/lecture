제네릭스 

class Biz<T> //Template의 약자.

class Test{
	Biz<String> ob1 = new Biz<>();
}




ex2)
abstract class Biz<X,Y>{
	public abstract void register(X x);
	public abstract void remove(Y y);
}

class UserBiz extends Biz<User, String>{
	public abstract void register(User user);
	public abstract void remove(String string);
}