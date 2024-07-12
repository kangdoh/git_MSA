public class Main {

    Main(){
        int ar[] = {10,20,30,40,50};
        doA(ar);
    }

    public void doA(int[]qw){
        int sum = 0;
        for(int i = 0; i<qw.length; i++){
            sum = sum+ qw[i];
        }
        System.out.println(sum);
    }

    public int[] makeary(int len){
        return new int[len];
    }


    public static void main(String[] args) {
        Main sub = new Main();

        System.out.println(sub);
    }
}