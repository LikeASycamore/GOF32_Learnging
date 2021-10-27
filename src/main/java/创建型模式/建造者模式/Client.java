package 创建型模式.建造者模式;

/**
 * @author chenzhuo
 * @version 1.0.0
 * @description: 客户端
 * @create: 2021-10-27 14:08
 */
public class Client {
    public static void main(String[] args) {
        // 1.先制造一个帅哥
        // 2.再制造一个程序员
        PersonBulider handsomeBoyBuilder = new HandsomeBoyBuilder();
        Director director = new Director(handsomeBoyBuilder);
        director.drawPerson();
        System.out.println("帅哥制造完毕；接下来制造程序员");
        PersonBulider programmerBuilder = new ProgrammerBuilder();
        director = new Director(programmerBuilder);
        director.drawPerson();
    }
}
