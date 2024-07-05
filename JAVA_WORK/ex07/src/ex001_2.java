public class ex001_2 {

    public static void main(String[] args) {
        int result = sub();
        double result2 = sub2();
        String letter = sub3();

//        System.out.println(result + result2);
        double total = result + result2;
        System.out.println(total+letter);


//        System.out.println(sub(100));
    }


    public static int sub(){
        return 10;
    }
    public static  double sub2(){
        return 2.5555;
    }
    public static String sub3(){
        return "이게 맞는건가?";
    }



}
