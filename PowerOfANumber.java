public class PowerOfANumber {

    public static void main(String args[]){

        System.out.println(powerOfANumber(2,3));

    }

    public static int powerOfANumber(int a,int exponential){
        if(exponential<0){
            return -1;
        }
        if(exponential==0){
            return 1;
        }
        return a*powerOfANumber(a,exponential-1);
    }
}
