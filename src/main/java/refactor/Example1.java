package refactor;

/**
 * What is refactoring?
 * It is changing the structure of code without changing its functionality.
 * For example,
 * Suppose we have a method that compares 2 numbers and returns true if the first is greater and false otherwise:
 ***/

public class Example1 {
    public static void main(String[] args) {
        new Example1().max(1, 2);
    }

    public boolean max(int a, int b) {
        if (a > b) {
            return true;
        } else if (a == b) {
            return false;
        } else {
            return false;
        }
    }

}






/****
 * ***** Hint ****
 * Why not simplify code to `return a > b`;
 * ****/