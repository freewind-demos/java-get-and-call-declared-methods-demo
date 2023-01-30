package demo;

import java.lang.reflect.Method;

public class Hello {
    public static void main(String[] args) {
        Method[] methods = Calculator.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("### method: " + method.getName());
        }
    }

}
