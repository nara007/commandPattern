package my.backend;

/**
 * Created by nara007 on 16/2/23.
 */
public class UnderLineCommand extends AbstractCommand {


  public UnderLineCommand(Receiver receiver, CommandManager commandManager) {
    super(receiver, commandManager);
    this.name = "my.backend.UnderLineCommand";
  }

  @Override
  public void execute() {
    this.receiver.setUnderLine();
  }

  @Override
  public void unexecute() {

    this.receiver.setNoUnderLine();
  }
}
