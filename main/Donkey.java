package main;
public class Donkey extends characters implements donkey_interface{
    public boolean cary_sign = false;
    public Donkey(){
        super("ИА","male");
        this.MOOD=moodenum.DENY;
    }
    public Donkey(String name){
        super(name,"male");
        this.MOOD=moodenum.DENY;
    }
    public Donkey(String name, String gender){
        super(name,gender);
        this.MOOD=moodenum.DENY;
    }
    @Override
    public void wave(String whichhand){
        System.out.print(this.getName());
        System.out.print(" ");
        System.out.print(this.getMood());
        System.out.print(" помахал ");
        System.out.println(whichhand);
    }
    @Override
    public void brake_the_sign(Sign target) {
        if (target.Isbroken()) {
            return;
        }
        this.cary_sign=true;
        target.brake();
        this.cary_sign=true;
    }
    @Override
    public void walk_away_with_friends() {
        System.out.print(getName());
        if (getMale()) {
            if (this.cary_sign){
                System.out.println(", унося на себе значительную часть адреса, побрёл вслед за друзьями");
            }
            else{System.out.println(" побрёл вслед за своими друзьями");}
        }
        else{
            if (this.cary_sign){
                System.out.println(", унося на себе значительную часть адреса, побрела вслед за друзьями");
            }
            else{System.out.println(" побрела вслед за своими друзьями");}
        }
    }
    @Override
    public String toString() {
        return ("Ослик по имени "+this.getName());
    }

}
