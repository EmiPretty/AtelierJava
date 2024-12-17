public class AirMonster extends Monster {

    public AirMonster(String name, int attack) {
        super(name, attack, "air");
    }

    @Override
    public boolean attack(Monster opponent) {
        int actualDamage = this.getAttack();
        if (opponent.getType().equals("water")) {
            actualDamage *= 2; 
        }
        opponent.setLife(opponent.getLife() - actualDamage);
        System.out.println(this.getName() + " attacks " + opponent.getName() + " with " + actualDamage + " damage!");
        return opponent.isKO();
    }
}
