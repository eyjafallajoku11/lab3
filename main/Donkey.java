package main;
public class Donkey extends characters implements donkey_interface{
    public boolean cary_smth = false;
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
        System.out.print(this.getmood());
        System.out.print(" помахал ");
        System.out.println(whichhand);
    }
    @Override
    public void braking_the_sign(Sign target) {
        if (!target.Isbroken()){
            this.cary_smth=true;
            target.brake();
            this.cary_smth=true;
        }
    }
    @Override
    public void walkingawaywithfriends() {
        System.out.print(getName());
        if (getmale()) {
            if (this.cary_smth){
                System.out.println(", унося на себе значительную часть адреса, побрёл вслед за друзьями");
            }
            else{System.out.println(" побрёл вслед за своими друзьями");}
        }
        else{
            if (this.cary_smth){
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
