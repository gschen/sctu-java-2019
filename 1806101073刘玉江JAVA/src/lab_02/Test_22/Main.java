
package src.lab_02.Test_22;


public class Main {
    public static void main(String[] args) {
        String str = "Sdadasdasdad123D%!&";
        for(int i=0;i<str.length();i++){
            int temp=(int)str.charAt(i); //得到当前字符的ascii
            if (temp>=65&&temp<=96){
                temp = temp +32;
            }else if (temp>=48&&temp<=57){
                temp = 48;
            }else if(temp>=97&&temp<=122){
                temp = temp;
            }
            else {
                temp = 35;
            }
            System.out.print((char)temp);
        }

    }
}



