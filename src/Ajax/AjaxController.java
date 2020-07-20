package Ajax;

import javax.swing.*;

public class AjaxController {

    private AjaxLoadingPanel loadingPanel;

    public AjaxController(JFrame mainFrame) {
        loadingPanel = new AjaxLoadingPanel(mainFrame);
    }

    public void showPanel() {
        loadingPanel.setVisible(true);
    }

    public void disposePanel() {
        loadingPanel.dispose();
    }


}
