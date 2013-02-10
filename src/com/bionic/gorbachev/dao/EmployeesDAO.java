package com.bionic.gorbachev.dao;

import javax.swing.table.DefaultTableModel;

@SuppressWarnings({"serial"})
public class EmployeesDAO {

	// Create table model
	public DefaultTableModel getTableModel() {
		return new DefaultTableModel(getDataArray(), 
				   new String[] { "Номер", "ФИО", "Телефон", "Доп. информация" }) {

			Class[] columnTypes = new Class[] { Integer.class, String.class,
					String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false,
					false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
	}

	// Get the data array
	private Object[][] getDataArray() {
		return new Object[][] { { null, null, null, null },
								{ null, null, null, null }, 
								{ null, null, null, null } };
	}
}
