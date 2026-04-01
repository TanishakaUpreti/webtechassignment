package bound;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class BoundPerson {
    private String name;
    private PropertyChangeSupport support;

    public BoundPerson() {
        support = new PropertyChangeSupport(this);
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        support.firePropertyChange("name", oldName, name);
    }

    public String getName() {
        return name;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}