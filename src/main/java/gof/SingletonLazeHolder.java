package gof;

public class SingletonLazeHolder {
    private static class InstanceHolder{
        public static SingletonLazeHolder instance = new SingletonLazeHolder();
    }

    private SingletonLazeHolder() {
        super();
    }
    public static SingletonLazeHolder getInstance() {
        return  InstanceHolder.instance;
    }
}
