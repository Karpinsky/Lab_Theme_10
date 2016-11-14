package observation.implemented;

import observation.Observable;
import observation.Observer;

public class RomashkaSupplierObserver extends Observer
{
    public RomashkaSupplierObserver(Observable subject)
    {
        this.subject = subject;
    }

    @Override
    public void update() {

    }
}
