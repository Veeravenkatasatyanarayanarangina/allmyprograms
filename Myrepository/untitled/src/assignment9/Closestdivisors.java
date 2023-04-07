package assignment9;

public class Closestdivisors
{
    public int[] closestDivisors(int num) {
        int min = Integer.MAX_VALUE;
        int[] closest = new int[2];
        int divisor = 0;
        for(int i = 1; i <= (int) Math.sqrt(num + 2); i++){
            if((num+1) % i == 0){
                divisor = (num+1) / i;
                if(i < divisor){
                    if(divisor - i < min){
                        min = divisor - i;
                        closest[0] = i;
                        closest[1] = divisor;
                    }
                }else{
                    if(i - divisor < min){
                        min = i - divisor;
                        closest[0] = divisor;
                        closest[1] = i;
                    }
                }
            }

            if((num+2) % i == 0){
                divisor = (num+2) / i;
                if(i < divisor){
                    if(divisor - i < min){
                        min = divisor - i;
                        closest[0] = i;
                        closest[1] = divisor;
                    }
                }else{
                    if(i - divisor < min){
                        min = i - divisor;
                        closest[0] = divisor;
                        closest[1] = i;
                    }
                }
            }
        }


        return closest;
    }

    public static void main(String[] args) {
        Closestdivisors cl = new Closestdivisors();

        int clv[]=cl.closestDivisors(999);
        for (int k:clv
             ) {
            System.out.println(k);



        }
        System.out.println(Integer.MAX_VALUE);

    }
}
