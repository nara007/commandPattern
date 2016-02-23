package my.backend;

import java.util.Stack;

/**
 * Created by nara007 on 16/2/23.
 */
public class CommandManager {


  private Stack<Command> undoStack;
  private Stack<Command> redoStack;

  public CommandManager() {

    this.undoStack = new Stack<Command>();
    this.redoStack = new Stack<Command>();
  }

  public void pushOneCommandToUndoStack(Command command) {

    // boolean inStack = false;
    //
    // for (Command localCommand : this.undoStack) {
    // if (localCommand.toString().equals(command.toString())) {
    //
    // inStack = true;
    // break;
    // }
    // }
    //
    // if (!inStack) {
    // this.undoStack.push(command);
    // }

    this.undoStack.push(command);

  }

  public Command popOneCommandFromUndoStack() {

    if (!this.undoStack.empty()) {
      return this.undoStack.pop();
    } else {
      return null;
    }
  }


  public void pushOneCommandToRedoStack(Command command) {

    this.redoStack.push(command);
  }

  public Command popOneCommandFromRedoStack() {

    if (!this.redoStack.empty()) {
      return this.redoStack.pop();
    } else {
      return null;
    }
  }

  public void redo()
  {
    Command command=popOneCommandFromRedoStack();
    if(command!=null)
    {
      command.execute();
      pushOneCommandToUndoStack(command);
    }
  }
  public void undo()
  {
    Command command=popOneCommandFromUndoStack();
    if(command!=null)
    {
      pushOneCommandToRedoStack(command);
      command.unexecute();
    }
  }


}
