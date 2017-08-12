 import java.io.*;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
 public class notepad extends JFrame implements ActionListener {
 	 JFileChooser fc = new JFileChooser();
 	 JTextArea dat;
 	 JMenuBar menu = new JMenuBar();
         JMenu file, edit, format, font, bg, fg, help;
 	 JMenuItem nu, open, save, saveas, exit, copy, paste, clear, print, printpreview, about, b8, b14, b18, b25, b30, bb, br, bge, fb, fr, fge;
 	
 	
 	
 	public notepad() {
 		setLocation(200, 200);
 		setTitle("notepad 1.00");
 		setSize(new Dimension(500, 500));
 		setDefaultCloseOperation(EXIT_ON_CLOSE);
 		
 		file = new JMenu("File");
 		menu.add(file);
 		
 		nu = new JMenuItem("new");
 		file.add(nu);
 		nu.addActionListener(this);
 		
 		open = new JMenuItem("open");
 		file.add(open);
 		open.addActionListener(this);
 		
 		save = new JMenuItem("save");
 		file.add(save);
 		save.addActionListener(this);
 		
 		saveas = new JMenuItem("save as");
 		file.add(saveas);
 		saveas.addActionListener(this);
 		
 		file.add(new JSeparator());
 		
 		print = new JMenuItem("print");
 		file.add(print);
 		print.addActionListener(this);
 		
 		printpreview = new JMenuItem("print preview");
 		file.add(printpreview);
 		printpreview.addActionListener(this);
 		
 		exit = new JMenuItem("exit");
 		file.add(exit);
 		exit.addActionListener(this);
 		
 		edit = new JMenu("Edit");
 		menu.add(edit);
 		
 		format = new JMenu("Format");
 		menu.add(format);
 		
 		help = new JMenu("Help");
 		menu.add(help);
 		
 		copy = new JMenuItem("copy");
 		edit.add(copy);
 		copy.addActionListener(this);
 		
 		paste = new JMenuItem("paste");
 		edit.add(paste);
 		paste.addActionListener(this);
 		
 		clear = new JMenuItem("clear");
 		edit.add(clear);
 		clear.addActionListener(this);
 		
 		font = new JMenu("font");
 		format.add(font);
 		font.addActionListener(this);
 		
 		b8 = new JMenuItem("8");
 		font.add(b8);
 		b8.addActionListener(this);
 		
 		b14 = new JMenuItem("14");
 		font.add(b14);
 		b14.addActionListener(this);
 		
 		b18 = new JMenuItem("18");
 		font.add(b18);
 		b18.addActionListener(this);
 		
 		b25 = new JMenuItem("25");
 		font.add(b25);
 		b25.addActionListener(this);
 		
 		b30 = new JMenuItem("30");
 		font.add(b25);
 		b25.addActionListener(this);
 		
 		bg = new JMenu("Background Color");
 		format.add(bg);
 		
 		bb = new JMenuItem("Blue");
 		bb.addActionListener(this);
 		bg.add(bb);
 		
 		br = new JMenuItem("Red");
 		br.addActionListener(this);
 		bg.add(br);
 		
 		bge = new JMenuItem("Green");
 		bge.addActionListener(this);
 		bg.add(bge);
 		
 		fg = new JMenu("Foreground Color");
 		format.add(fg);
 		
 		fb = new JMenuItem("Blue");
 		fb.addActionListener(this);
 		fg.add(fb);
 		
 		fr = new JMenuItem("Red");
 		fr.addActionListener(this);
 		fg.add(fr);
 		
 		fge = new JMenuItem("Green");
 		fge.addActionListener(this);
 		fg.add(fge);
 		
 		about = new JMenuItem("about");
 		help.add(about);
 		about.addActionListener(this);
 		
 		dat = new JTextArea(8, 8);
 		
 		JPanel spane = new JPanel(new GridLayout(0, 1));
 		spane.add(dat);
 		
 		JScrollPane sp = new JScrollPane(spane);
 		
 		JPanel mpane = new JPanel(new GridLayout(0, 1));
 		getContentPane().add(sp);
 		setJMenuBar(menu);
 	}
 	public void actionPerformed(ActionEvent e) {
 		if (e.getSource() == nu) {
 			int nuask = JOptionPane.showConfirmDialog(notepad.this,"Are you sure? This will make a erease any unsaved documents!");
 			if (nuask == JOptionPane.YES_OPTION) {
 				dat.setText("");
 			}
 		}
 		if (e.getSource() == open) {
 			
 		}
 		if (e.getSource() == save) {
 			}
 		if (e.getSource() == saveas) {
 			
 		}
 		if (e.getSource() == exit) {
 			int aske = JOptionPane.showConfirmDialog(notepad.this,"Are you sure you want to exit " +getTitle() + " ?");
 			if (aske == JOptionPane.YES_OPTION) {
 				System.exit(0);
 			}
 		}
 		
 		if (e.getSource() == copy) {
 			dat.copy();
 		}
 		if (e.getSource() == paste) {
 			dat.paste();
 		}
 		if (e.getSource() == clear) {
 			int cask = JOptionPane.showConfirmDialog(notepad.this,"Are you sure you want to clear the document?");
 			if (cask == JOptionPane.YES_OPTION) {
 				dat.setText("");
 				setTitle("notepad 1.00");
 			}
 		}
 		if (e.getSource() == b8) {
 		         Font tr = new Font("TimesRoman", Font.PLAIN, 8);
                         dat.setFont(tr);             	
 		}
 		if (e.getSource() == b14) {
 			dat.setFont(new Font("Helvetica", Font.BOLD,14));
 		}
 		if (e.getSource() == b18) {
 			dat.setFont(new Font("Courier", Font.ITALIC,18));
 		}
 		if (e.getSource() == b25) {
 			dat.setFont(new Font(Dialog", Font.BOLD+Font.ITALIC,25));
 		}
 		if (e.getSource() == b30) {
 			dat.setFont(new Font(dat.getFont().getName(),dat.getFont().getStyle(),30));
 		}
 		if (e.getSource() == about) {
 			JOptionPane.showMessageDialog(null, "Created by YASH TRIVEDI and PARAG badala" );	}
 		if (e.getSource() == bb) {
 			dat.setBackground(Color.BLUE);
 		}
 		if (e.getSource() == br) {
 			dat.setBackground(Color.RED);
 		}
 		if (e.getSource() == bge) {
 			dat.setBackground(Color.GREEN);
 		}
 		if (e.getSource() == fb) {
 			dat.setForeground(Color.BLUE);
 		}
 		if (e.getSource() == fr) {
 			dat.setForeground(Color.RED);
 		}
 		if (e.getSource() == fge) {
 			dat.setForeground(Color.GREEN);
 		}
 	}
 	public static void main (String args[]) {
 		new notepad().setVisible(true);
 	}
 }