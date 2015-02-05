package org.week2;

import java.util.*;

public class Cart {

	protected Collection<CartItem> cartitems;
	private CartItem citem1, citem2;

	public Cart() {
		citem1 = new Cartitem(1,112);
		citem2 = new Cartitem(2,110);
		cartitems.add(citem1);
		cartitems.add(citem2);
		throw new UnsupportedOperationException();
	}

}
