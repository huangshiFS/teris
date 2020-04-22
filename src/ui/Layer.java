package ui;

import javax.swing.*;
import java.awt.*;

/**
 * 绘制窗口
 */
public abstract class Layer {
    protected static final int PADDING = 16;
    protected static final int SIZE = 7;

    protected static Image WINDOW_IMG = new ImageIcon("graphics/window/window.png").getImage();

    protected static int WINDOW_W = WINDOW_IMG.getWidth(null);

    protected static int WINDOW_H = WINDOW_IMG.getHeight(null);

    /**
     * 窗口左上角x坐标
     */
    protected int x;
    /**
     * 窗口左上角y坐标
     */
    protected int y;
    /**
     * 窗口宽度
     */
    protected int w;
    /**
     * 窗口高度
     */
    protected int h;

    protected Layer(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    /**
     * 绘制窗口
     */
    protected void createWindow(Graphics g){
        // 左上
        g.drawImage(WINDOW_IMG,x,y,x+SIZE,y+SIZE,0,0,SIZE,SIZE,null);
        // 中上
        g.drawImage(WINDOW_IMG,x+SIZE,y,x+w-SIZE,y+SIZE,SIZE,0,WINDOW_W-SIZE,SIZE,null);
        // 右上
        g.drawImage(WINDOW_IMG,x+w-SIZE,y,x+w,y+SIZE,WINDOW_W-SIZE,0,WINDOW_W,SIZE,null);
        // 左中
        g.drawImage(WINDOW_IMG,x,y+SIZE,x+SIZE,y+h-SIZE,0,SIZE,SIZE,WINDOW_H-SIZE,null);
        // 中
        g.drawImage(WINDOW_IMG,x+SIZE,y+SIZE,x+w-SIZE,y+h-SIZE,SIZE,SIZE,WINDOW_W-SIZE,WINDOW_H-SIZE,null);
        // 右中
        g.drawImage(WINDOW_IMG,x+w-SIZE,y+SIZE,x+w,y+h-SIZE,WINDOW_W-SIZE,SIZE,WINDOW_W,WINDOW_H-SIZE,null);
        // 左下
        g.drawImage(WINDOW_IMG,x,y+h-SIZE,x+SIZE,y+h,0,WINDOW_H-SIZE,SIZE,WINDOW_H,null);
        // 中下
        g.drawImage(WINDOW_IMG,x+SIZE,y+h-SIZE,x+w-SIZE,y+h,SIZE,WINDOW_H-SIZE,WINDOW_W-SIZE,WINDOW_H,null);
        // 右下
        g.drawImage(WINDOW_IMG,x+w-SIZE,y+h-SIZE,x+w,y+h,WINDOW_W-SIZE,WINDOW_H-SIZE,WINDOW_W,WINDOW_H,null);


    }

    /**
     * 刷新游戏具体内容
     * @author huangshiFS
     * @param g 画笔
     */
    abstract public void paint(Graphics g);
}
