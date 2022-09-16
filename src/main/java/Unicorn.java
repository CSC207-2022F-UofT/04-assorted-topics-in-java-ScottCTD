/* A sample class that implements all interfaces except Tradable.
 */
public class Unicorn implements Drivable, Domesticatable {

    private int maxSpeed;

    public Unicorn() {
        this.maxSpeed = 10;
    }

    @Override
    public String sound() {
        return "* ~ Neigh ~ *";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 2;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

}