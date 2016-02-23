package my.backend;

/**
 * Created by nara007 on 16/2/23.
 */
public abstract class AbstractCommand implements Command {

  protected Receiver receiver;
  protected String name;
  protected CommandManager commandManager;

  public AbstractCommand(Receiver receiver, CommandManager commandManager) {
    this.receiver = receiver;
    this.commandManager = commandManager;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
