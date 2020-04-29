package firma.javafx;

import firma.biz.Company;
import firma.biz.CompanyBuilder;
import firma.biz.Department;
import firma.biz.Person;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainStage implements Initializable {

    private Company company;
    private Department activeDepartment;
    private Person activePerson;

    @FXML
    TabPane tabPane;
    @FXML
    ListView departmentList;
    @FXML
    ListView personList;
    @FXML
    Label personName;
    @FXML
    Label personSName;

    @FXML
    private void departmentSelected(MouseEvent e){
        activeDepartment =(Department) departmentList.getSelectionModel().getSelectedItem();
        refreshPersonList();
        tabPane.getSelectionModel().select(1);
    }
    @FXML
    private void personSelected(MouseEvent e){
        activePerson = (Person) personList.getSelectionModel().getSelectedItem();
        refreshPersonData();
        tabPane.getSelectionModel().select(2);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CompanyBuilder builder = new CompanyBuilder();
        company = builder.getTestCompany();
        activeDepartment = company.getDepartments().get(0);
        activePerson = activeDepartment.getPersons().get(0);
        refreshDepartmentList();
        refreshPersonList();
        refreshPersonData();
    }

    private void refreshPersonList(){
        ListProperty<Object> listProperty = new SimpleListProperty<>();
        personList.itemsProperty().bind(listProperty);
        listProperty.set(FXCollections.observableArrayList(activeDepartment.getPersons()));
    }

    private void refreshDepartmentList(){
        ListProperty<Object> listProperty = new SimpleListProperty<>();
        departmentList.itemsProperty().bind(listProperty);
        listProperty.set(FXCollections.observableArrayList(company.getDepartments()));
    }

    private void refreshPersonData(){
        personName.setText(activePerson.getName());
        personSName.setText(activePerson.getSurname());
    }

}
