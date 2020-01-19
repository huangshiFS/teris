package ui;

import java.awt.*;

public class LayLevel extends Lay{
    public LayLevel(int x,int y,int w,int h){
        super(x,y,w,h);
    }
    public void paint(Graphics g){
        this.createWindow(g);
    }
}
