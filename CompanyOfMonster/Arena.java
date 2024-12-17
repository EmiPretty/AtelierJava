public class Arena {
    public static void main(String[] args) {
        Monster fireMonster = new FireMonster("Dragon", 10);
        Monster waterMonster = new WaterMonster("Grenouille", 10);

        System.out.println("Début du combat !");
        while (!fireMonster.isKO() && !waterMonster.isKO()) {
            if (fireMonster.attack(waterMonster)) break;
            if (waterMonster.attack(fireMonster)) break;
        }

        if (!fireMonster.isKO()) {
            System.out.println(fireMonster.getName() + " gagne le combat !");
        } else {
            System.out.println(waterMonster.getName() + " gagne le combat !");
        }
    }
}