package Store;

//STUDENT NAME: Chia-Yu Liu //
//STUDENT ID: 100698737     //
//STUDENT NAME: Keefer Belanger//
//STUDENT ID:  101152085//

import java.util.ArrayList;

public class Product {


    private String name;                     // name of the Store.Product
    private int id;                          // id of Store.Product
    private double price;                     // price of Store.Product



    /**
     * Creates a new Store.Product with the supplied attributes.
     */
    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    /**
     * Get this Store.Product's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get this Store.Product's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Get this Store.Product's price.
     */
    public double getPrice() {
        return price;
    }





}
