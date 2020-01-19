package ui;

import javax.swing.*;
import java.awt.*;

public class FrameGame extends JFrame {
    public FrameGame(){
        // 设置标题
        this.setTitle("Java俄罗斯方块");
        // 设置默认关闭属性（程序结束）
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口大小
        this.setSize(1200,700);
        // 不用许用户改变窗口大小
        this.setResizable(false);
        this.setLocation(100,100);
        // 居中
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int x = (screen.width - this.getWidth())/2;
        int y = (screen.height - this.getHeight())/2 - 32;
        this.setLocation(x,y);
        // 谁在默认Panel
        this.setContentPane(new PanelGame());
    }
}
