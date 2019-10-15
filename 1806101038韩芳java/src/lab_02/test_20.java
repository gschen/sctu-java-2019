package lab_02;

public class test_20 {
    public static void main(String[] args) {
        String a="jcdslj38938hcnj284n38dn";
        byte[] arr=a.getBytes();
        String number="";
        for(byte b:arr){ int aa=(int)b;
            for(int i=48;i<57;i++){
                if(aa==i){ number=number+(aa-48);
                    break;
                } } }
        System.out.println(number);
    }
}
