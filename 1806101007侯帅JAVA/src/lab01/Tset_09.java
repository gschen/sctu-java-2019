package lab_01;

public class Tset_09 {
    public static void main(String[] args) {
        System.out.println("                "+"A"+"           ");
        System.out.println("              "+"B"+"   "+"C"+"       ");
        System.out.println("            "+"D"+"   "+"E"+"   "+"F"+"");
        System.out.println("         "+" G "+" "+"H"+"    "+"I"+"   "+"J"+"");
        System.out.println("         "+" K "+" "+"L"+"    "+"M"+"   "+"N"+"");
        System.out.println("            "+"O"+"   "+"P"+"   "+"Q"+"");
        System.out.println("              "+"R"+"   "+"S"+"       ");
        System.out.println("                "+"T"+"           ");
    }
}
class  Test_09_1{
    public static void main(String[] args) {
        int num = 64;

        for(int i = 0;i < 4;i++){
            for(int k = 0;k < 3 - i;k++){
                System.out.print(" ");
            }
            for(int j = 0;j < i +1;j++){
                for(int l = j;l < j + 1;l++){
                    char z = (char)(num + 1);
                    System.out.print(z + " ");
                    num = (int)z;
                }
            }
            System.out.println();
        }
        for(int i = 0;i < 4;i++){
            for(int k = 0;k < i ;k++){
                System.out.print(" ");
            }
            for(int j = 0;j < 4 - i;j++){
                for(int l = j;l < j + 1;l++){
                    char z = (char)(num + 1);
                    System.out.print(z + " ");
                    num = (int)z;
                }
            }
            System.out.println();
        }

    }}

