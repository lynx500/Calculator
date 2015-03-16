public class Division implements Action {
    @Override
    public double act(double a, double b) {
        double division = a / b;
        return division;
    }

    @Override
    public String getOperator() {
        String str = "/";
        return str;
    }

    @Override
    public String getDiscription() {
        String str = "Division - calc divides the first number on the second one and shows the result on the screen.";
        return str;
    }
}
