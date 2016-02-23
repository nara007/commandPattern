package my.backend;

import javax.swing.*;

/**
 * Created by nara007 on 16/2/23.
 */

public class BoldCommand extends AbstractCommand {

  public BoldCommand(Receiver receiver, CommandManager commandManager) {
    super(receiver, commandManager);
    this.name = "my.backend.BoldCommand";
  }

  @Override
  public void execute() {

    this.receiver.setBold();
  }

  @Override
  public void unexecute() {

    this.receiver.setNoBold();
  }
}
