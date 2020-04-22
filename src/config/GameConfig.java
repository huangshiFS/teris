package config;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 游戏配置
 */
public class GameConfig {
    /**
     * 窗口宽度
     */
    private int width;
    /**
     * 窗口高度
     */
    private int height;
    /**
     * 边框尺寸
     */
    private int windowSize;
    /**
     * 边框内编剧
     */
    private int padding;
    /**
     * 图层属性
     */
    private List<LayerConfig> layersConfig;

    /**
     * 构造函数
     * 读取xml文件，获取全部游戏配置
     * @throws Exception
     */
    public GameConfig() throws Exception{
        // 创建XML读取器
        SAXReader reader = new SAXReader();
        // 读取XML文件
        Document doc = reader.read("config/cfg.xml");
        // 获取XML文件的根结点
        Element game = doc.getRootElement();
        // 配置窗口
        this.setUiConfig(game.element("frame"));
        this.setSystemConfig(game.element("system"));
        this.setDataConfig(game.element("data"));
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWindowSize() {
        return windowSize;
    }

    public int getPadding() {
        return padding;
    }

    public List<LayerConfig> getLayersConfig() {
        return layersConfig;
    }

    /**
     * 配置窗口
     * @param frame 配置文件窗口配置元素
     */
    private void setUiConfig(Element frame){
        this.width = Integer.parseInt(frame.attributeValue("width"));
        this.height = Integer.parseInt(frame.attributeValue("height"));
        this.windowSize = Integer.parseInt(frame.attributeValue("windowSize"));
        this.padding = Integer.parseInt(frame.attributeValue("padding"));
        List<Element> layers = frame.elements("layer");
        layersConfig = new ArrayList<LayerConfig>();
        for(Element layer:layers){
            LayerConfig lc = new LayerConfig(
                    layer.attributeValue("className"),
                    Integer.parseInt(layer.attributeValue("x")),
                    Integer.parseInt(layer.attributeValue("y")),
                    Integer.parseInt(layer.attributeValue("w")),
                    Integer.parseInt(layer.attributeValue("h"))
            );
            layersConfig.add(lc);
        }
    }

    /**
     * 配置系统参数
     * @param frame
     */
    private void setSystemConfig(Element frame){
        // TODO
    }

    /**
     * 配置数据参数
     * @param frame
     */
    private void setDataConfig(Element frame){
        // TODO
    }

}
