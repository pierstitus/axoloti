package axoloti.displayviews;

import axoloti.displays.DisplayInstanceController;
import components.displays.ScopeComponent;
import java.beans.PropertyChangeEvent;

class DisplayInstanceViewFrac32SChart extends DisplayInstanceViewFrac32 {

    private ScopeComponent scope;

    DisplayInstanceViewFrac32SChart(DisplayInstanceController controller) {
        super(controller);
    }

    @Override
    void PostConstructor() {
        super.PostConstructor();

        scope = new ScopeComponent(-64.0, 64.0);
        scope.setValue(0);
        add(scope);
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {
        super.modelPropertyChange(evt);
        if (evt.getPropertyName().equals(DisplayInstanceController.DISP_VALUE)) {
            scope.setValue((Double) evt.getNewValue());
        }
    }

}
