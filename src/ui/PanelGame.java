package ui;

import javax.swing.*;
import java.awt.*;

public class PanelGame extends JPanel {
    private Lay[] lays = null;
    public PanelGame(){
        lays = new Lay[]{
                new LayDataBase(40,32,334,279),
                new LayDisk(40,343,334,279),
                new LayGame(414,32,334,590),
                new LayButton(788,32,334,124),
                new LayNext(788,188,176,148),
                new LayLevel(964,188,158,148),
                new LayPoint(788,368,334,200)
        };
    }

    @Override
    public void paintComponent(Graphics g){
        // 循环属性游戏画面
        for(int i = 0;i < lays.length;i++){
            // 刷新层窗口
            lays[i].paint(g);
        }
    }
}
