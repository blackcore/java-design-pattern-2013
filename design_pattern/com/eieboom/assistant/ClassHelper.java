/**
 * 
 */
package eieboom.assistant;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * 类助手
 * 
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class ClassHelper {

	/**
	 * 给一个接口，返回这个接口的所有实现类
	 * 
	 * @param cls
	 * @return
	 */
	public static List<Class> getAllClassByInterface(Class cls) {
		List<Class> returnClassList = new ArrayList<Class>(); // 返回结果

		// 如果不是一个接口，则不做处理
		if (cls.isInterface()) {
			String packageName = cls.getPackage().getName(); // 获得当前的包名
			try {
				// 获得当前包下以及子包下的所有类
				List<Class> allClass = getClasses(packageName);
				if (allClass != null && allClass.size() > 0) {
					// 判断是否是同一个接口
					for (int i = 0; i < allClass.size(); i++) {
						if (allClass.get(i) != null) {
							// 判断是不是一个接口
							if (cls.isAssignableFrom(allClass.get(i))) {
								// 本身不加进去
								if (!cls.equals(allClass.get(i))) {
									returnClassList.add(allClass.get(i));
								}
							}
						}
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return returnClassList;
	}

	/**
	 * 从一个包中查找出所有的类，在jar包中不能查找
	 * 
	 * @param packageName
	 * @return
	 */
	private static List<Class> getClasses(String packageName) {
		ArrayList<Class> classes = new ArrayList<Class>();

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		String path = packageName.replace('.', '/');
		Enumeration<URL> resources;
		try {
			resources = classLoader.getResources(path);
			List<File> dirs = new ArrayList<File>();
			while (resources.hasMoreElements()) {
				URL resource = resources.nextElement();
				dirs.add(new File(resource.getFile()));
			}
			for (File directory : dirs) {
				classes.addAll(findClasses(directory, packageName));
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		return classes;
	}

	private static List<Class> findClasses(File directory, String packageName) {
		List<Class> classes = new ArrayList<Class>();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file, packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				try {
					classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
				} catch (ClassNotFoundException e) {
					System.out.println(e);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		return classes;
	}
}
