package Store;
//STUDENT NAME: Chia-Yu Liu
//STUDENT ID: 100698737
//STUDENT NAME: Keefer Belanger
//STUDENT ID: 101152085

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * This class will keep track the states of Store.StoreView
 */
public class StoreView {
    private JFrame main;
    private JFrame browse;
    private JFrame seeCart;
    private JFrame checkOut;

    private static StoreManager storeManager;
    private static int cartID;

    private ShoppingCart currentCart = new ShoppingCart();

    public StoreView() {
        this.main = new JFrame("Welcome to the fruit shop");
        this.browse = new JFrame("Browse");
        this.seeCart = new JFrame("Cart items");
        this.checkOut = new JFrame("Checkout");
    }
    public StoreView(StoreManager storeManager, int cartID){
        this.storeManager = storeManager;
        this.cartID = cartID;
    }
    public ShoppingCart browseMenuGUI(ShoppingCart currentCart){
        /**
         * Initialize all browse panels
         */
        JPanel browsePanel = new JPanel();
        browsePanel.setLayout(new BorderLayout());
        browsePanel.setBackground(Color.WHITE);
        JPanel headerPanel = new JPanel();
        JPanel bodyPanel = new JPanel(new GridLayout(3,2));
        JPanel footerPanel = new JPanel();
        JPanel backGround = new JPanel();
        backGround.setForeground(Color.WHITE);

        /**
         * Initialize all buttons
         */
        //JButton homeButton = new JButton("Home");
        //JButton catalogButton = new JButton("Catalog");
        JButton checkOut = new JButton("Checkout");
        JButton seeCart = new JButton("See Cart");

        JButton add = new JButton(" + ");
        JButton subtract = new JButton(" - ");

        /**
         * Initialize all labels
         */
        JLabel apples = new JLabel("Apples, ID: 101, Price: 1.0");
        JLabel avocados = new JLabel("Avocados, ID: 202, Price: 2.0");
        JLabel bananas = new JLabel("Bananas, ID: 303, Price: 3.0");
        JLabel oranges = new JLabel("Oranges, ID: 404, Price: 4.0");
        JLabel watermelons = new JLabel("Watermelons, ID: 505, Price: 5.0");

        /**
         * Images of products on the browse menu
         */
        ImageIcon image1, image2, image3, image4, image5;
        JLabel label1, label2, label3, label4, label5;

        //================================apples========================//

        image1 = new ImageIcon(getClass().getResource("apples.jpg"));
        label1 = new JLabel(image1);

        label1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label1.add(add, gbc);

        // add the action listener
        add.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.addToCart(101, 1);
                System.out.println(currentCart.getItems());
            }
        });
        label1.add(subtract, gbc);
        subtract.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.removeFromCart(101, 1);
                System.out.println(currentCart.getItems());
            }
        });

        bodyPanel.add(label1);
        apples.setPreferredSize(new Dimension(250,50));
        label1.add(apples);
        label1.setBounds(2, 2, 250,50);

        //================================avocados========================//

        image2 = new ImageIcon(getClass().getResource("avocados.jpg"));
        label2 = new JLabel(image2);

        label2.setLayout(new GridBagLayout());
        JButton add2 = new JButton(" + ");
        JButton subtract2 = new JButton(" - ");

        label2.add(add2, gbc);
        add2.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.addToCart(202, 1);
                System.out.println(currentCart.getItems());
            }
        });
        label2.add(subtract2, gbc);
        subtract2.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.removeFromCart(202, 1);
                System.out.println(currentCart.getItems());
            }
        });

        bodyPanel.add(label2);

        avocados.setPreferredSize(new Dimension(250,50));
        label2.add(avocados);
        label2.setBounds(2, 2, 250,50);

        //================================bananas========================//

        image3 = new ImageIcon(getClass().getResource("bananas.jpg"));
        label3 = new JLabel(image3);

        label3.setLayout(new GridBagLayout());
        JButton add3 = new JButton(" + ");
        JButton subtract3 = new JButton(" - ");

        label3.add(add3, gbc);
        add3.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.addToCart(303, 1);
                System.out.println(currentCart.getItems());
            }
        });
        label3.add(subtract3, gbc);
        subtract3.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.removeFromCart(303, 1);
                System.out.println(currentCart.getItems());
            }
        });
        bodyPanel.add(label3);

        bananas.setPreferredSize(new Dimension(250,50));
        label3.add(bananas);
        label3.setBounds(2, 2, 250,50);

        //================================oranges========================//

        image4 = new ImageIcon(getClass().getResource("oranges.jpg"));
        label4 = new JLabel(image4);

        label4.setLayout(new GridBagLayout());
        JButton add4 = new JButton(" + ");
        JButton subtract4 = new JButton(" - ");

        label4.add(add4, gbc);
        add4.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.addToCart(404, 1);
                System.out.println(currentCart.getItems());
            }
        });
        label4.add(subtract4, gbc);
        subtract4.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.removeFromCart(404, 1);
                System.out.println(currentCart.getItems());
            }
        });

        bodyPanel.add(label4);

        oranges.setPreferredSize(new Dimension(250,50));
        label4.add(oranges);
        label4.setBounds(2, 2, 250,50);

        //================================watermelons========================//


        image5 = new ImageIcon(getClass().getResource("watermelons.jpg"));
        label5 = new JLabel(image5);

        label5.setLayout(new GridBagLayout());
        JButton add5 = new JButton(" + ");
        JButton subtract5 = new JButton(" - ");

        label5.add(add5, gbc);
        add5.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.addToCart(505, 1);
                System.out.println(currentCart.getItems());
            }
        });
        label5.add(subtract5, gbc);
        subtract5.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.removeFromCart(505, 1);
                System.out.println(currentCart.getItems());
            }
        });

        bodyPanel.add(label5);

        watermelons.setPreferredSize(new Dimension(250,50));
        label5.add(watermelons);
        label5.setBounds(2, 2, 250,50);

        /**
         * mainPanel adds header, body and footer
         */
        browsePanel.add(headerPanel, BorderLayout.PAGE_START);
        browsePanel.add(bodyPanel, BorderLayout.CENTER);
        browsePanel.add(footerPanel, BorderLayout.PAGE_END);

        //homeButton.setPreferredSize(new Dimension(100, 25));
        //catalogButton.setPreferredSize(new Dimension(100, 25));
        checkOut.setPreferredSize(new Dimension(100, 25));
        seeCart.setPreferredSize(new Dimension(100, 25));
        headerPanel.setPreferredSize(new Dimension(500, 100));
        bodyPanel.setPreferredSize(new Dimension(500, 300));
        //headerPanel.add(homeButton);
        //headerPanel.add(catalogButton);
        headerPanel.add(checkOut);
        headerPanel.add(seeCart);
        seeCart.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                seeCartGUi(currentCart);
            }
        });

        checkOut.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                checkoutGUi(currentCart);
            }
        });

        browsePanel.add(headerPanel, BorderLayout.PAGE_START);
        this.browse.add(browsePanel);
        this.browse.setSize(1500, 500);
        this.browse.setVisible(true);

        return currentCart;
    }

    public void mainMenuGUI() {

        /**
         * the first product
         */
        Product Apples = new Product("Apples", 101, 1.0);
        Product Avocados = new Product("Avocados", 202, 2.0);
        Product Bananas = new Product("Bananas", 303, 3.0);
        Product Oranges = new Product("Oranges",404 , 4.0);
        Product Watermelons = new Product("Watermelons", 505, 5.0);

        /**
         * the inventory
         */
        Inventory inventor1 = new Inventory(Apples, 10);
        Inventory inventor2 = new Inventory(Avocados, 10);
        Inventory inventor3 = new Inventory(Bananas, 10);
        Inventory inventor4 = new Inventory(Oranges, 10);
        Inventory inventor5 = new Inventory(Watermelons, 10);

        /**
         * the manager for the Store.StoreView
         */
        StoreManager manager = new StoreManager();





        //ShoppingCart browseCart = new ShoppingCart();


        int cardID = manager.assignNewCartID();



        StoreView sv1 = new StoreView(manager, cardID);
        //StoreView sv2 = new StoreView(manager, manager.assignNewCartID());
        //StoreView sv3 = new StoreView(manager, manager.assignNewCartID());

        manager.addInventory(inventor1);
        manager.addInventory(inventor2);
        manager.addInventory(inventor3);
        manager.addInventory(inventor4);
        manager.addInventory(inventor5);



        //===============GUI code==========================//

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);
        JPanel headerPanel = new JPanel();
        JPanel bodyPanel = new JPanel();
        JPanel footerPanel = new JPanel();

        /**
         * Buttons on the main page
         */
        JButton homeButton = new JButton("Home");
        JButton catalogButton = new JButton("Browse");

        /**
         * Cart Menu on the main page
         */
//        JMenuBar mb = new JMenuBar();
//        JMenu menuCart = new JMenu("Cart");
//        JMenuItem checkoutItem = new JMenuItem("Checkout");
//        JMenuItem seeCartItem = new JMenuItem("See Cart");
//        menuCart.add(checkoutItem);
//        menuCart.add(seeCartItem);
//        mb.add(menuCart);

        /**
         * Body Panel on the main panel in main menu
         */
        //JLabel show_image = new JLabel("");
        //show_image.setIcon(new ImageIcon(new ImageIcon("fruithome.jpg.jpg").getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
        //bodyPanel.add(show_image, BorderLayout.CENTER);

        //image4 = new ImageIcon(getClass().getResource("oranges.jpg"));
        //label4 = new JLabel(image4);

        ImageIcon image1 = new ImageIcon(getClass().getResource("fruithome.jpg"));

        bodyPanel.setLayout(new BorderLayout());
        JLabel label = new JLabel(image1, JLabel.CENTER);
        bodyPanel.add(label, BorderLayout.CENTER );




        /**
         * Footer Panel of a text
         */

        JLabel footText = new JLabel("");
        footText.setText("Welcome to the Carleton Fruit Shop!" +
                "1. You have option button: 'Home', 'Browse' or you can see the cart and checkout" +
                "2. Click Browse to browse! " +
                "3. 'Home' will be the page you are reading right now ");
        footerPanel.add(footText, BorderLayout.CENTER);

        /**
         * Sizes of panels and buttons
         */

        homeButton.setPreferredSize(new Dimension(100, 25));
        catalogButton.setPreferredSize(new Dimension(100, 25));
        headerPanel.setPreferredSize(new Dimension(500, 100));
        bodyPanel.setPreferredSize(new Dimension(500, 300));
        headerPanel.add(homeButton);
        headerPanel.add(catalogButton);
        //headerPanel.add(mb);
        mainPanel.add(headerPanel, BorderLayout.PAGE_START);
        mainPanel.add(bodyPanel, BorderLayout.CENTER);
        mainPanel.add(footerPanel, BorderLayout.PAGE_END);
        mainPanel.setPreferredSize(new Dimension(500, 500));
        this.main.add(mainPanel);
        this.main.setSize(1500, 500);
        this.main.setVisible(true);

        catalogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentCart = browseMenuGUI(currentCart);


            }
        });



        main.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        main.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                if (JOptionPane.showConfirmDialog(main, "Are you sure you want to quit?")
                        == JOptionPane.OK_OPTION) {
                    // close it down!
                    main.setVisible(false);
                    main.dispose();
                }
            }
        });
    }

    public void displayGUI() {
        /**
         * main, header, body, footer panels
         */
        mainMenuGUI();

    }

    public static void main(String[] args) {
        StoreView sw = new StoreView();
        sw.displayGUI();
    }

    public float seeCartGUi(ShoppingCart currentCart){



        /**
         * Initialize all cart panels
         */
        JPanel seeCartPanel = new JPanel();
        seeCartPanel.setLayout(new BorderLayout());
        seeCartPanel.setBackground(Color.RED);
        JPanel headerPanel = new JPanel();
        JPanel bodyPanel = new JPanel(new GridLayout(3,2));
        JPanel footerPanel = new JPanel();
        JPanel backGround = new JPanel();
        backGround.setForeground(Color.WHITE);

        /**
         * Initialize all buttons
         */
        //JButton homeButton = new JButton("Home");
        //JButton catalogButton = new JButton("Browse");
        JButton checkOut = new JButton("Checkout");

        //JButton seeCartButton = new JButton("See Cart");

        JButton add = new JButton(" + ");
        JButton subtract = new JButton(" - ");

        /**
         * Initialize all labels
         */
        JLabel apples = new JLabel("Apples");


        /**
         * Images of products on the browse menu
         */
        ImageIcon image1, image2, image3, image4, image5;
        JLabel label1, label2, label3, label4, label5;

        image1 = new ImageIcon(getClass().getResource("apples.jpg"));
        label1 = new JLabel(image1);

        label1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;


        label1.add(subtract, gbc);
        subtract.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                currentCart.removeFromCart(101, 1);
                System.out.println(currentCart.getItems());
            }
        });

        StringBuilder iteminfo  = new StringBuilder();




        //float total = 0;

        for(Map.Entry mapElement : currentCart.getItems().entrySet()){

            int itemID = (int) mapElement.getKey();
            int quantity = (int) mapElement.getValue();


            for(int i = 0; i< storeManager.getInventories().size(); i++){
                for(Product p: storeManager.getInventories().get(i).getProducts().keySet()){
                    int id = p.getId();
                    if(itemID == id){

                        String name = p.getName();
                        double price = p.getPrice();
                        total += price * quantity;
                        iteminfo.append(quantity);
                        iteminfo.append(" | ");
                        iteminfo.append(name);
                        iteminfo.append(" | ");
                        iteminfo.append(price);
                        iteminfo.append(" | (");
                        iteminfo.append(id);
                        iteminfo.append(")\n");
                    }
                }
            }
        }

        String info = iteminfo.toString();

        System.out.println(iteminfo);

        label2 = new JLabel();
        label2.setText(info);
        //label2.setBackground(Color.RED);



        checkOut.addActionListener(new ActionListener() {

            // this method will be called when we click the button
            @Override
            public void actionPerformed(ActionEvent ae) {
                checkoutGUi(currentCart);
            }
        });

       // bodyPanel.add(label1);
        bodyPanel.add(label2);
        apples.setPreferredSize(new Dimension(250,50));
        label1.add(apples);



        /**
         * mainPanel adds header, body and footer
         */
        seeCartPanel.add(headerPanel, BorderLayout.PAGE_START);
        seeCartPanel.add(bodyPanel, BorderLayout.CENTER);
        seeCartPanel.add(footerPanel, BorderLayout.PAGE_END);


        checkOut.setPreferredSize(new Dimension(100, 25));
        headerPanel.setPreferredSize(new Dimension(500, 100));
        bodyPanel.setPreferredSize(new Dimension(500, 300));
        headerPanel.add(checkOut);


        seeCartPanel.add(headerPanel, BorderLayout.PAGE_START);
        this.seeCart.add(seeCartPanel);
        this.seeCart.setSize(1500, 500);
        this.seeCart.setVisible(true);

        return total;

    }

    public void checkoutGUi(ShoppingCart currentCart){

        /**
         * Initialize all cart panels
         */
        JPanel seeCartPanel = new JPanel();
        seeCartPanel.setLayout(new BorderLayout());
        seeCartPanel.setBackground(Color.RED);
        JPanel headerPanel = new JPanel();
        JPanel bodyPanel = new JPanel(new GridLayout(3,2));
        JPanel footerPanel = new JPanel();
        JPanel backGround = new JPanel();
        backGround.setForeground(Color.WHITE);



        StringBuilder iteminfo  = new StringBuilder();




        //float total = 0;

        for(Map.Entry mapElement : currentCart.getItems().entrySet()){

            int itemID = (int) mapElement.getKey();
            int quantity = (int) mapElement.getValue();


            for(int i = 0; i< storeManager.getInventories().size(); i++){
                for(Product p: storeManager.getInventories().get(i).getProducts().keySet()){
                    int id = p.getId();
                    if(itemID == id){

                        String name = p.getName();
                        double price = p.getPrice();
                        total += price * quantity;
                        iteminfo.append(quantity);
                        iteminfo.append(" | ");
                        iteminfo.append(name);
                        iteminfo.append(" | ");
                        iteminfo.append(price);
                        iteminfo.append(" | (");
                        iteminfo.append(id);
                        iteminfo.append(")\n");
                    }
                }
            }
        }
        iteminfo.append("total is: $");
        iteminfo.append(total);

        String info = iteminfo.toString();

        System.out.println(iteminfo);



        JLabel label2 = new JLabel();
        label2.setText(info);

        bodyPanel.add(label2);




        /**
         * mainPanel adds header, body and footer
         */
        seeCartPanel.add(headerPanel, BorderLayout.PAGE_START);
        seeCartPanel.add(bodyPanel, BorderLayout.CENTER);
        seeCartPanel.add(footerPanel, BorderLayout.PAGE_END);


        //checkOut.setPreferredSize(new Dimension(100, 25));
        headerPanel.setPreferredSize(new Dimension(500, 100));
        bodyPanel.setPreferredSize(new Dimension(500, 300));
        //headerPanel.add(checkOut);

        checkOut.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        checkOut.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                if (JOptionPane.showConfirmDialog(main, "Are you sure you want to quit?")
                        == JOptionPane.OK_OPTION) {
                    // close it down!
                    checkOut.setVisible(false);
                    checkOut.dispose();
                }
            }
        });


        seeCartPanel.add(headerPanel, BorderLayout.PAGE_START);
        this.checkOut.add(seeCartPanel);
        this.checkOut.setSize(1500, 500);
        this.checkOut.setVisible(true);

    }


}
