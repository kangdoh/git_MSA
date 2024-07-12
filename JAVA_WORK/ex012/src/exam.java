public class exam {

    class BankAccount{
        String accNumber;
        String ssNumber;
        int balance;

        public BankAccount(String a, String b, int c){
            accNumber = a;
            ssNumber = b;
            balance = c;
        }
    }

    class{

    }


    public static void main(String[] args) {
        BankAccount kang = new BankAccount("안녕", "반가워", 100);

        System.out.println(kang);
    }

}
