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

    public StoreView() {
        this.main = new JFrame("Welcome to the fruit shop");
        this.browse = new JFrame("Browse");
        this.seeCart = new JFrame("See Cart");
        this.checkOut = new JFrame("Checkout");
    }

    public void browseMenuGUI(){
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
        JButton homeButton = new JButton("Home");
        JButton catalogButton = new JButton("Catalog");
        JButton checkOut = new JButton("Checkout");
        JButton seeCart = new JButton("See Cart");

        JButton add = new JButton(" + ");
        JButton subtract = new JButton(" - ");

        /**
         * Initialize all labels
         */
        JLabel apples = new JLabel("Apples");
        JLabel avocados = new JLabel("Avocados");
        JLabel bananas = new JLabel("Bananas");
        JLabel oranges = new JLabel("Oranges");
        JLabel watermelons = new JLabel("Watermelons");

        /**
         * Images of products on the browse menu
         */
        ImageIcon image1, image2, image3, image4, image5;
        JLabel label1, label2, label3, label4, label5;

        image1 = new ImageIcon(getClass().getResource("apples.jpg"));
        label1 = new JLabel(image1);
        bodyPanel.add(label1);
        apples.setPreferredSize(new Dimension(250,50));
        label1.add(apples);

        image2 = new ImageIcon(getClass().getResource("avocados.jpg"));
        label2 = new JLabel(image2);
        bodyPanel.add(label2);

        image3 = new ImageIcon(getClass().getResource("bananas.jpg"));
        label3 = new JLabel(image3);
        bodyPanel.add(label3);

        image4 = new ImageIcon(getClass().getResource("oranges.jpg"));
        label4 = new JLabel(image4);
        bodyPanel.add(label4);

        image5 = new ImageIcon(getClass().getResource("watermelons.jpg"));
        label5 = new JLabel(image5);
        bodyPanel.add(label5);

        /**
         * mainPanel adds header, body and footer
         */
        browsePanel.add(headerPanel, BorderLayout.PAGE_START);
        browsePanel.add(bodyPanel, BorderLayout.CENTER);
        browsePanel.add(footerPanel, BorderLayout.PAGE_END);

        homeButton.setPreferredSize(new Dimension(100, 25));
        catalogButton.setPreferredSize(new Dimension(100, 25));
        checkOut.setPreferredSize(new Dimension(100, 25));
        seeCart.setPreferredSize(new Dimension(100, 25));
        headerPanel.setPreferredSize(new Dimension(500, 100));
        bodyPanel.setPreferredSize(new Dimension(500, 300));
        headerPanel.add(homeButton);
        headerPanel.add(catalogButton);
        headerPanel.add(checkOut);
        headerPanel.add(seeCart);
        browsePanel.add(headerPanel, BorderLayout.PAGE_START);
        this.browse.add(browsePanel);
        this.browse.setSize(1500, 500);
        this.browse.setVisible(true);
    }

    public void mainMenuGUI() {
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
        JMenuBar mb = new JMenuBar();
        JMenu menuCart = new JMenu("Cart");
        JMenuItem checkoutItem = new JMenuItem("Checkout");
        JMenuItem seeCartItem = new JMenuItem("See Cart");
        menuCart.add(checkoutItem);
        menuCart.add(seeCartItem);
        mb.add(menuCart);

        /**
         * Body Panel on the main panel in main menu
         */
        JLabel show_image = new JLabel("");
        show_image.setIcon(new ImageIcon(new ImageIcon("MainMenuPic.jpg").getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
        bodyPanel.add(show_image, BorderLayout.CENTER);

        /**
         * Footer Panel of a text
         */

        JLabel footText = new JLabel("");
        footText.setText("Hello and welcome to the Watch Strap Store!" +
                "1. You have option button: 'Home', 'Catalog' or you can see the cart and checkout" +
                "2. Click Catalog to browse! " +
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
        headerPanel.add(mb);
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
                browseMenuGUI();
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
}

