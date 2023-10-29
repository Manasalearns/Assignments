import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyClass {
	 @Execute(sequence = 2)
	    public void myMethod1() {
	        System.out.println("Executing myMethod1");
	    }

	    @Execute(sequence = 1)
	    public void myMethod2() {
	        System.out.println("Executing myMethod2");
	    }

	    @Execute(sequence = 3)
	    public void myMethod3() {
	        System.out.println("Executing myMethod3");
	    }

	    public static void main(String[] args) {
	        MyClass obj = new MyClass();

	        // Get all methods in the class
	        Method[] methods = obj.getClass().getDeclaredMethods();

	        // Create a list of methods with @Execute annotation
	        List<Method> executeMethods = new ArrayList<>();
	        for (Method method : methods) {
	            if (method.isAnnotationPresent(Execute.class)) {
	                executeMethods.add(method);
	            }
	        }

	        // Sort the methods based on the sequence value
	        Collections.sort(executeMethods, new Comparator<Method>() {
	            @Override
	            public int compare(Method m1, Method m2) {
	                return m1.getAnnotation(Execute.class).sequence() - m2.getAnnotation(Execute.class).sequence();
	            }
	        });

	        // Invoke the methods in the sorted order
	        for (Method method : executeMethods) {
	            try {
	                method.invoke(obj);
	            } catch (IllegalAccessException | InvocationTargetException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}


