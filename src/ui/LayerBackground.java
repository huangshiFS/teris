package ui;

import javax.swing.*;
import java.awt.*;

public class LayerBackground extends Layer {
    // TODO 临时背景
    private static Image IMG_GB_TEMP = new ImageIcon("graphics/background/Fish.jpg").getImage();

    public LayerBackground(int x, int y, int w, int h){
        super(x,y,w,h);
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(IMG_GB_TEMP,0,0,1162,654,null);
    }
}
