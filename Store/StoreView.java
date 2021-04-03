package Store;//STUDENT NAME: Chia-Yu Liu
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
    /*
    private StoreManager sm;
    private int cartID;
    private String currentPage;
*/
    public StoreView() {
        this.main = new JFrame("Welcome to the fruit shop");
        this.browse = new JFrame("Browse");
        this.seeCart = new JFrame("See Cart");
        this.checkOut = new JFrame("Checkout");
    }
    /*
        // this method formats the product catalog nicely
        private String getHomePage() {
            currentPage = "home";
            return "|--------------------THE COURSE STORE--------------------|\n" +
                    "\\--------------------------HOME--------------------------/\n" +
                    "Type 'help' for a list of commands.\n\n" +
                    "Welcome to the Course Store!";
        }

        private String getCartPage() {
            currentPage = "cart";
            StringBuilder sb = new StringBuilder("|--------------------THE COURSE STORE--------------------|\n" +
                    "\\--------------------------CART--------------------------/\n" +
                    "Type 'help' for a list of commands.\n\n" +
                    "Cart: " + cartID + "\n" +
                    "Amount in Cart | Product Name | Unit Price\n");

            for (ProductPair item : sm.getCartContents(cartID)) {
                sb.append(item.getStock()).append(" | ").append(item.getProduct().getName()).append(" | $").append(item.getProduct().getPrice()).append('\n');
            }
            return sb.toString();
        }

        private String getHelpPage() {
            currentPage = "help";
            return "|--------------------THE COURSE STORE--------------------|\n" +
                    "\\--------------------------HELP--------------------------/\n" +
                    "Type 'help' for a list of commands.\n\n" +
                    "'cart' - view cart\n" +
                    "'help' - list of commands\n" +
                    "'home' - back to home page\n" +
                    "'browse' - list available products\n" +
                    "'addtocart' - add a product to your cart\n" +
                    "'removefromcart' - remove a product from your cart\n" +
                    "'checkout' - checkout with current cart contents\n" +
                    "'quit' - quit the store\n";
        }

        private String getBrowsePage() {
            currentPage = "browse";
            StringBuilder sb = new StringBuilder("|--------------------THE COURSE STORE--------------------|\n" +
                    "\\-------------------------BROWSE-------------------------/\n" +
                    "Type 'help' for a list of commands.\n\n" +
                    "Stock | Product Name | Unit Price\n");

            for (ProductPair item : sm.getProducts()) {
                sb.append(item.getStock()).append(" | ").append(item.getProduct().getName()).append(" | $").append(item.getProduct().getPrice()).append('\n');
            }
            return sb.toString();
        }

        private String getAddPage() {
            currentPage = "addtocart";
            System.out.print("|--------------------THE COURSE STORE--------------------|\n" +
                    "\\---------------------------ADD--------------------------/\n" +
                    "Stock | Product Name | Unit Price | Option\n");

            List<ProductPair> products = sm.getProducts();
            int counter = 0;

            for (ProductPair item : products) {
                System.out.println(item.getStock() + " | " + item.getProduct().getName() + " | $" + item.getProduct().getPrice() + " | (" + counter++ + ")");
            }
            if (counter == 0) {
                return "The store's empty, sorry.";
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Option: ");
            int option = sc.nextInt();
            if (option >= counter || option < 0) return "Failed.";
            System.out.print("Amount: ");
            int amount = sc.nextInt();
            if (sm.addToCart(cartID, products.get(option).getProduct(), amount)) {
                return "Added to cart.";
            }
            return "Failed.";
        }

        private String getRemovePage() {
            currentPage = "removefromcart";
            System.out.print("|--------------------THE COURSE STORE--------------------|\n" +
                    "\\--------------------------REMOVE------------------------/\n" +
                    "Amount in Cart | Product Name | Unit Price | Option\n");

            List<ProductPair> cartContents = sm.getCartContents(cartID);
            int counter = 0;

            for (ProductPair item : cartContents) {
                System.out.println(item.getStock() + " | " + item.getProduct().getName() + " | $" + item.getProduct().getPrice() + " | (" + counter++ + ")");
            }
            if (counter == 0) {
                return "Your cart's empty.";
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Option: ");
            int option = sc.nextInt();
            if (option >= counter || option < 0)
                return "Failed.";
            System.out.print("Amount: ");
            int amount = sc.nextInt();
            if (amount < 1)
                return "Failed.";
            if (sm.removeFromCart(cartID, cartContents.get(option).getProduct(), amount)) {
                return "Removed from cart.";
            }
            return "Failed.";
        }

        private String getCheckoutPage() {
            currentPage = "checkout";
            StringBuilder sb = new StringBuilder("|--------------------THE COURSE STORE--------------------|\n" +
                    "\\--------------------------CART--------------------------/\n" +
                    "Type 'help' for a list of commands.\n\n" +
                    "Cart: " + cartID + "\n" +
                    "Amount in Cart | Product Name | Unit Price\n");

            for (ProductPair item : sm.getCartContents(cartID)) {
                sb.append(item.getStock()).append(" | ").append(item.getProduct().getName()).append(" | $").append(item.getProduct().getPrice()).append('\n');
            }
            sb.append("Your total is: $ ").append(sm.getCartTotal(cartID)).append("\nThank you have a great day!\n");
            return sb.toString();
        }
    */
    public void catalogGUI(){
        /**
         * Initialize all panels Menu buttons
         */
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);
        JPanel headerPanel = new JPanel();
        JPanel bodyPanel = new JPanel();
        JPanel footerPanel = new JPanel();
        JButton homeButton =  new JButton("Home");
        JButton catalogButton = new JButton("Catalog");
        JButton checkOut = new JButton("Checkout");
        JButton seeCart = new JButton("See Cart");

        /**
         * mainPanel adds header, body and footer
         */
        mainPanel.add(headerPanel,BorderLayout.PAGE_START);
        mainPanel.add(bodyPanel,BorderLayout.CENTER);
        mainPanel.add(footerPanel,BorderLayout.PAGE_END);

        /**
         *
         */

        homeButton.setPreferredSize(new Dimension(100,25));
        catalogButton.setPreferredSize(new Dimension(100,25));
        checkOut.setPreferredSize(new Dimension(100,25));
        seeCart.setPreferredSize(new Dimension(100,25));
        headerPanel.setPreferredSize(new Dimension(500,100));
        bodyPanel.setPreferredSize(new Dimension(500,300));
        headerPanel.add(homeButton);
        headerPanel.add(catalogButton);
        headerPanel.add(checkOut);
        headerPanel.add(seeCart);
        mainPanel.add(headerPanel, BorderLayout.PAGE_START);
        this.browse.add(mainPanel);
        this.browse.setSize(1500,500);
        this.browse.setVisible(true);


    }

    public void mainMenuGUI(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);
        JPanel headerPanel = new JPanel();
        JPanel bodyPanel = new JPanel();
        JPanel footerPanel = new JPanel();

        /**
         * Buttons on the main page
         */
        JButton homeButton =  new JButton("Home");
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
        show_image.setIcon(new ImageIcon(new ImageIcon("MainMenuPic.jpg").getImage().getScaledInstance(400,300,Image.SCALE_SMOOTH)));
        bodyPanel.add(show_image, BorderLayout.CENTER);

        /**
         * Footer Panel of a text
         */

        JLabel footText = new JLabel("");
        footText.setText("Hello and welcome to the Watch Strap Store!" +
                "1. You have option button: 'Home', 'Catalog' or you can see the cart and checkout" +
                "2. Click Catalog to browse! " +
                "3. 'Home' will be the page you are reading right now ");
        footerPanel.add(footText,BorderLayout.CENTER);

        /**
         * Sizes of panels and buttons
         */

        homeButton.setPreferredSize(new Dimension(100,25));
        catalogButton.setPreferredSize(new Dimension(100,25));
        headerPanel.setPreferredSize(new Dimension(500,100));
        bodyPanel.setPreferredSize(new Dimension(500,300));
        headerPanel.add(homeButton);
        headerPanel.add(catalogButton);
        headerPanel.add(mb);
        mainPanel.add(headerPanel, BorderLayout.PAGE_START);
        mainPanel.add(bodyPanel,BorderLayout.CENTER);
        mainPanel.add(footerPanel,BorderLayout.PAGE_END);
        mainPanel.setPreferredSize(new Dimension(500,500));
        this.main.add(mainPanel);
        this.main.setSize(1500,500);
        this.main.setVisible(true);

        catalogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                catalogGUI();
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
        /*
        StoreManager sm = new StoreManager();
        StoreView sv1 = new StoreView(sm, sm.assignNewCartID());
        StoreView sv2 = new StoreView(sm, sm.assignNewCartID());
        StoreView sv3 = new StoreView(sm, sm.assignNewCartID());
        StoreView[] users = {sv1, sv2, sv3};
        int activeSV = users.length;

        Scanner sc = new Scanner(System.in);

        while (activeSV > 0) {
            System.out.print("CHOOSE YOUR STOREVIEW >>> ");
            int choice = sc.nextInt();
            if (choice < users.length && choice >= 0) {
                if (users[choice] != null) {
                    String chooseAnother = "";
                    while (!chooseAnother.equals("y") && !chooseAnother.equals("Y")) {
                        // this implementation of displayGUI waits for input and displays the page corresponding
                        // to the user's input. it does this once, and then returns true if the user entered
                        // 'checkout' or 'quit'.
                        if (users[choice].displayGUI()) {
                            users[choice] = null;
                            activeSV--;
                            break;
                        }
                        System.out.print("GO TO ANOTHER STOREVIEW? (y) >>> ");
                        chooseAnother = sc.next();
                    }
                } else {
                    System.out.println("MAIN > ERROR > BAD CHOICE\nTHAT STOREVIEW WAS DEACTIVATED");
                }
            } else {
                System.out.println(
                        String.format("MAIN > ERROR > BAD CHOICE\nPLEASE CHOOSE IN RANGE [%d, %d]", 0, users.length - 1)
                );
            }
        }
        System.out.println("ALL STOREVIEWS DEACTIVATED");
    }
    */

}




//public class StoreView {
//
//    private static StoreManager storeManager;
//
//    private static int cartID;
//
//    private static JFrame frame;
//
//    public StoreView(){
//        this(new StoreManager(),0);
//    }
//
//    /**
//     * Creates a new Store.StoreView with the supplied attributes.
//     * Set default values upon object creation
//     */
//    public StoreView(StoreManager storeManager, int cartID){
//        this.storeManager = storeManager;
//        this.cartID = cartID;
//
//    }
//
//    public JFrame GUIGenerator(){
//        JFrame frame = new JFrame("Client Generator");
//        return frame;
//    }
//
//    public static void main(String[] args) {
//
//
//        /**
//         * the first product
//         */
//        Product apple = new Product("apple", 101, 1.0);
//        Product banana = new Product("banana", 202, 2.0);
//        Product iPhone = new Product("iPhone", 303, 3.0);
//        Product iPad = new Product("iPad",404 , 4.0);
//        Product MacBook = new Product("MacBook", 505, 5.0);
//
//
//        /**
//         * the inventory
//         */
//        Inventory inventor1 = new Inventory(apple, 10);
//        Inventory inventor2 = new Inventory(banana, 10);
//        Inventory inventor3 = new Inventory(iPhone, 10);
//        Inventory inventor4 = new Inventory(iPad, 10);
//        Inventory inventor5 = new Inventory(MacBook, 10);
//
//
//        /**
//         * the manager for the Store.StoreView
//         */
//        StoreManager manager = new StoreManager();
//
//
//
//        ShoppingCart currentCart;
//
//
//
//        StoreView sv1 = new StoreView(manager, manager.assignNewCartID());
//        //StoreView sv2 = new StoreView(manager, manager.assignNewCartID());
//        //StoreView sv3 = new StoreView(manager, manager.assignNewCartID());
//
//
//
//
//        manager.addInventory(inventor1);
//        manager.addInventory(inventor2);
//        manager.addInventory(inventor3);
//        manager.addInventory(inventor4);
//        manager.addInventory(inventor5);
//
//
//
//        System.out.println("============store test from now========");
//
//        System.out.println("pick first cart");
//
//        JFrame frame = new JFrame();
//
//        // some things you should specify when creating your JFrame
//        frame.setTitle("Client StoreView");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // add the window listener
//        // we no longer want the frame to close immediately when we press "x"
//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent we) {
//                if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to quit?")
//                        == JOptionPane.OK_OPTION) {
//                    // close it down!
//                    frame.setVisible(false);
//                    frame.dispose();
//                }
//            }
//        });
//
//        JLabel headerLabel = new JLabel("Welcome to The Fruit Shop");
//
//
//
//
//
//        currentCart = manager.findCart();
//
//
//
//        boolean flag = true;
//
//        String command = manager.command();
//
//
//        //b/a/r/c/q
//        while(!command.equals("q")){
//
//            if (command.equals("b")){
//                manager.browse();
//                command = manager.command();
//            }else if (command.equals("a")){
//                manager.addToCart(currentCart);
//                command = manager.command();
//            }else if (command.equals("r")){
//                manager.removeFromCart(currentCart);
//                command = manager.command();
//            }else if(command.equals("c")){
//                double total = manager.processTransaction(currentCart);
//                System.out.println("total test:");
//                System.out.println(total);
//                break;
//            }else if(command.equals("q")){
//                manager.quit(currentCart, cartID);
//                break;
//            }
//
//        }
//        System.out.println("");
//        System.out.println("thanks for shopping with us today");
//
//
//
//
//
//
//    }
//
//}
