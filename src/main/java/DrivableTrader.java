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
public class DrivableTrader<T extends Drivable> extends Trader<T> {
    public DrivableTrader(List<T> inventory, List<T> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int money) {
        super(money);
    }
}

    /**
     * Construct a DomesticatableTrader, giving them the
     * given money and an empty wishlist and inventory.
     *
     * @param money     The Trader's money
     */


    public int getSellingPrice(Domesticatable item) {
        int super_price = super.getSellingPrice(item);

        if (super_price == Tradable.MISSING_PRICE) {
            return super_price;
        }

        return  super_price + item.getMaxSpeed();
    }
}


