package 创建型模式.建造者模式;

/**
 * @author chenzhuo
 * @version 1.0.0
 * @description: 指挥者
 * @create: 2021-10-27 14:03
 */
public class Director {

    public Director(PersonBulider personBulider) {
        this.personBulider = personBulider;
    }

    private final PersonBulider personBulider;

    /**
     * 这里其实应该返回建造结果
     */
    public void drawPerson() {
        personBulider.drawHead();
        personBulider.drawLeftArm();
        personBulider.drawRightArm();
        personBulider.drawLeftLeg();
        personBulider.drawRightLeg();
    }
}
