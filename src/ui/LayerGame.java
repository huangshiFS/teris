package ui;

import javax.swing.*;
import java.awt.*;

public class LayerGame extends Layer {
    private static Image ACT = new ImageIcon("graphics/game/rect.png").getImage();

    private static int ACT_SIZE = 32;
    public LayerGame(int x, int y, int w, int h){
        super(x,y,w,h);
    }
    public void paint(Graphics g){
        this.createWindow(g);
        this.dto.getGameAct().getActPoint();
        Point[] points = this.dto.getGameAct().getActPoint();
        for(int i = 0;i<points.length;i++){
            g.drawImage(ACT,
                    this.x+points[i].x*ACT_SIZE+7,
                    this.y+points[i].y*ACT_SIZE+7,
                    this.x+points[i].x*ACT_SIZE+ACT_SIZE+7,
                    this.y+points[i].y*ACT_SIZE+ACT_SIZE+7,
                    32,0,64,32,null);
        }
    }
}
