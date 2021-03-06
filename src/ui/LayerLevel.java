package ui;

import javax.swing.*;
import java.awt.*;

public class LayerLevel extends Layer {
    private static Image IMG_LV = new ImageIcon("graphics/string/level.png").getImage();
    public LayerLevel(int x, int y, int w, int h){
        super(x,y,w,h);
    }
    public void paint(Graphics g){
        this.createWindow(g);
        g.drawImage(IMG_LV,this.x+PADDING,this.y+PADDING,null);
    }
}
