package 行为型模式.观察者模式;

/**
 * @author chenzhuo
 * @version 1.0.0
 * @description: 读者：订阅了小说主题
 * @create: 2021-10-27 16:46
 */
public class Reader extends Observer{

    private String name;
    private NovelSubject novelSubject;

    public Reader(String name, NovelSubject novelSubject) {
        this.name = name;
        this.novelSubject = novelSubject;
        // 订阅的时候，在主题中加入读者
        novelSubject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(name + "你好，" + novelSubject.getMessage());
    }
}
