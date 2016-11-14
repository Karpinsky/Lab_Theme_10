package observation.implemented;

import observation.Observable;
import observation.Observer;

public class CactusSupplierObserver extends Observer
{
    public CactusSupplierObserver(Observable subject)
    {
        this.subject = subject;
    }

    @Override
    public void update() {

    }
}
