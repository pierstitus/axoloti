package axoloti.displayviews;

import axoloti.displays.DisplayInstanceController;
import components.LabelComponent;
import java.beans.PropertyChangeEvent;

class DisplayInstanceViewInt32Label extends DisplayInstanceViewInt32 {

    private LabelComponent readout;

    DisplayInstanceViewInt32Label(DisplayInstanceController controller) {
        super(controller);
    }

    @Override
    void PostConstructor() {
        super.PostConstructor();

        readout = new LabelComponent("xxxxxx");
        add(readout);
        readout.setSize(80, 18);
    }

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {
        super.modelPropertyChange(evt);
        if (evt.getPropertyName().equals(DisplayInstanceController.DISP_VALUE)) {
            int i = (Integer) evt.getNewValue();
            readout.setText(":" + Integer.toString(i));
        }
    }
}
