package lab02.Test_01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Address {
    //有以下属性：国家，省份，城市，街道，邮编
    String country;
    String priv;
    String city;
    String stress;
    int number;

    void COUNTRY(){
        System.out.println("中国");
    }
    void PRIV(){
        System.out.println("四川");

    }
    void CITY(){
        System.out.println("成都");
    }
    void STRESS(){
        System.out.println("天府大道");
    }
    void NUMBER(){
        System.out.println("1234");
    }


    public static void main(String[] args) {
        Address add = new Address();
        add.COUNTRY();
        add.PRIV();
        add.CITY();
        add.STRESS();
        add.NUMBER();

    }
}
