package c2;

public class Fighter {
    private static int counter;
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name,int health, int damagePerAttack ) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
        counter++;
    }

    public void attack(Fighter f){
        f.health=f.health- damagePerAttack;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }

    /*
    public static int getNumberofFighters(){
    return counter; //se foloseste cand vrem sa il apelam prin clasa
    }
    * */

    public int getNumberofFighters(){   // asa il putem apela prin obiect
        return counter;
    }
}
