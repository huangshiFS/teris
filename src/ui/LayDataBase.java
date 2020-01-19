package ui;

import javax.swing.*;
import java.awt.*;

public class LayDataBase extends Lay{
    public LayDataBase(int x, int y,int w,int h){
        super(x,y,w,h);
    }

    public void paint(Graphics g){
        this.createWindow(g);
    }
}
