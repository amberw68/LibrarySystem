package libraryview;

import javax.swing.table.DefaultTableModel;


public class MyTableModel extends DefaultTableModel {
	
	private static final long serialVersionUIT = 1L;
	
	public MyTableModel(String[][] data, String[] columns){
		super(data, columns);
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}
}
