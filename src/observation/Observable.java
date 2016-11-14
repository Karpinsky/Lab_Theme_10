package observation;

public class Observable
{
    private boolean state;

    public Observable(boolean state)
    {
        this.state = state;
    }

    public boolean getState()
    {
        return this.state;
    }

    public void setState(boolean newState)
    {
        this.state = newState;
    }

    public void attach()
    {
        return;
    }

    public void notifyAllObservers()
    {
        return;
    }
}
