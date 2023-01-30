package demo;

public class Calculator {

    public String calculateSlowValue(String key) {
        return key + "! (" + System.currentTimeMillis() + ")";
    }
}
