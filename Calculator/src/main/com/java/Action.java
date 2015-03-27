public interface Action {
    double act(double a, double b) throws DivisionByZeroException;
    String getOperator();
    String getDiscription();
}
