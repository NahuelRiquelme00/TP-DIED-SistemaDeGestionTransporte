package interfaces.boletos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class CaminosTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = -5185375972274131388L;
	String[] columnNames = {"Camino","Distancia","Duraci�n","Costo"};
	List<List<Object>> data;
	
	public CaminosTableModel() {
		data = new ArrayList<List<Object>>();
	}
	
	@Override
	public int getRowCount() {
		return data.size();
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data.get(rowIndex).get(columnIndex);
	}
	
	public String getColumnName(int c) {
		return columnNames[c];
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
	
	public void setData(List<List<Object>> data) {
		this.data = data;
	}
	
	public boolean isCellEditable(int row, int col) {
		return false;
	}
	
	 public void setValueAt(Object value, int row, int col) {
	        data.get(row).set(col, value);
	        fireTableCellUpdated(row, col);
	 }

}
