package service;

import dto.GameDto;
import entity.GameAct;

import java.awt.*;
import java.util.Random;

public class GameService {
    private GameDto dto;
    /**
     * 随机数生成器
     */
    private Random random = new Random();

    /**
     * 方块种类个数
     */
    private static final int MAX_TYPE = 6;
    public GameService(GameDto dto) {
        this.dto = dto;
        GameAct act = new GameAct();
        dto.setGameAct(act);
    }

    /**
     * 控制器方向键(上)
     */
    public void keyUp() {
        this.dto.getGameAct().round(this.dto.getGameMap());
    }

    /**
     * 控制器方向键(下)
     */
    public void keyDown() {
        if(!this.dto.getGameAct().move(0,1,this.dto.getGameMap())){
            // 获得游戏地图对象
            boolean[][] map = this.dto.getGameMap();
            // 获得方块对象
            Point[] act = this.dto.getGameAct().getActPoints();
            // 将方块堆积到地图数组
            for (int i = 0 ; i < act.length ; i++){
                map[act[i].x][act[i].y] = true;
            }
            // TODO 判断是否可以消行
            // 消行操作
            // 算分操作
            // 判断是否升级
            // 刷新一个新的方块
            this.dto.getGameAct().init(random.nextInt(MAX_TYPE));
        }
    }

    /**
     * 控制器方向键(左)
     */
    public void keyLeft() {
        this.dto.getGameAct().move(-1, 0,this.dto.getGameMap());
    }

    /**
     * 控制器方向键(右)
     */
    public void keyRight() {
        this.dto.getGameAct().move(1,0,this.dto.getGameMap());
    }
}
