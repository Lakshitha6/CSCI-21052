import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton submitBtn , resetBtn;
    JPanel mainPanel, detailPanel, btnPanel , inputPanel, outputPanel , namePanel, mobilePanel, genderPanel, dobPanel, adrPanel,checkPanel, errorPanel;
    JLabel title , nameLabel, numberLabel , genderLabel , dobLable , addressLabel, errorLable, namLbl, numbLbl, genLbl, bdLbl, addrLbl;
    JTextField nameField, numberField;
    JTextArea textArea;
    ButtonGroup radioBtnGrp ;
    JRadioButton maleBtn, femaleBtn ;
    JComboBox dateComboBox , monthComboBox , yearComboBox;
    JCheckBox checkBox;

    MyFrame(){

        nameField = new JTextField(20);
        numberField = new JTextField(20);
        textArea = new JTextArea(5,100);

        checkBox = new JCheckBox("Accept Terms And Conditions.");

        submitBtn = new JButton("Submit");
        resetBtn = new JButton("Reset");

        btnPanel = new JPanel();
        FlowLayout flowLayout = new FlowLayout();
        btnPanel.setLayout(flowLayout);
        flowLayout.setHgap(50);
        btnPanel.add(submitBtn);
        btnPanel.add(resetBtn);

        title = new JLabel("Registration Form");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Poppins",Font.PLAIN, 20));

        nameLabel = new JLabel("Name   ");
        numberLabel = new JLabel("Mobile ");
        genderLabel = new JLabel("Gender ");
        dobLable = new JLabel("DOB    ");
        addressLabel = new JLabel("Address");

        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");

        radioBtnGrp = new ButtonGroup();
        radioBtnGrp.add(maleBtn);
        radioBtnGrp.add(femaleBtn);

        String [] dates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        dateComboBox = new JComboBox<>(dates);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthComboBox = new JComboBox<>(months);

        String[] years = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000","2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011"};
        yearComboBox = new JComboBox<>(years);

        // Align input panel to the left
        inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Create panel for each input fields  -------------------------------------------
        namePanel = new JPanel(new FlowLayout());
        namePanel.add(nameLabel);
        namePanel.add(nameField);

        mobilePanel = new JPanel(new FlowLayout());
        mobilePanel.add(numberLabel);
        mobilePanel.add(numberField);

        genderPanel = new JPanel(new FlowLayout());
        genderPanel.add(genderLabel);
        genderPanel.add(maleBtn);
        genderPanel.add(femaleBtn);

        dobPanel = new JPanel(new FlowLayout());
        dobPanel.add(dobLable);
        dobPanel.add(dateComboBox);
        dobPanel.add(monthComboBox);
        dobPanel.add(yearComboBox);

        adrPanel = new JPanel(new FlowLayout());
        adrPanel.add(addressLabel);
        adrPanel.add(textArea);

        checkPanel = new JPanel(new FlowLayout());
        checkPanel.add(checkBox);

        errorPanel = new JPanel(new FlowLayout());
        errorLable = new JLabel();
        errorPanel.add(errorLable);

        // ---------------------------------------------------------------------------------

        // Add input fields as panels to the input field panel
        inputPanel.add(namePanel);
        inputPanel.add(mobilePanel);
        inputPanel.add(genderPanel);
        inputPanel.add(dobPanel);
        inputPanel.add(adrPanel);
        inputPanel.add(checkPanel);
        inputPanel.add(errorPanel);

        // ---------------------------------------------------------------------------------

        outputPanel = new JPanel();
        outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.Y_AXIS));
        outputPanel.setBackground(Color.cyan);

        // Add output details to the output panel --------------------------------
        namLbl = new JLabel("",SwingConstants.LEFT);
        namLbl.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));

        numbLbl = new JLabel("",SwingConstants.LEFT);
        numbLbl.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));

        genLbl = new JLabel("",SwingConstants.LEFT);
        genLbl.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));

        bdLbl = new JLabel("",SwingConstants.LEFT);
        bdLbl.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));

        addrLbl = new JLabel("",SwingConstants.LEFT);
        addrLbl.setBorder(BorderFactory.createEmptyBorder(10,0,10,0));

        outputPanel.add(namLbl);
        outputPanel.add(numbLbl);
        outputPanel.add(genLbl);
        outputPanel.add(bdLbl);
        outputPanel.add(addrLbl);

        //---------------------------------------------------------------------------------------------

        detailPanel  = new JPanel();
        GridLayout grd = new GridLayout(1,2);
        detailPanel.setLayout(grd);
        grd.setHgap(10);
        grd.setVgap(5);
        detailPanel.add(inputPanel);
        detailPanel.add(outputPanel);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(title,BorderLayout.NORTH);
        mainPanel.add(detailPanel,BorderLayout.CENTER);
        mainPanel.add(btnPanel,BorderLayout.SOUTH);

        submitBtn.addActionListener(this);
        checkBox.addActionListener(this);
        resetBtn.addActionListener(this);
        this.add(mainPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()== submitBtn){
            if (!checkBox.isSelected()) {
                errorLable.setForeground(Color.red);
                errorLable.setText("Please Accept terms & conditions before submit");
            }
            else {
                String selectedGender = "Female";
                if (maleBtn.isSelected())
                    selectedGender = maleBtn.getText();

                namLbl.setText("Name: " + nameField.getText());
                numbLbl.setText("Phone Number: " + numberField.getText());
                genLbl.setText("Gender: "  + selectedGender);
                bdLbl.setText("Birth Date: " + dateComboBox.getSelectedItem() + " / " + monthComboBox.getSelectedItem() + " / " + yearComboBox.getSelectedItem());
                addrLbl.setText("Address: "+ textArea.getText());

                errorLable.setText("Registration Successfully");
                errorLable.setForeground(Color.GREEN);
            }

        }

        if (e.getSource()== resetBtn){
            nameField.setText("");
            numberField.setText("");
            radioBtnGrp.clearSelection();
            dateComboBox.setSelectedItem("1");
            monthComboBox.setSelectedItem("Jan");
            yearComboBox.setSelectedItem("1990");
            textArea.setText("");
            checkBox.setSelected(false);
            namLbl.setText("");
            numbLbl.setText("");
            genLbl.setText("");
            bdLbl.setText("");
            addrLbl.setText("");
            errorLable.setText("");
        }

    }
}