package 创建型模式.建造者模式;

/**
 * @author chenzhuo
 * @version 1.0.0
 * @description: 画人的抽象类
 * @create: 2021-10-27 14:00
 */
public abstract class PersonBulider {

    /**
     * 画头
     */
    public abstract void drawHead();

    /**
     * 画身体
     */
    public abstract void drawBody();

    /**
     * 画左手
     */
    public abstract void drawLeftArm();

    /**
     * 画右手
     */
    public abstract void drawRightArm();

    /**
     * 画左脚
     */
    public abstract void drawLeftLeg();


    /**
     * 画右脚
     */
    public abstract void drawRightLeg();

}
