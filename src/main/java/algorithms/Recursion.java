package algorithms;

public class Recursion {


    public static void main(String[] args) {
        pow(3,4);
    }

    public static int pow(int number,int pow){

        int result = number;

        if(pow == 0){
            return 1;
        }

        if (pow == 1){
            return number;
        }

        result = result * pow(number,pow-1);
        return result;
    }
}


