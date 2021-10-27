package 行为型模式.观察者模式;

/**
 * @author chenzhuo
 * @version 1.0.0
 * @description: 客户端
 * @create: 2021-10-27 16:57
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个小说主题
        NovelSubject subject = new NovelSubject();

        // 定义一个观察者张三、李四，订阅了小说主题
        Observer observer = new Reader("张三", subject);
        Observer observer2 = new Reader("李四", subject);

        // 小说主题发布一条消息，并通知读者
        subject.setMessage("《大圣传》更新第666章：妖魔");
        subject.notifyObservers();
    }
}
