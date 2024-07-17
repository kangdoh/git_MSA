public class StringBuilder {

    public static void main(String[] args) {
        // 속도가 빠르다.
        // 긴 문자를 다룰때

        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("asdf");
        sb.append("asdf");

        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println(sb);

        sb.replace(0,5,"kkk");
        System.out.println(sb);

        sb.append("asdf");
        sb.reverse();
        System.out.println(sb);


    }
}
