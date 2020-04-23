package ui;

import config.ConfigFactory;
import config.GameConfig;
import config.LayerConfig;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class JPanelGame extends JPanel {
    private List<Layer> layers = null;

    public JPanelGame() {
        // 初始化组件
        initComponent();
        // 初始化层
        initLayer();
    }

    /**
     * 初始化组件
     */
    private void initComponent(){

    }

    /**
     * 初始化层
     */
    private void initLayer() {
        try {
            // 获得游戏配置
            GameConfig cfg = ConfigFactory.getGameConfig();
            // 获得层配置
            List<LayerConfig> layersCfg = cfg.getLayersConfig();
            // 创建游戏层数组
            layers = new ArrayList<>(layersCfg.size());
            // 创建所有层对象
            for (LayerConfig layCfg : layersCfg) {
                // 获得类对象
                Class<?> cls = Class.forName(layCfg.getClassName());
                // 获得构造函数
                Constructor ctr = cls.getConstructor(int.class, int.class, int.class, int.class);
                // 调用构造函数函数创建对象
                Layer l = (Layer) ctr.newInstance(
                        layCfg.getX(), layCfg.getY(), layCfg.getW(), layCfg.getH()
                );
                // 把创建对象放入集合
                layers.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        // 绘制游戏
        for (int i = 0; i < layers.size(); layers.get(i++).paint(g)) ;

    }
}
