package observation;

public abstract class Observer
{
    protected Observable subject;

    public abstract void update();
}
