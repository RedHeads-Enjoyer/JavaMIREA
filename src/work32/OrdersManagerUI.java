package work32;

import com.company.work31.Dish;
import com.company.work31.Order;
import com.company.work31.OrderManager;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrdersManagerUI extends JFrame {
    public String[] tableList = new String[]{
        "Table 1","Table 2","Table 3","Table 4","Table 5","Table 6","Table 7","Table 8","Table 9","Table 10"
    };
    public static int WIDTH_FRAME = 1000;
    public static int HEIGHT_FRAME = 600;
    private JPanel mainFrame = new JPanel(null);

    private OrderManager orderManager = new OrderManager();

    private JButton addBtn = Element.customButton("Добавить", 150,20);
    private JButton delBtn = Element.customButton("Удалить заказ по номеру стола", 210,20);
    private JLabel dishLabel = Element.customJlabel(
            "Dish",
            24,
            52,
            30
    );

    private JLabel nameLabel = Element.customJlabel(
            "Name",
            14,
            50,
            18
    );
    private JLabel descriptionLabel = Element.customJlabel(
            "Description",
            14,
            100,
            18
    );
    private JLabel costLabel = Element.customJlabel(
            "Cost",
            14,
            40,
            18
    );
    private JLabel tableLabel = Element.customJlabel(
            "Table",
            14,
            45,
            18
    );
    private JLabel labelNumberOfTable = Element.customJlabel(
            "NumberOfTable",
            14,
            140,
            20
    );
    private JLabel labelDish = Element.customJlabel(
            "Dishes",
            14,
            140,
            20
    );

    private JTextField nameTextField = Element.customJTextField();
    private JTextField descriptionTextField = Element.customJTextField();
    private JTextField costTextField = Element.customJTextField();
    private JTextField tableTextField = Element.customJTextField();
    private JLabel errorLabel = Element.customError("",220,155);

    private JScrollPane tableScroll;
    private JScrollPane dishScroll;

    private void event(){
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder stringBuilder = new StringBuilder();
                Dish dish = new Dish(
                        nameTextField.getText(),
                        descriptionTextField.getText()
                );
                if (costTextField.getText().length() != 0 && costTextField.getText().matches("[0-9]+(.[0-9]*)?")){
                    dish.setCost(
                            Double.parseDouble(costTextField.getText())
                    );
                }else{
                    stringBuilder.append("Не верная стоимость\n");
                }
                System.out.println(dish.getCost()+dish.getName()+dish.getDescription());
                if (tableTextField.getText().matches("[1-9]+")){
                    int tableNumber = Integer.parseInt(tableTextField.getText());
                    if (tableNumber>0 && tableNumber<=10){
                        orderManager.addDish(dish,tableNumber);
                    }
                    else{
                        stringBuilder.append("Не верный стол\n");
                    }
                }else{
                    stringBuilder.append("Не верный стол\n");
                }
                errorLabel.setText(stringBuilder.toString());
                if (stringBuilder.length()==0){
                    nameTextField.setText("");
                    descriptionTextField.setText("");
                    costTextField.setText("");
                    tableTextField.setText("");
                }
            }
        });

        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder stringBuilder = new StringBuilder();
                System.out.println(1);
                if (tableTextField.getText().matches("[1-9]+")){
                    int tableNumber = Integer.parseInt(tableTextField.getText());
                    if (tableNumber>0 && tableNumber<=10){
                        System.out.println(2);
                        orderManager.removeOrder(tableNumber);
                    }
                    else{
                        stringBuilder.append("Не верный стол\n");
                    }
                }else{
                    stringBuilder.append("Не верный стол\n");
                }
                errorLabel.setText(stringBuilder.toString());
            }
        });
    }

    private void tableView(){
        JList<String> list = new JList<String>(tableList);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Создание текстового поля
        JTextArea content = new JTextArea(5, 20);
        // Подключения слушателя
        list.addListSelectionListener(new listSelectionListener());
        // Подключение слушателя мыши
        list.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if ( e.getClickCount() == 2 ) {
                    // Получение элемента
                    int selected = list.locationToIndex(e.getPoint());
                    String txt = "";
                    if (orderManager.getOrders()[selected] == null){
                        content.setText ("Заказа нет");
                    }else {
                        Dish[] dishes1 = orderManager.getOrder(selected+1).getDishes();
                        for (int i=0; i<dishes1.length; i++){
                            txt+="Dish{ cost: "+dishes1[i].getCost()+", name: "+ dishes1[i].getName()+" desc: "+dishes1[i].getDescription()+"\n";
                        }
                        content.setText (txt);
                    }
                }
            }
        });
        tableScroll = new JScrollPane(list);
        dishScroll = new JScrollPane(content);
    }

    private void refresh(){

    }

    private void grid(){
        addBtn.setLocation(20,240);
        delBtn.setLocation(20,265);


        dishLabel.setLocation(60,17);
        nameLabel.setLocation(20,49);
        nameTextField.setLocation(20,67);
        descriptionLabel.setLocation(20,93);
        descriptionTextField.setLocation(20,110);
        costLabel.setLocation(20,137);
        costTextField.setLocation(20,154);
        tableLabel.setLocation(20,180);
        tableTextField.setLocation(20,197);

        errorLabel.setLocation(20,300);

        tableScroll.setLocation(285,56);
        tableScroll.setSize(140,400);

        dishScroll.setLocation(434,56);
        dishScroll.setSize(530,400);

        labelNumberOfTable.setLocation(285,36);
        labelDish.setLocation(434,36);
    }


    public OrdersManagerUI(){
        super("UI");

        tableView();
        grid();
        event();
        mainFrame.add(addBtn);
        mainFrame.add(delBtn);



        mainFrame.add(dishLabel);
        mainFrame.add(nameLabel);
        mainFrame.add(nameTextField);
        mainFrame.add(descriptionLabel);
        mainFrame.add(descriptionTextField);
        mainFrame.add(costLabel);
        mainFrame.add(costTextField);
        mainFrame.add(tableLabel);
        mainFrame.add(tableTextField);
        mainFrame.add(errorLabel);

        mainFrame.add(labelNumberOfTable);
        mainFrame.add(labelDish);


        mainFrame.add(dishScroll);
        mainFrame.add(tableScroll);
        getContentPane().add(mainFrame);



        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH_FRAME,HEIGHT_FRAME);
        setResizable(false);
        setVisible(true);
    }
}

class listSelectionListener implements ListSelectionListener {
    public void valueChanged(ListSelectionEvent e) {
        // Выделенная строка
        int selected = ((JList<?>)e.getSource()).
                getSelectedIndex();
    }
}
