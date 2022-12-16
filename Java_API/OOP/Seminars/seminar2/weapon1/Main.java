package OOP.Seminars.seminar2.weapon1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        List<Weapon> weapons = new ArrayList<>();
        weapons.add(new GunWeapon());
        weapons.add(new MachineGunWeapon());
        weapons.add(new FireGunWeapon());

        for (Weapon weapon : weapons) {

            System.out.println(weapon.getName());
            defeatTarget(weapon);
            System.out.println("-----------");
        }

    }

    private static void defeatTarget(Weapon weapon) {
        float health = 100;
        while (health > 0) {
            health -= weapon.getDamage();
            System.out.println(weapon.getSound());
            System.out.println(health);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
