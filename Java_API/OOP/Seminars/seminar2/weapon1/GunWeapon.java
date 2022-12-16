package OOP.Seminars.seminar2.weapon1;

public class GunWeapon extends Weapon {

    @Override
    public String getName() {

        return "Eagle";
    }

    @Override
    public float getDamage() {

        return 10;
    }

    @Override
    public float rateOfFire() {

        return 15;
    }

    @Override
    public Integer bulletsAmount() {

        return 10;
    }

    @Override
    public String getSound() {

        return "bang";
    }

    @Override
    public String toString() {
        return "GunWeapon []";
    }

}
