package ui;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;

public class LayerDataBase extends Layer {
    private static Image IMG_DB = new ImageIcon("graphics/string/db.png").getImage();
    public LayerDataBase(int x, int y, int w, int h){
        super(x,y,w,h);
    }

    public void paint(Graphics g){
        this.createWindow(g);
        g.drawImage(IMG_DB,this.x+PADDING,this.y+PADDING,null);
    }
}
