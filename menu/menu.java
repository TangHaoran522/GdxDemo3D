package com.dh.ch11;
import javax.swing.*;

public class MenuDemo extends JFrame {
	private JPanel p;
	// Declare MenuBar
	private JMenuBar menuBar;
	// Declare Menu
	private JMenu menuFile, menuEdit, menuHelp, menuNew;
	// Declare Function in MenuBar
	private JMenuItem miSave, miExit, miCopy, miPost, miAbout, miC, miJava,miEmpty;
	public MenuDemo() {
		super("Menu");
		p = new JPanel();
		// Creating MenuBar
		menuBar = new JMenuBar();
		// Seating MenuBar at top
		this.setJMenuBar(menuBar);
		// Creating Menu
		menuLoadingfiles = new JMenu("Loading Files");
		menuLoadingdemos = new JMenu("Loading Demos");
		// Adding MenuBar at top
		menuBar.add(menuLoadingfiles);
		menuBar.add(menuLoadingdemos);
		menuFile.add(menuNew);
		menuFile.addSeparator();
		miLoadfile = new JMenuItem("Load Files");
		miLoaddemos = new JMenuItem("Load Demos");
		// 将菜单项添加到菜单中
		menuFile.add(miLoadfile);
		menuFile.add(miLoaddemos);
		this.add(p);
		this.setSize(300, 250);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MenuDemo f = new MenuDemo();
		f.setVisible(true);
	}
}
