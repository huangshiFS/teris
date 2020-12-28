package service;

import dto.GameDto;
import entity.GameAct;

import java.awt.*;

public class GameService {
    private GameDto dto;

    public GameService(GameDto dto) {
        this.dto = dto;
        GameAct act = new GameAct();
        dto.setGameAct(act);
    }

    /**
     * 控制器方向键(上)
     */
    public void keyUp() {
        // TODO 旋转'
        this.dto.getGameAct().move(0,-1);
    }

    /**
     * 控制器方向键(下)
     */
    public void keyDown() {
        this.dto.getGameAct().move(0,1);
    }

    /**
     * 控制器方向键(左)
     */
    public void keyLeft() {
        this.dto.getGameAct().move(-1,0);
    }

    /**
     * 控制器方向键(右)
     */
    public void keyRight() {
        this.dto.getGameAct().move(1,0);
    }
    private boolean canMove(int moveX,int moveY){
        Point[] nowPoints = this.dto.getGameAct().getActPoints();
        for(int i =0;i<nowPoints.length;i++){
            int newX = nowPoints[i].x + moveX;
            int newY = nowPoints[i].y + moveY;
            // TODO 配置
            if(newX<0 || newX > 9 || newY < 0 || newY > 17){
                return false;
            }
        }
        return true;
    }
}
