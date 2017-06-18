package axoloti.displayviews;

import axoloti.displays.DisplayInstanceController;
import components.displays.VBarComponent;
import java.beans.PropertyChangeEvent;

class DisplayInstanceViewFrac32VBar extends DisplayInstanceViewFrac32 {

    private VBarComponent vbar;

    DisplayInstanceViewFrac32VBar(DisplayInstanceController controller) {
        super(controller);
    }

    @Override
    void PostConstructor() {
        super.PostConstructor();

        vbar = new VBarComponent(0, 0, 64);
        vbar.setValue(0);
        add(vbar);
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {
        super.modelPropertyChange(evt);
        if (evt.getPropertyName().equals(DisplayInstanceController.DISP_VALUE)) {
            vbar.setValue((Double) evt.getNewValue());
        }
    }
}
