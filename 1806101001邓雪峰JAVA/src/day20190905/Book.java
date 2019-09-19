package day20190905;

import javax.xml.bind.PrintConversionEvent;

public class Book {
    //属性
    private String Name;
    private String Writer;
    private String Data;
    private int Price;
    public void setName(String Name){
        this.Name =Name;
    }
    public void setWriter(String Writer){
        this.Writer = Writer;
    }
    public void setData(String Data){
        this.Data = Data;
    }
    public void setPrice(int Price){
        this.Price =Price;
    }
    public static void main(String[] args) {
        System.out.println("");

            /*
            Book.Data = "101010";
            B8ook.Name = "red and black and yellow";
            Book.Price = 10;
            Book.Writer = "mike mountain";
          */
    }
}
