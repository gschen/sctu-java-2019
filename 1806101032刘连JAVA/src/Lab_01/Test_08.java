package Lab_01;
public class Test_08 {
    public static void main(String[] args){
        int row=0;
        int col=0;
        for( row = 1; row < 9; row++){ //++表示自变量自增，a++表示a+=1，同理可得a--
            for( col = 1; col <= row; col++){
                System.out.print( col+"*"+row+"="+(row*col)+" ");
            }
        }
            System.out.println("\n");//println表示换行
        }
    }


