public class aa {
    public static void main(String[] args) {

        int sum = 0;
        for (int i =1; ; i++){
            System.out.println("i ="+i);
//            sum=+i;
            if(i%2==0){
                sum = sum - i;
            }
            else{
                sum = sum + i;
            }
            if(sum>100){
                break;
            }
            System.out.println("중간 sum"+sum);
        }


        System.out.println(sum);
    }
}