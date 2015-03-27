public class Minus implements Action {
    @Override
    public double act(double a, double b) {
        double difference = a - b;
        return difference;
    }

    @Override
    public String getOperator() {
        String str = "-";
        return str;
    }

    @Override
    public String getDiscription() {
        String str = "Subtraction - calc subtracts the second number from the first one and shows the result on the screen.";
        return str;
    }
}
