/* A subclass of Trader named DomesticatableTrader.
 * This class is identical to Trader, except that it takes
 * only Domesticatable objects in its inventory, wishlist, etc.
 */

import java.util.List;

class DomesticatableTrader extends Trader<Domesticatable> {
    /**
     * Construct a DomesticatableTrader, giving them the
     * given inventory, wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DomesticatableTrader(List<Domesticatable> inventory,
                                List<Domesticatable>
                                        wishlist,
                                int money) {
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

    @Override
    public int getSellingPrice(Domesticatable item) {
        int super_price = super.getSellingPrice(item);

        if (super_price == Tradable.MISSING_PRICE) {
            return super_price;
        }

        return super_price * 2;

    }

}