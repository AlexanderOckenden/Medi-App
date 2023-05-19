package com.example.healthcare;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import com.example.healthcare.Database;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class DatabaseTest {

    private Database database;

    @Before
    public void setUp() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        database = new Database(appContext, null, null, 1);
    }

    @After
    public void tearDown() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        appContext.deleteDatabase("your_database_name.db");
    }

    @Test
    public void testRegister() {
        database.register("username", "email", "password");


        int result = database.login("username", "password");
        assertEquals(1, result);
    }

    @Test
    public void testLogin() {
        database.register("username", "email", "password");


        int result = database.login("username", "password");
        assertEquals(1, result);
    }

    @Test
    public void testAddToCart() {
        database.addCart("username", "product", 10.0f, "otype");


        int result = database.checkCart("username", "product");
        assertEquals(1, result);
    }

    @Test
    public void testRemoveFromCart() {
        database.addCart("username", "product", 10.0f, "otype");
        database.removeCart("username", "otype");


        int result = database.checkCart("username", "product");
        assertEquals(0, result);
    }

    @Test
    public void testGetCartData() {
        database.addCart("username", "product1", 10.0f, "otype1");
        database.addCart("username", "product2", 20.0f, "otype2");


        ArrayList<String> cartData = database.getCartData("username", "otype1");


        assertEquals(1, cartData.size());
        assertEquals("product1$10.0", cartData.get(0));
    }

    @Test
    public void testAddOrder() {
        database.addOrder("username", "fullname", "address", "contact", 12345, "date", "time", 100.0f, "otype");


        ArrayList<String> orderData = database.getOrderData("username");
        assertEquals(1, orderData.size());
        assertEquals("fullname$address$contact$date$time$12345$100.0$otype", orderData.get(0));
    }

    @Test
    public void testCheckAppointmentExists() {
        database.addOrder("username", "fullname", "address", "contact", 12345, "date", "time", 100.0f, "otype");


    }
}