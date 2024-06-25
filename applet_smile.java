import java.awt.*;
import java.applet.*;
public class applet_smile extends Applet
{
    public void paint(Graphics g)
    {
        Font f=new Font("Arial",Font.BOLD,25);
        g.setFont(f);
        g.setColor(Color.blue);
        g.drawOval(150,150,200,200);
        g.drawOval(200,200,25,25);
        g.drawOval(270,200,25,25);
        g.drawArc(200,220,100,100,180,180);

    }
}

/*
<html>
   <body>
       <applet code="applet_smile" width='500' height='500'>
       </applet>
   </body>
</html>
*/
