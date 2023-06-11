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
class DrivableTrader extends Trader<Drivable>
{
    public DomesticatableTrader(List<Domesticatable> inventory,
                               List<Domesticatable>
                                       wishlist,
                               int money)
    {
        super(inventory, wishlist, money);
    }

    /**
     * Construct a DomesticatableTrader, giving them the
     * given money and an empty wishlist and inventory.
     *
     * @param money     The Trader's money
     */
    public DomesticatableTrader(int money) {
        super(money);
    }


    public int getSellingPrice(Domesticatable item) {
        int super_price = super.getSellingPrice(item);

        if (super_price == Tradable.MISSING_PRICE) {
            return super_price;
        }
        int Obj_Price = super_price;
        int Obj_Speed = item.getMaxSpeed();
        return Obj_Speed + Obj_Speed;
    }
}


