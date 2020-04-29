package firma.swing;

import firma.biz.Company;
import firma.biz.CompanyBuilder;
import firma.biz.Department;
import firma.biz.Person;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CompanyForm {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane;
    private JLabel companyName;
    private JList<Department> departmentList;
    private JList<Person> personList;
    private JLabel personSName;
    private JLabel personName;

    private Company company;
    private Department activeDepartment;
    private Person activePerson;

    public void initElement(Company company){
        this.company = company;
        activeDepartment = company.getDepartments().get(0);
        activePerson = activeDepartment.getPersons().get(0);
        departmentList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = e.getFirstIndex();
                System.out.println("D "+index);
                activeDepartment = company.getDepartments().get(index);
                fillDepatrmentPane();
                tabbedPane.setSelectedIndex(1);
            }
        });
        personList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = e.getLastIndex();
                System.out.println("P "+index);
                activePerson = activeDepartment.getPersons().get(index);
                fillPersonPane();
                tabbedPane.setSelectedIndex(2);
            }
        });
        fillCompanyPane();
        fillDepatrmentPane();
    }

    private void fillPersonPane() {
        personName.setText(activePerson.getName());
        personSName.setText(activePerson.getSurname());
    }

    private void fillCompanyPane(){
        companyName.setText(company.getName());
        DefaultListModel<Department> lmodel = new DefaultListModel<>();
        lmodel.addAll(company.getDepartments());
        departmentList.setModel(lmodel);
    }

    private void fillDepatrmentPane(){
        DefaultListModel<Person> lmodel = new DefaultListModel<>();
        lmodel.addAll(activeDepartment.getPersons());
        personList.setModel(lmodel);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CompanyForm");
        CompanyForm companyForm = new CompanyForm();
        frame.setContentPane(companyForm.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CompanyBuilder builder = new CompanyBuilder();
        Company company = builder.getTestCompany();
        companyForm.initElement(company);
        frame.pack();
        frame.setVisible(true);
    }
}
