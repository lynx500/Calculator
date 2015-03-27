public class Division implements Action {
    @Override
    public double act(double a, double b) throws DivisionByZeroException {
        double division = a / b;
        if (b == 0) {
            throw new DivisionByZeroException();
        }
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
