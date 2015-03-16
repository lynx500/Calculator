public class Multiplication implements Action {
    @Override
    public double act(double a, double b) {
        double mult = a * b;
        return mult;
    }

    @Override
    public String getOperator() {
        String str = "*";
        return str;
    }

    @Override
    public String getDiscription() {
        String str = "Multiplication - calc multiplies two numbers and shows the result on the screen.";
        return str;
    }
}
