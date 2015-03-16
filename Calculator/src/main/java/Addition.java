public class Addition implements Action {
    @Override
    public double act(double a, double b) {
        double sum = a + b;
        return sum;
    }

    @Override
    public String getOperator() {
        String str = "+";
        return str;
    }

    @Override
    public String  getDiscription() {
        String str = "Addition - calc adds two numbers and shows the result on the screen.";
        return str;
    }
}
