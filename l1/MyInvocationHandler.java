package l1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{
	private Object object;
	
	public MyInvocationHandler(Object _obj) {
		object = _obj;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		OtherWork w = new RealOtherWork();
		w.doOtherWork();
		Object result = method.invoke(object, args);
		w.doAnotherWork();
		return result;
	}
}
