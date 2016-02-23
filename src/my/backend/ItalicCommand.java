package my.backend;

/**
 * Created by nara007 on 16/2/23.
 */
public class ItalicCommand extends AbstractCommand{

  public ItalicCommand(Receiver receiver, CommandManager commandManager) {
    super(receiver, commandManager);
    this.name = "my.backend.ItalicCommand";
  }

  @Override
  public void execute() {
    this.receiver.setItalic();
  }

  @Override
  public void unexecute() {
    this.receiver.setNoItalic();
  }
}
