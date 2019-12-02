<%@ page import="java.awt.image.BufferedImage" %>
<%@ page import="java.awt.*" %>
<%@ page import="javax.imageio.ImageIO" %>
<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/29
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    //使用java生成一张图片
    int width = 300;
    int height = 80;

    BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

    //画图的库
    Graphics g = image.getGraphics();

    //g.setColor(new Color(200,200,200));
    g.setColor(new Color(17,104,226));
    g.fillRect(0,0,width,height);

    g.setColor(Color.white);
    g.fillRect(5,5,290,70);

    g.setColor(new Color(17,104,226));
    g.fillRect(10,10,280,60);

    //产生一个随机数
    Random rnd = new Random();
    int randNum = rnd.nextInt(8999)+1000;

    session.setAttribute("randCode",randNum);

    g.setColor(new Color(10,10,100));
    g.setFont(new Font("",Font.PLAIN,50));
    g.drawString("川A·G"+randNum,22,62);

    g.setColor(Color.white);
    g.setFont(new Font("",Font.PLAIN,50));
    g.drawString("川A·G"+randNum,19,59);

    g.setColor(new Color(230,230,230));
    g.setFont(new Font("",Font.PLAIN,50));
    g.drawString("川A·G"+randNum,20,60);

    //增加噪点
    for (int i = 0; i < 10; i++) {
        int x = rnd.nextInt(width);
        int y = rnd.nextInt(height);

        g.setColor(new Color(30,30,30));
        g.drawOval(x,y,3,3);
    }

    ImageIO.write(image,"JPEG",response.getOutputStream());
    //清空
    out.clear();
    out = pageContext.pushBody();
%>
