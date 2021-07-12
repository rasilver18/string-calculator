public class StringCalculator {
    public int add(String calculation){
        String [] numbers = calculation.split(",|\n");
        if(calculation.isEmpty()){
            return 0;
        }
        else if(numbers.length >1){
            return calculatedSum(numbers);


        }
        else{
        return Integer.parseInt(calculation);
        }

    }
    private int calculatedSum(String[] numbers){
        int sum =0;
        for(String number:numbers){

            sum += Integer.parseInt(number);
        }
        return sum;
    }


}
