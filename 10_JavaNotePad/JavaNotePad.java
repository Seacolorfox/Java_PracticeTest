import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

class JFramePad
{
    private JFrame frame = new JFrame("Java NotePad");
    private JTextArea text = new JTextArea();

    private JMenu menuFile = new JMenu("文件");
    private JMenuBar menuBar = new JMenuBar();
    private JMenuItem newItem = new JMenuItem("新建");
    private JMenuItem openItem = new JMenuItem("打开");
    private JMenuItem saveItem = new JMenuItem("保存");
    private JMenuItem closeItem = new JMenuItem("关闭");

    private String openName;

    public JFramePad()
    {
       // text.setEditable(true);

        menuBar.add(menuFile);
        menuFile.add(newItem);
        menuFile.add(openItem);
        menuFile.add(saveItem);
        menuFile.addSeparator();
        menuFile.add(closeItem);
        // frame.add(menuFile);
        JFileChooser chooser = new JFileChooser();   //若将该方法写入监听类中 会出现卡顿的情况？？ （写此处则没有出现）
        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = null;
                int result = 0;
                if(e.getActionCommand().equals("新建"))
                {
                    if(text.getText()!=null||!text.getText().equals(""))
                    {
                        System.out.println("不为空/保存");
                        result = chooser.showSaveDialog(frame);
                        if(result == JFileChooser.APPROVE_OPTION)
                        {
                            file = chooser.getSelectedFile();
                        }
                        else
                        if(result == JFileChooser.CANCEL_OPTION)
                        {
                            //弹框
                        }
                        if(file != null)
                        {
                            try
                            {
                                PrintStream out = new PrintStream(new FileOutputStream(file));
                                out.print(text.getText());
                                out.close();
                            }catch (Exception ex)
                            {
                                System.out.println("ERROR");
                            }
                        }
                        text.setText("");
                    }
                }
            }
        });

        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = null;
                int result = 0;

                if(e.getActionCommand().equals("打开"))
                {
                    chooser.setApproveButtonText("确定");
                    chooser.setDialogTitle("打开");
                    result = chooser.showOpenDialog(frame);
                    if(result == JFileChooser.APPROVE_OPTION)
                    {
                        file = chooser.getSelectedFile();
                    }
                    else
                        if(result == JFileChooser.CANCEL_OPTION)
                        {
                            //弹框
                        }
                     if(file != null)
                     {
                         try{
                             Scanner scan = new Scanner(new FileInputStream(file));
                             scan.useDelimiter("\n");        //读取文件中换行
                             while (scan.hasNext())
                             {
                                 text.append(scan.next());
                                 text.append("\n");         //设置换行行为
                             }
                             scan.close();
                         }catch (Exception ex)
                         {
                             System.out.println("ERROR");
                         }

                     }
                }
            }
        });

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = null;
                int result = 0;
                if(e.getActionCommand().equals("保存"))
                {
                    result = chooser.showSaveDialog(frame);
                    if(result == JFileChooser.APPROVE_OPTION)
                    {
                        file = chooser.getSelectedFile();
                    }
                    else
                        if(result == JFileChooser.CANCEL_OPTION)
                        {
                            //弹框
                        }
                     if(file != null)
                     {
                         try
                         {
                             PrintStream out = new PrintStream(new FileOutputStream(file));
                                out.print(text.getText());
                                out.close();
                         }catch (Exception ex)
                         {
                             System.out.println("ERROR");
                         }
                     }
                }
            }
        });
//        openItem.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(e.getActionCommand().equals("打开"))
//                {
//                    Frame chooser = new Frame();
//                    FileDialog fd = new FileDialog(chooser,"打开文件",FileDialog.LOAD);
//                    fd.setVisible(true);
//
//                        String filePath = fd.getDirectory();
//                        String fileName = fd.getFile();
//                        openName =fileName;
//                }
//            }
//        });

        closeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        frame.setJMenuBar(menuBar);  //使用setJmenubar()方法
        frame.add(text);

        frame.setSize(670,520);
        frame.setLocation(300,200);
        frame.setVisible(true);
    }

}
public class JavaNotePad
{
    public static void main(String args[])
    {
       new JFramePad();
    }
}
