public class Calculator {

    public static String calculate(double x){
        try {
            return String.valueOf(1/x);
        }
        catch (Exception e){
            return String.valueOf(e);
        }
    }
}
