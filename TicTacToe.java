import java.awt.Graphics;

import javax.swing.JApplet;

public class TicTacToe extends JApplet {
    public void paint(Graphics canvas) {
        //GRID
        canvas.drawLine(100,100,500,100);
        canvas.drawLine(250,0,250,350);
        canvas.drawLine(100,200,500,200);
        canvas.drawLine(350,0,350,350);
        //LINE ACROSS
        canvas.drawLine(100,50,500,50);
        //X'S THAT GO WITH STRIKE
        canvas.drawString("X",180,55);
        canvas.drawString("X",300,55);
        canvas.drawString("X",410,55);
        //O'S SECOND LINE
        canvas.drawString("O",180,150);
        canvas.drawString("O",300,150);
        //O'S THIRD LINE
        canvas.drawString("O",180,250);
        canvas.drawString("O",410,250);
        //X ON SECOND LINE
        canvas.drawString("X",410,150);
        //X ON THIRD LINE
        canvas.drawString("X",300,250);
    }
}