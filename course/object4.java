

public class object4 {
    public static void main(String args[]) {
        // jm creates object for java
        Calculator calc = new Calculator();
        calc.add();
    }
}
class Calculator {
    int a;

    public int add() {
        System.out.println("in add");
        return 0;
    }
}
