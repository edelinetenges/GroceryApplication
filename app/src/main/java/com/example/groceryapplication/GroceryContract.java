package com.example.groceryapplication;

import android.provider.BaseColumns;

class GroceryContract {

    private GroceryContract() {}

    static final class GroceryEntry implements BaseColumns {
        static final String TABLE_NAME = "GROCERY_ITEMS";
        static final String COLUMN_NAME = "NAME";
        static final String COLUMN_AMOUNT = "AMOUNT";
        static final String COLUMN_TIMESTAMP= "TIMESTAMP";
    }
}
