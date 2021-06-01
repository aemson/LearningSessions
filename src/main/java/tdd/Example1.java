package tdd;

public class Example1 {

    public int add(int a, int b) {
        return a + b;
    }

    public float divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public boolean validateUserName(String userName) {
        if (userName.contains("@") && (userName.endsWith(".com") || userName.endsWith(".no")))
            return true;
        else return false;
    }
}
