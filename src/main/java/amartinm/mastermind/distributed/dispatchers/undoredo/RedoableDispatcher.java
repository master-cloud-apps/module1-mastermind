package amartinm.mastermind.distributed.dispatchers.undoredo;

import amartinm.mastermind.controllers.PlayController;
import amartinm.mastermind.distributed.dispatchers.Dispatcher;

public class RedoableDispatcher extends Dispatcher {

    public RedoableDispatcher(PlayController playController) {
        super(playController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((PlayController) this.acceptorController).redoable());
    }

}
