package OOP.Seminars.seminar2.weapon1;

public class MachineGunWeapon extends Weapon {

    @Override
    public String getName() {

        return "AK47";
    }

    @Override
    public float getDamage() {

        return 100;
    }

    @Override
    public float rateOfFire() {

        return 50;
    }

    @Override
    public Integer bulletsAmount() {

        return 50;
    }

    @Override
    public String getSound() {

        return "bang-bang";
    }

    @Override
    public String toString() {
        return "MachineGunWeapon []";
    }

}
