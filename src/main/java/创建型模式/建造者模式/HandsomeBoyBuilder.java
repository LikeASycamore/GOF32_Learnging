package 创建型模式.建造者模式;

/**
 * @author chenzhuo
 * @version 1.0.0
 * @description: 帅哥制造者
 * @create: 2021-10-27 14:06
 */
public class HandsomeBoyBuilder extends PersonBulider{
    @Override
    public void drawHead() {
        System.out.println("帅哥的头");
    }

    @Override
    public void drawBody() {
        System.out.println("帅哥的身体");
    }

    @Override
    public void drawLeftArm() {
        System.out.println("帅哥的左手");
    }

    @Override
    public void drawRightArm() {
        System.out.println("帅哥的右手");
    }

    @Override
    public void drawLeftLeg() {
        System.out.println("帅哥的左脚");
    }

    @Override
    public void drawRightLeg() {
        System.out.println("帅哥的右脚");
    }
}
