package version1.gameUtil.widgets.buttons;

import version1.gameUtil.listeners.interfaces.LoginBListenerIF;

import java.awt.event.ActionListener;

public class MazeRegisterButton extends MazeButton{
    private LoginBListenerIF mediator;
    public MazeRegisterButton(String label, ActionListener listener) {
        super(label, listener);
    }

}
