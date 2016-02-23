package my.backend;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

/**
 * Created by nara007 on 16/2/23.
 */
public class Receiver {
  private JTextPane pane;

  public Receiver(JTextPane pane) {
    this.pane = pane;
  }

  public void setItalic() {

    SimpleAttributeSet attr = new SimpleAttributeSet();
    StyleConstants.setItalic(attr, true);
    this.pane.getStyledDocument().setCharacterAttributes(0, pane.getText().length(), attr, false);
  }

  public void setNoItalic() {
    SimpleAttributeSet attr = new SimpleAttributeSet();
    StyleConstants.setItalic(attr, false);
    this.pane.getStyledDocument().setCharacterAttributes(0, pane.getText().length(), attr, false);

  }

  public void setBold() {
    SimpleAttributeSet attr = new SimpleAttributeSet();
    StyleConstants.setBold(attr, true);
    this.pane.getStyledDocument().setCharacterAttributes(0, pane.getText().length(), attr, false);
  }

  public void setNoBold() {
    SimpleAttributeSet attr = new SimpleAttributeSet();
    StyleConstants.setBold(attr, false);
    this.pane.getStyledDocument().setCharacterAttributes(0, pane.getText().length(), attr, false);
  }

  public void setUnderLine() {
    SimpleAttributeSet attr = new SimpleAttributeSet();
    StyleConstants.setUnderline(attr, true);
    this.pane.getStyledDocument().setCharacterAttributes(0, pane.getText().length(), attr, false);
  }

  public void setNoUnderLine() {
    SimpleAttributeSet attr = new SimpleAttributeSet();
    StyleConstants.setUnderline(attr, false);
    this.pane.getStyledDocument().setCharacterAttributes(0, pane.getText().length(), attr, false);
  }

}
