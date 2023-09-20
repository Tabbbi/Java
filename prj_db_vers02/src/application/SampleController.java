package application;

import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;

public class SampleController {
	@SuppressWarnings("rawtypes")
	@FXML private TableView tblData;

	@SuppressWarnings("rawtypes")
	private ObservableList data;
    
	public void getTablecontent() throws SQLException {
		fetColumnList();
		fetRowList();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void fetColumnList() throws SQLException {
        try {
            ResultSet rs = Database.query("SELECT * FROM kunde;");
            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
            	if (i  == 1 || i == 2) {
            		final int j = i;
            		TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i + 1).toUpperCase());
            		col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
            			public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
            				return new SimpleStringProperty(param.getValue().get(j).toString());
            			}
            		});
            		col.setPrefWidth((tblData.getPrefWidth() / 2) - 9);
            		tblData.getColumns().removeAll(col);
            		tblData.getColumns().addAll(col);
//            		System.out.println("Column [" + i + "] ");
            	}
            }
        } catch (Exception e) {
//            System.out.println("Error " + e.getMessage());
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private void fetRowList() {
        data = FXCollections.observableArrayList();
        ResultSet rs;
        try {
            rs = Database.query("SELECT * FROM kunde;");
            while (rs.next()) {
                ObservableList row = FXCollections.observableArrayList();
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    row.add(rs.getString(i));
                }
//                System.out.println("Row [1] added " + row);
                data.add(row);
            }
            tblData.setItems(data);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

	public void addToTable() {
		
	}
}
