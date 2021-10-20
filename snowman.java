import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class snowman extends JFrame {
    public snowman(){
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics canvas){
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(155,100,20,20);
        canvas.setColor(Color.BLUE);
        canvas.drawOval(100,50,200,200);
		canvas.fillOval(155,100,20,20);
        canvas.fillOval(230,100,20,20);
		canvas.drawArc(150,160,100,50,180,180);
    }
    public static void main(String[] args) {
        snowman f=new snowman();
        f.setVisible(true);
        
    }
    
}

