<%@ page import="java.awt.image.BufferedImage" %>
<%@ page import="java.awt.*" %>
<%@ page import="javax.imageio.ImageIO" %>
<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int width = 60;
    int height = 20;

    BufferedImage img = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

    Graphics g = img.getGraphics();

    g.setColor(new Color(200,200,200));//画矩形
    //g.setColor(Color.blue);
    g.fillRect(0,0,width,height);//绘制图案
//产生一个4位数的随机数
    Random random =new Random();
    int randNum =  random.nextInt(8999)+1000;

    session.setAttribute("randCode",randNum);

    g.setColor(Color.RED);
    g.setFont(new Font("",Font.PLAIN,18));
    g.drawString(String.valueOf(randNum),15,15);//画数字
    //写

    //增加一些噪声
    for (int i = 0;i<1000;i++){}
    int x = random.nextInt(width);
    int y = random.nextInt(height);

    g.drawOval(x,y,1,1);

    ImageIO.write(img,"JPEG",response.getOutputStream());//输出img
    out.clear();
    out= pageContext.pushBody();

%>