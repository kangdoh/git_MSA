package org.example;

import java.util.Optional;

class ContInfo{
    String phone;
    String addres;

    public String getPhone(){return phone;}
    public String getAddres(){return addres;}

    public ContInfo(String phone, String addres) {
        this.phone = phone;
        this.addres = addres;
    }
}

public class ex05 {
    public static void main(String[] args) {

        Optional<ContInfo> contInfo =
                Optional.of(new ContInfo(null, "KOREA DAEGU"));

        String phone = contInfo.map(contInfo1 -> contInfo1.getPhone())
                .orElse("no phone number");
        System.out.println(phone);

        String adress = contInfo.map(contInfo1 -> contInfo1.getAddres())
                .orElse("nononoo adress");
        System.out.println(adress);


//        String phone = null;
//        String adress = null;

//        if(contInfo.getPhone() !=null)
//            phone=contInfo.getPhone();
//        else
//            phone = "EMPTY";

//        if(contInfo.getAddres() !=null)
//            adress=contInfo.getAddres();
//        else
//            adress = "EMPTY";




    }
}






