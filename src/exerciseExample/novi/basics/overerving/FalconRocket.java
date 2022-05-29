package exerciseExample.novi.basics.overerving;

public class FalconRocket extends Rocket {

    public int extraFuel = 10;

    public FalconRocket(int maximumFuel) {
        super(maximumFuel);
    }

    @Override
    public boolean hasEnoughFuel(int fuel) {
        if(super.hasEnoughFuel(fuel)) {
            return true;
        }
        if(currentFuel + extraFuel > fuel) {
            return true;
        }
        return false;
    }
}
