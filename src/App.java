public class App {

    public static int Fibonacci(int arguement){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for(int i=0; i<arguement; i++){
            if (num2 == 0){
                ++num2;
            } else {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
        }
        return num3;        
    }

    public static void main(String[] args) throws Exception {
        for(String str: args) {
            // convert into integer type
            int argument = Integer.parseInt(str);
                           
            if (argument >= 0){
                System.out.println(Fibonacci(argument));
            } else {
                throw new NumberFormatException("Argument " + str + " must be a non-negative integer.");
            }
        }
    }
}
