package demo;

import java.lang.reflect.Method;

public class Hello {

    public void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) throws Exception {
        Method[] methods = Hello.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("### method: " + method.getName());
            if (method.getName().equals("hello")) {
                method.invoke(new Hello(), "Freewind");
            }
        }
    }

}
