package 行为型模式.观察者模式;

import java.util.LinkedList;
import java.util.List;

/**
 * @author chenzhuo
 * @version 1.0.0
 * @description: 小说的主题
 * @create: 2021-10-27 16:39
 */
public class NovelSubject extends Subject{
    private String message;
    private List<Observer> observers = new LinkedList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
