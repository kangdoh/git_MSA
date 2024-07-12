public class Ex05 {
    public static void main(String[] args) {

        String str = "안녕|하세요|";
        String[] tempstr = str.split("|");
        // ㄴ split 나누다

        for(int i = 0; i < tempstr.length; i++) {
            System.out.println(tempstr[i]);
        }




        String a = "abcdefgh";
        System.out.println(a.length());

        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));

        System.out.println(a.substring(2));
        System.out.println(a.substring(2,5));
        System.out.println(a.toUpperCase());
        System.out.println("cd를 포함하냐 = "+a.contains("cd"));


        System.out.println("배열출력 시작");
        char[] test = a.toCharArray();  // char 한글자고 ''로 이뤄짐
        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }
        System.out.println("배열출력 끝");

        test[2] = 'A';
        String testStr = new String(test);
        System.out.println(testStr);


        int[] b = new int[3];
        System.out.println(b.length);

    }
}
