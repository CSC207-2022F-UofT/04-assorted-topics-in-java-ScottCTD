interface Drivable {
    /**
     * Increase the maximum speed of this Vehicle.
     **/
    void upgradeSpeed();

    /**
     * Decrease the maximum speed of this Vehicle.
     **/
    void downgradeSpeed();


    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return    The current maximum speed of this Vehicle.
     **/
    int getMaxSpeed();
}