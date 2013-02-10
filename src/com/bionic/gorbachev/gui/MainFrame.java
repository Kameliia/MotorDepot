package com.bionic.gorbachev.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;

import com.bionic.gorbachev.dao.EmployeesDAO;
import javax.swing.JScrollPane;

//Main frame
@SuppressWarnings({"serial"})

public class MainFrame extends JFrame {
	private static EmployeesDAO emplDAO = new EmployeesDAO();
	
	private JPanel contentPane;
	private JTable tableEmployers;


	/**
	 * Create the main frame.
	 */
	
	public MainFrame() {
		initComponents();
	}
	
	//Initialize main frame and components
	private void initComponents(){
		setTitle("Work sheduler");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, 500, 400);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employees:");
		lblNewLabel.setBounds(10, 11, 73, 14);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 29, 462, 92);
		panel.add(scrollPane);
		
		tableEmployers = new JTable();
		scrollPane.setViewportView(tableEmployers);
		//Sets table model from EmployeesDAO
		tableEmployers.setModel(emplDAO.getTableModel());
		tableEmployers.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tableEmployers.getColumnModel().getColumn(1).setPreferredWidth(150);
		tableEmployers.getColumnModel().getColumn(2).setPreferredWidth(100);
		tableEmployers.getColumnModel().getColumn(2).setMinWidth(0);
		tableEmployers.getColumnModel().getColumn(3).setPreferredWidth(150);
		//Show the main frame
		setVisible(true);		
	}
}
