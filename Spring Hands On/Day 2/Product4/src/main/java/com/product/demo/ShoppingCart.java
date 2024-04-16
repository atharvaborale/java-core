package com.product.demo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<product> items = new ArrayList<>();

    public void addItem(product item) {
        items.add(item);
    }

    public List<product> getItems() {
        return items;
    }
}
