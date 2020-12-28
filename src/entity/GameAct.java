package entity;

import java.awt.*;

public class GameAct {
    private Point[] actPoints;
    public GameAct(){
        // TODO 配置文件
        actPoints = new Point[]{
                new Point(3,0),
                new Point(4,0),
                new Point(5,0),
                new Point(5,1),
        };
    }

    public Point[] getActPoints() {
        return actPoints;
    }

    /**
     * 方块移动
     *
     * @param moveX X轴偏移量
     * @param moveY Y轴偏移量
     */
    public void move(int moveX,int moveY){
        // 边界判定
//        if(int i = 0;i<nowPoints.length;i++){
//            nowPoints[i].x
//        }
        // 移动处理
        for(int i = 0;i < actPoints.length;i++ ){
            actPoints[i].x += moveX;
            actPoints[i].y += moveY;
        }
    }

    public Point[] getActPoint() {
        return actPoints;
    }
}
