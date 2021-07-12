public class StringCalculator {
    public static int sum(String calculation){
        if(calculation.isEmpty()){
            return 0;
        }
        else if(calculation.contains(",")){
            String [] numbers = calculation.split(",");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
        else{
        return Integer.parseInt(calculation);
        }
    }
}
