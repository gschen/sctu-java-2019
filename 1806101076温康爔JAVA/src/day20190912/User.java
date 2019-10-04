package day20190912;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class User {
    //3.非常特殊的函数————构造函数
    //1)函数的名字与类名一样
    //2)函数没有返回值
    User(){}

    User(String name,int age){
        //对成员变量进行赋值(初始化)
        //this.name="lun";
        //this.age=27;
        this.name=name;
        this.age=age;
        System.out.println("这是打篮球！");
    }

    //1.成员变量、属性
    //名字、性别、年龄、身高、体重……

    String name;//ctrl+b
    int age;

    //2.成员方法、行为
    //打篮球、看电影、唱歌、跳舞、演戏……

    void basketball(){//void=空，无返回值
        int a=10;//定义一个变量
        this.age=27;
    }

    void movie(){
        System.out.println("这是看电影！");
    }


}
