package ui;

import java.awt.*;

public class LayPoint extends Lay{
    public LayPoint(int x,int y,int w,int h){
        super(x,y,w,h);
    }
    public void paint(Graphics g){
        this.createWindow(g);
    }
}
