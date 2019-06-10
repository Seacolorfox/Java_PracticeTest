import javax.swing.*;

class JFramePad
{
    JFrame frame = new JFrame("Java NotePad");
    JTextField text = new JTextField();

    JMenu menuFile = new JMenu("文件");
    JMenuBar menuBar = new JMenuBar();
    JMenuItem newItem = new JMenuItem("新建");
    JMenuItem openItem = new JMenuItem("打开");
    JMenuItem saveItem = new JMenuItem("保存");
    JMenuItem closeItem = new JMenuItem("关闭");
    public JFramePad()
    {
       // text.setEditable(true);

        menuBar.add(menuFile);
        menuFile.add(newItem);
        menuFile.add(openItem);
        menuFile.add(saveItem);
        menuFile.add(closeItem);
        // frame.add(menuFile);
        frame.setJMenuBar(menuBar);  //使用setJmenubar()方法
        frame.add(text);

        frame.setSize(300,180);
       // frame.setLocation(300,200);
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
