package labor;

public class labor10 {
    public static void main(String[] args) {
        int count=1;
        for(int i=1;i<=100;i++){
            int j;
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j==i){
                if(count%5==0){
                    System.out.print(i+" ");
                    System.out.println();
                }else{
                    System.out.print(i+" ");
                }
                count++;
            }
        }
    }
}

