package l1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	public static Object newProxyIntance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
		return Proxy.newProxyInstance(loader, interfaces, handler);
	}
}
