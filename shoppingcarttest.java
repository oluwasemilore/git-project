import csc4700.ShoppingCart;
import csc4700.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class shoppingcarttest {
    public void testAdditemnull(){
        ShoppingCart s = new ShoppingCart();
        try{
            s.addItem(null);
        }
        catch (NullPointerException e ){
            assertTrue(true);
        }



    }
    @Test
    public void testadditemnotnull(){
        ShoppingCart s = new ShoppingCart();
        Item itemA= new Item();
        itemA.setCost(50);
        itemA.setDescription("Car");
        itemA.setName("Vehicle");



        s.addItem(itemA);
        List<CartItem> cartItems=s.getCartItems();
        int siz=cartItems.size();

        assertEquals(siz,1);



    }
}
