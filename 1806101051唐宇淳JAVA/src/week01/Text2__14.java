package week01;

    public class Text2__14 {

public static void main(String[] args) {

                int j;
               boolean flag;
               for(int i=3;i<1000;i++){

                   flag=false;
                    for(j=3;j<i;j++){
                        if(i%j==0){
                            flag=true;
                          break;
                         }
                      }
                   if(flag==false){
                        System.out.print(i+"    ");
                        }
                    }
              }
}

