package quote;

import java.util.HashMap;
import java.io.File;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI implements ActionListener {

    Quotation msg;
    final HashMap<String, Quotation> Q = new HashMap<>();
    final JFrame frm = new JFrame("Famous Quotations");
    final JLabel who = new JLabel("Rene Descartes", SwingConstants.CENTER);
    final JTextArea txt = new JTextArea("Cognito ergo sum.");
    final JTextField ref = new JTextField("http://www.brainyquote.com/quotes/authors/a/rene_descartes.html");
    final JButton tmt = new JButton("NEXT");
    final JButton tmz = new JButton("BACK");
    final JComboBox<String> menu;

    static final int 
        RESOLUTION = Toolkit.getDefaultToolkit().getScreenResolution(); 
    static final float 
        RES_RATIO = RESOLUTION/96f;  //default resolution is 96
    static final int GAP = scaled(10); //uses RES_RATIO
    static final String PACKAGE = "quote";
    static final Color COLOR = Color.lightGray;
    static final Font SMALL = new Font("Arial", 0, scaled(13));
    static final Font BOLD = new Font("Tahoma", 1, scaled(16));
    static final Font LARGE = new Font("Serif", 2, scaled(16));
    
    public GUI() {
        String[] keys = { "EnesAytekin" };
        if (tryDir(".") || tryDir("BLM305") || tryDir("CSE470")) 
            keys = Q.keySet().toArray(keys);
        menu = new JComboBox<String>(keys);
        if (Q.size() > 0) setMessage(0);
        
        JPanel pan = new JPanel();
        pan.setLayout(new BorderLayout(GAP, GAP-4));
        pan.setBorder(new javax.swing.border.EmptyBorder(GAP, GAP, GAP, GAP));
        pan.setBackground(COLOR);
<<<<<<< HEAD
<<<<<<< HEAD

        pan.add(topPanel(), "South");
=======
        
        pan.add(topPanel(), "North");
>>>>>>> refs/remotes/origin/master
=======
        
        pan.add(topPanel(), "North");
=======

        pan.add(topPanel(), "South");
>>>>>>> refs/remotes/SmallSimpleSafe/master
>>>>>>> refs/remotes/origin/master

        txt.setFont(LARGE);
        txt.setEditable(false);
        txt.setRows(5);
        txt.setColumns(30);
        txt.setWrapStyleWord(true);
        txt.setLineWrap(true);
        txt.setDragEnabled(true);
        pan.add(new JScrollPane(txt), "Center");
        
        
        
        ref.setFont(SMALL);
        ref.setEditable(false);
        ref.setColumns(35);
        ref.setDragEnabled(true);
<<<<<<< HEAD
<<<<<<< HEAD
        pan.add(ref, "North");

=======
=======
>>>>>>> refs/remotes/origin/master
        pan.add(ref, "South");
        
        pan.add(tmt, "East");
        pan.add(tmz, "West");
       
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/master
=======
=======
        pan.add(ref, "North");

>>>>>>> refs/remotes/SmallSimpleSafe/master
>>>>>>> refs/remotes/origin/master
        pan.setToolTipText("A project realized collectively by the class");
        menu.setToolTipText("Quotation classes");
        who.setToolTipText("author()+year()");
        txt.setToolTipText("text()");
        ref.setToolTipText("reference()");

        frm.setContentPane(pan); 
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm.setLocation(scaled(120), scaled(90));
        frm.pack(); 
        frm.setVisible(true);
    }
    JPanel topPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));
        top.setBackground(COLOR);
        
        //menu.setFont(BOLD);
        menu.addActionListener(this);
        top.add(menu);
        
        top.add(Box.createHorizontalStrut(scaled(50)));
        top.add(Box.createHorizontalGlue());
        
        who.setFont(BOLD);
        who.setForeground(Color.cyan);
        top.add(who);
        
        return top;
    }
    boolean tryDir(String d) {
        ClassLoader L = getClass().getClassLoader();
        File p = new File(d, PACKAGE);
        System.out.println("Try "+p);
        if (!p.exists() || !p.isDirectory()) return false;
        for (File f : p.listFiles()) {
            String s = f.getName();
            if (!s.endsWith(".class")) continue;
            String name = s.substring(0, s.length()-6);
            try {
                Class<?> c = L.loadClass(PACKAGE+"."+name);
                if (!Quotation.class.isAssignableFrom(c)) continue;
                Q.put(name, (Quotation)c.newInstance());
                System.out.println("  "+name);
            //ClassNotFoundException InstantiationException IllegalAccessException
            } catch(Exception e) { 
                continue;
            }
        }
        return Q.size() > 0;
    }
    public String toString() { return who.getText(); }
    public String message() { return msg.text(); }
    public void setMessage(Quotation q) {
        msg = q; 
        who.setText(q.author()+" "+q.year()); 
        txt.setText(q.text()); 
        ref.setText(q.reference()); 
    }
    public void setMessage(int i) {
        String m = menu.getItemAt(i);
        System.out.println(m);
        setMessage(Q.get(m));
    }
    public void actionPerformed(ActionEvent e) {
        setMessage(menu.getSelectedIndex());
    }

    public static int scaled(int k) { return Math.round(k*RES_RATIO); }
    public static void main(String[] args) { new GUI(); }
}
