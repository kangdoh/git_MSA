public class ex005 {

    public static void main(String[] args) {

        String str1 = "new Srting";
        String str2 = "new Srting";

        System.out.println(str1==str2);

        String str3 = new String("new Srting");
        String str4 = new String("new Srting");

        System.out.println(str3==str4);


    }
}
