package l1;

public class Test {
	public static void main(String[] args) {
		Work w = new RealWork();
		MyInvocationHandler handler = new MyInvocationHandler(w);
		Work proxy = (Work)DynamicProxy.newProxyIntance(w.getClass().getClassLoader(), w.getClass().getInterfaces(), handler);
		proxy.doWork("Lily");
	}
}
