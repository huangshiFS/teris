package ui;

import javax.swing.*;
import java.awt.*;

public class LayerGame extends Layer {
    private static Image ACT = new ImageIcon("graphics/game/rect.png").getImage();

    // TODO 配置文件
    private static int SIZE_ROL = 5;
    public LayerGame(int x, int y, int w, int h){
        super(x,y,w,h);
    }
    public void paint(Graphics g){
        this.createWindow(g);
        Point[] points = this.dto.getGameAct().getActPoints();

        int typeCode = this.dto.getGameAct().getTypeCode();
        // 打印方块
        for(int i = 0;i<points.length;i++){
            drawActByPoint(points[i].x,points[i].y,typeCode + 1,g);
        }
        // 打印地图
        boolean[][] map = this.dto.getGameMap();
        for(int x = 0; x < map.length ; x++){
            for(int y = 0 ; y < map[x].length ; y++){
                if(map[x][y]){
                    drawActByPoint(x,y,0,g);
                }
            }
        }
    }

    /**
     * 绘制正方形块
     * @param x
     * @param y
     * @param imgIdx
     * @param g
     */
    private void drawActByPoint(int x,int y,int imgIdx,Graphics g){
        g.drawImage(ACT,
                this.x + (x << SIZE_ROL) + 7,
                this.y + (y << SIZE_ROL) + 7,
                this.x + (x + 1<<SIZE_ROL) + 7,
                this.y + (y + 1<<SIZE_ROL) + 7,
                imgIdx << SIZE_ROL,0,(imgIdx + 1) << SIZE_ROL , 1<<SIZE_ROL,null);
    }
}
