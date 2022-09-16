public interface Tradable {
    // This value is returned when a price is unavailable.
    int MISSING_PRICE = -1;

    int getPrice();
}