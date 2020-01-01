package src.lab_03.Test_05;

import java.io.*;

public class Main {
    //加密
    public static String encode(String data){
        byte[] b =data.getBytes();
        for (int i = 0; i <b.length ; i++) {
            b[i] +=1;
        }
        return new String(b);

    }
    //加密
    public static String decode(String data){
        char[] a = data.toCharArray();
        for (int i = 0; i <a.length ; i++) {
            a[i] -= 1;
        }
        return new String(a);
    }
    public static void main(String[] args) throws IOException {
        String data = "hello";
        String result = encode(data);
        System.out.println(result);
        //将密文写入文件
        FileOutputStream out = null;
        byte c[] = result.getBytes();
        try {
            out = new FileOutputStream("D:\\demo3.txt");
            out.write(c);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //将密文解密后输出
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream("D:\\demo3.txt"),"UTF-8")
        );
        int tempchar;
        while ((tempchar = bufferedReader.read())!=-1){
            stringBuffer.append((char) tempchar);
        }
        String str1 = String.valueOf(stringBuffer);
        bufferedReader.close();
        String str = decode(str1);
        System.out.println(str);
        System.out.println();


    }
}
