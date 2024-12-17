public class WaterMonster extends Monster {

    public WaterMonster(String name, int attack) {
        super(name, attack, "water");
    }

    @Override
    public boolean attack(Monster opponent) {
        int actualDamage = this.getAttack();
        if (opponent.getType().equals("fire")) {
            actualDamage *= 2; // Water is strong against Fire
        }
        opponent.setLife(opponent.getLife() - actualDamage);
        System.out.println(this.getName() + " attacks " + opponent.getName() + " with " + actualDamage + " damage!");
        return opponent.isKO();
    }
}