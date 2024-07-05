public class ex001 {
//    main 영역으로 다시 넘기는 방법 return

    public static String doA(){

        int a = 10;
        System.out.println("doA");
        System.out.println("a ="+a);

        return "dfdf";
    }


    public static void main(String[] args) {
        String a = doA();
        System.out.println(a);
    }




}
