package Observer;

import java.util.Observable;
import java.util.Observer;

public class Observable21 extends Observable {

    public void regObserver(Observer o){
        addObserver(o);
    }

    public void changeOutput(String output){
        setChanged();
        notifyObservers(output);
    }
}
