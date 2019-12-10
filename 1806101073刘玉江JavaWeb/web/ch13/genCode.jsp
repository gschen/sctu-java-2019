<%@ page import="java.awt.image.BufferedImage" %>
<%@ page import="java.awt.*" %>
<%@ page import="javax.imageio.ImageIO" %>
<%@ page import="java.util.Random" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    int width = 60;
    int height = 20;

    Random rad = new Random();
    int randNum= rad.nextInt(8999)+1000;

    session.setAttribute("randCode",randNum);

    BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

    Graphics g = image.getGraphics();
    //画矩形
//    g.setColor(Color.BLUE);
    g.setColor(new Color(200,200,200));
    g.fillRect(0,0, width, height);
    //画数字
    g.setColor(Color.red);
    g.setFont(new Font("",Font.PLAIN,15));
    g.drawString(String.valueOf(randNum),15,15);

    //增加噪声
    for (int i = 0; i <100 ; i++) {
        int x = rad.nextInt(width);
        int y = rad.nextInt(height);
        g.setColor(Color.BLUE);
        g.drawOval(x,y,1,1);
    }


    ImageIO.write(image,"JPEG",response.getOutputStream());
    out.clear();
    out = pageContext.pushBody();



%>