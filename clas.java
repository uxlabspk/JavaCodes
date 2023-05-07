import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.*;

class clas
{
	private static BufferedReader br;

    public static void main(String[] args) 
	{
        JFrame f = new JFrame();
        f.setSize(500, 500);
        JTextArea t = new JTextArea();
        f.add(t);
        JFileChooser c = new JFileChooser();
        int r = c.showOpenDialog(null); 
        File fi = null;
        if( r == JFileChooser.APPROVE_OPTION)
        {
            fi = new File(c.getSelectedFile().getAbsolutePath()); 
        }
                try { 
					// String 
					String s1 = "", sl = ""; 

					// File reader 
					FileReader fr = new FileReader(fi); 

					br = new BufferedReader(fr); 

					sl = br.readLine(); 
					while ((s1 = br.readLine()) != null) { 
						sl = sl + "\n" + s1; 
					} 
					t.setText(sl); 
				} 
				catch (Exception evt) { 
					JOptionPane.showMessageDialog(f, evt.getMessage()); 
				} 
                //f.show();
                f.setVisible(true);
	}
}
