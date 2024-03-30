package Arithmetic;

public class MyArithmetic {
    private final Number num1;
    private final Number num2;
    

    public MyArithmetic(Number num1, Number num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();

    }


    public double subtract() {

        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Error! Cannot divide zero.");
        }

            return num1.doubleValue() / num2.doubleValue();
    }

    public double getMin() {
        return Math.min(num1.doubleValue(), num2.doubleValue());

    }


    public double getMax() {
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}
