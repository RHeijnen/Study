package Problem2;

/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.


 */
public class Main {

    public static void main(String[] args) {
        int limiter = 4000000;
        int Fibonacci = 0, holder1 = 0, holder2 = 1, sum = 0;

        while(Fibonacci<limiter){
            Fibonacci = holder1 + holder2;
            holder1 = holder2;
            holder2 = Fibonacci;

            if(Fibonacci%2 == 0){
                sum = sum + Fibonacci;
            }
        }
        System.out.println(sum);
    }
}

/*

    First try

        int limiter = 4000000;
        int Fibonacci = 0, holder1 = 0, holder2 = 1, sum = 0;

        for(int i = 0; i < 100;i++){
            if( Fibonacci > 4000000){
                break;
            }else{
                Fibonacci = holder1+holder2;
                holder1 = holder2;
                holder2 = Fibonacci;
                if(Fibonacci%2 == 0){
                    sum = sum + Fibonacci;
                }
            }
        }
        System.out.println(sum);

 */