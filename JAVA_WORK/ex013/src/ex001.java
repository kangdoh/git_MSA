import java.util.Arrays;

public class ex001 {

    public static void main(String[] args) {

        int num[][] = new int[4][3];

        System.out.println(num.length);
        System.out.println(num[0].length);
        System.out.println(num[1].length);
        System.out.println(num[2].length);
        System.out.println(num[3].length);

        int a = 0;

        for(int i =0; i<4; i++){
            for(int j =0; j<3; j++){
                num[i][j] = a++;
            }
        }

        for(int i =0; i<num.length; i++){
            for(int j =0; j<num[i].length; j++){
                System.out.println(num[i][j]+"\t");
            }
        }

        System.out.println(a);



    }
}
