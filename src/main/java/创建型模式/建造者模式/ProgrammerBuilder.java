package 创建型模式.建造者模式;

/**
 * @author chenzhuo
 * @version 1.0.0
 * @description: 程序员制造者
 * @create: 2021-10-27 14:07
 */
public class ProgrammerBuilder extends PersonBulider{

    @Override
    public void drawHead() {
        System.out.println("程序员的头");
    }

    @Override
    public void drawBody() {
        System.out.println("程序员的身体");
    }

    @Override
    public void drawLeftArm() {
        System.out.println("程序员的左手");
    }

    @Override
    public void drawRightArm() {
        System.out.println("程序员的右手");
    }

    @Override
    public void drawLeftLeg() {
        System.out.println("程序员的左脚");
    }

    @Override
    public void drawRightLeg() {
        System.out.println("程序员的右脚");
    }
}
