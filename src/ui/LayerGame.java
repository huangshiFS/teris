package ui;

import java.awt.*;

public class LayerGame extends Layer {
    public LayerGame(int x, int y, int w, int h){
        super(x,y,w,h);
    }
    public void paint(Graphics g){
        this.createWindow(g);
        g.setFont(new Font("黑体",Font.BOLD,64));
        String temp = Integer.toString(this.dto.getNowPoint());
        g.drawString(temp,this.x+PADDING,this.y+PADDING);
    }
}
