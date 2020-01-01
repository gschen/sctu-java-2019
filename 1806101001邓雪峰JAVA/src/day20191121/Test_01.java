package day20191121;

import java.applet.Applet;
import java.awt.*;

public class Test_01 extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.drawString("java是一门优秀的语言",12,30);
        g.setColor(Color.red);
        g.drawString("我一定认真学习",22,56);
    }
}/*
Applet是采用Java编程语言编写的小应用程序，该程序可以包含在 HTML（标准通用标记语言的一个应用）页中，与在页中包含图像的方式大致相同。 [1]
含有Applet的网页的HTML文件代码中部带有<applet> 和</applet>这样一对标记，当支持Java的网络浏览器遇到这对标记时，就将下载相应的小应用程序代码并在本地计算机上执行该Applet。
*/
