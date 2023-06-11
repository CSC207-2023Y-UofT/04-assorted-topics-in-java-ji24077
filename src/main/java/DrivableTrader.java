/* TODO: Create a subclass of Trader named DrivableTrader <done>
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class DrivableTrader extends Trader<Drivable> {
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int money) {super(new ArrayList<>(), new ArrayList<>(), money);}

    public int getSellingPrice(Drivable item) {
        if (item instanceof Tradable)
        {
            Tradable tradable_Item = (Tradable) item;
            return tradable_Item.getPrice() + item.getMaxSpeed();
        }
        else
        {
            return Tradable.MISSING_PRICE;
        }
    }
}
