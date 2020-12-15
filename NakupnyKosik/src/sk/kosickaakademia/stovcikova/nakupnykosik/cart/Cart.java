package sk.kosickaakademia.stovcikova.nakupnykosik.cart;

import jdk.jshell.execution.Util;
import sk.kosickaakademia.stovcikova.nakupnykosik.Item;
import sk.kosickaakademia.stovcikova.nakupnykosik.countable.CountItem;
import sk.kosickaakademia.stovcikova.nakupnykosik.uncontable.WeightItem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> list;

    public Cart() {
        list = new ArrayList<>();
    }

    public List<Item> getList() {
        return list;
    }

    public void addItem(Item newItem) {
        if (newItem.getPrice() >= 0) {
            if (newItem instanceof CountItem && ((CountItem) newItem).getCount() > 0) {
                list.add(newItem);
            }
            if (newItem instanceof WeightItem && ((WeightItem) newItem).getWeight() > 0) {
                list.add(newItem);
            }
        }
    }

    public int getCountOfItemsInCart() {
        return list.size();
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item temp : list) {
            total = total + (temp.getItemPrice());
        }
        return (total);

    }

    public void printCart() {
        System.out.println(" List of items in your cart: ");
        for (Item temp : list) {
            /*System.out.println(" - " + temp.toString());*/
            System.out.println(" - "+ temp.getName());
        }



        }
    }
