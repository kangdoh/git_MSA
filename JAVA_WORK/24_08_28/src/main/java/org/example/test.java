import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) {

        // 주민번호 및 전화번호에 사용하면 좋겠다.
        StringTokenizer stringTokenizer = new StringTokenizer("121212-2541212", "-");
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        // copyOf 복사 방법
        int arr[] = {1,2,3,4,56,5,5};
        int arrcopy[] = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arrcopy));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

// Arrays equals는 내용 비교를 하는데
// 오버라이딩을 안해서 object 클래스의 equ]]]als가 와서 내용비교가 아닌 참조값(같은 인스턴스이가? 이런?) 비교를 했다.

// ★★★★★ 오버라이딩을 하는 방법을 공부해야한다. ★★★★★

class Inum {
    private int num;
    public Inum(int num){
        this.num = num;
    }
}