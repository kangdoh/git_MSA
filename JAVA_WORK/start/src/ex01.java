class TV{

    public TV(String name, int year, int inchi){
        System.out.println(name+"에서 만든"+year+"년형"+inchi+"인치 TV");
    }
    public void show(){}
}


public class ex01 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();


    }
}
