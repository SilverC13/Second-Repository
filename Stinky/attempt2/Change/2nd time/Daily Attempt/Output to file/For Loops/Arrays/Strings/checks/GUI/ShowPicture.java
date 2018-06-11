import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class ShowPicture
{
	public static void main (String args[])
	{
		new MyFrame();
	}	
}
class MyFrame extends JFrame
{
	MyFrame()
	{
		ImageIcon icon = new ImageIcon("Iron-Man.png");
		JLabel label = new JLabel(icon);
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}
