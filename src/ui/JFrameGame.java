package ui;

import config.ConfigFactory;
import config.GameConfig;

import javax.swing.*;
import java.awt.*;

public class JFrameGame extends JFrame {
    public JFrameGame(JPanelGame panelGame) {
        // 获取游戏配置
        GameConfig cfg = ConfigFactory.getGameConfig();
        // 设置标题
        this.setTitle(cfg.getTitle());
        // 设置默认关闭属性（程序结束）
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口大小
        this.setSize(cfg.getWidth(), cfg.getHeight());
        // 不用许用户改变窗口大小
        this.setResizable(false);
        // 居中
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int x = screen.width - this.getWidth() >> 1;
        int y = (screen.height - this.getHeight() >> 1) - cfg.getWindowUp();
        this.setLocation(x, y);
        // 谁在默认Panel
        this.setContentPane(panelGame);
        // 默认该窗口为显示
        this.setVisible(true);
    }
}
