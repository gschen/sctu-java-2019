package lab_01;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;

public class Test_06 {
    public static void main(String[] args) {
        char grade=' ';
        System.out.println("请输入等级为");
        try
        {
            grade=(char)
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch(grade)
        {
            case 'A':
                System.out.println("范围在85~100");
            break;
            case 'B':
                System.out.println("范围在70~85");
            break;
            case 'C':
                System.out.println("范围在60~70");
                break;
            case 'D':
                System.out.println("范围在60分以下");
                break;
        }
    }
}


