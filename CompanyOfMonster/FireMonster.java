public class FireMonster extends Monster {

    public FireMonster(String name, int attack) {
        super(name, attack, "fire");
    }

    @Override
    public boolean attack(Monster opponent) {
        int actualDamage = this.getAttack();
        if (opponent.getType().equals("air")) {
            actualDamage *= 2; 
        }
        opponent.setLife(opponent.getLife() - actualDamage);
        System.out.println(this.getName() + " attacks " + opponent.getName() + " with " + actualDamage + " damage!");
        return opponent.isKO();
    }
}