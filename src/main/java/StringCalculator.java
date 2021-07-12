public class StringCalculator {
    public static int sum(String calculation){
        if(calculation.isEmpty()){
            return 0;
        }
        else{
        return Integer.parseInt(calculation);
        }
    }
}
