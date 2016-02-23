package my.ui;

import my.backend.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nara007 on 16/2/22.
 */
public class Editor {

  static private Editor editorInstance;
  static public CommandManager commandManager;

  static {
    editorInstance = new Editor();
    commandManager = new CommandManager();
  }

  public static Editor getEditorInstance() {

    return editorInstance;
  }

  private JFrame jf;
  private JButton button1;
  private JButton button2;
  private JButton button3;
  private JButton button4;
  private JButton button5;



  private JTextPane jTextPane;

  private Editor() {

    this.jf = new JFrame("CommandPattern");

    Container c = jf.getContentPane();

    c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

    this.jTextPane = new JTextPane();
    // jta.setTabSize(4);
    // jta.setFont(new Font("标楷体", Font.BOLD, 16));
    // jta.setLineWrap(true);// 激活自动换行功能
    // jTextPane.setWrapStyleWord(true);// 激活断行不断字功能

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

    this.button1 = new JButton("斜体");
    this.button2 = new JButton("加粗");
    this.button3 = new JButton("下划线");
    this.button4 = new JButton("撤销");
    this.button5 = new JButton("重做");

    buttonPanel.add(button1);
    buttonPanel.add(button2);
    buttonPanel.add(button3);
    buttonPanel.add(button4);
    buttonPanel.add(button5);


    jf.add(jTextPane);
    jf.add(buttonPanel);
    jf.setSize(600, 600); // 设置主窗体大小
    jf.setLocationRelativeTo(null);
    jf.setVisible(true);
    jf.getContentPane().setBackground(new Color(222, 237, 250));
    jf.setResizable(false);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体关闭时，退出程序

    initListeners(this.jTextPane);
  }

  private void initListeners(final JTextPane pane) {
    this.button1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Command command = new ItalicCommand(new Receiver(pane), commandManager);
        command.execute();
        commandManager.pushOneCommandToUndoStack(command);
      }
    });


    this.button2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Command command = new BoldCommand(new Receiver(pane), commandManager);
        command.execute();
        commandManager.pushOneCommandToUndoStack(command);
      }
    });

    this.button3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Command command = new UnderLineCommand(new Receiver(pane), commandManager);
        command.execute();
        commandManager.pushOneCommandToUndoStack(command);
      }
    });

    this.button4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        commandManager.undo();
      }
    });

    this.button5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        commandManager.redo();
      }
    });

  }

  public static void main(String[] args) {

    Editor.getEditorInstance();
  }
}
