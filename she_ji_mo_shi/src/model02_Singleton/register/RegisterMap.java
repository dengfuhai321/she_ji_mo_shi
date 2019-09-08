package model02_Singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//单例模式初衷就是为了使资源可以共享，只需要赋值或者初始化一次，大家就可以重复使用
/*
 * 管理的单例模式：注册登记式
 * 特点：每使用一次，都往一个固定的容器中去注册并且将使用过的对象进行缓存，下次去取对象的时候，就直接
 * 从缓存中去取，以保证每次获取的都是同一个对象
 * ioc中的单例模式就是这种典型的注册登记式单例
 */
public class RegisterMap {
	private RegisterMap() {

	}

	private static Map<String, Object> register = new ConcurrentHashMap<String, Object>();

	public static RegisterMap getinstance(String name) {
		if (name == null) {
			name = RegisterMap.class.getName();
		}
		if (register.get(name) == null) {
			try {
				register.put(name, new RegisterMap());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return (RegisterMap) register.get(name);
	}

}
