package dto;

import entity.GameAct;

import java.util.List;

public class GameDto {
    /**
     * 数据库记录
     */
    private List<Player> dbRecode;
    /**
     * 本地记录
     */
    private List<Player> diskRecode;

    private boolean[][] gameMap;
    /**
     * 下滑方块
     */
    private GameAct gameAct;
    /**
     * 下一个
     */
    private int next;
    /**
     * 等级
     */
    private int nowLevel;
    /**
     * 分数
     */
    private int nowPoint;

    public List<Player> getDbRecode() {
        return dbRecode;
    }

    public void setDbRecode(List<Player> dbRecode) {
        this.dbRecode = dbRecode;
    }

    public List<Player> getDiskRecode() {
        return diskRecode;
    }

    public void setDiskRecode(List<Player> diskRecode) {
        this.diskRecode = diskRecode;
    }

    public boolean[][] getGameMap() {
        return gameMap;
    }

    public void setGameMap(boolean[][] gameMap) {
        this.gameMap = gameMap;
    }

    public GameAct getGameAct() {
        return gameAct;
    }

    public void setGameAct(GameAct gameAct) {
        this.gameAct = gameAct;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getNowPoint() {
        return nowPoint;
    }

    public int getNowLevel() {
        return nowLevel;
    }

    public void setNowLevel(int nowLevel) {
        this.nowLevel = nowLevel;
    }

    public void setNowPoint(int nowPoint) {
        this.nowPoint = nowPoint;
    }

    public int getNowRemoveLine() {
        return nowRemoveLine;
    }

    public void setNowRemoveLine(int nowRemoveLine) {
        this.nowRemoveLine = nowRemoveLine;
    }

    private int nowRemoveLine;

}
