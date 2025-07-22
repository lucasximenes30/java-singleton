package gof;

public class SingletonLazeHolder {
    private static SingletonLazeHolder instance;

    private SingletonLazeHolder() {
        super();
    }
    public static SingletonLazeHolder getInstance() {
        return  instance;
    }
}
