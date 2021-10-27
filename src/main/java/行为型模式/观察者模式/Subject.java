package 行为型模式.观察者模式;

/**
 * @author chenzhuo
 * @version 1.0.0
 * @description: 抽象主题
 * @create: 2021-10-27 16:36
 */

public abstract class Subject {


    /**
     * 添加观察者
     * @param observer 观察者
     */
    public abstract void addObserver(Observer observer);


    /**
     * 删除观察者
     * @param observer 观察者
     */
    public abstract void delObserver(Observer observer);


    /**
     * 通知所有观察者
     */
    public abstract void notifyObservers();
}
