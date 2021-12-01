package main;

public class Owl extends characters implements owl_interface {
    public Owl() {
        super("Сова", "female");
        this.MOOD=moodenum.STRICT;
    }
    public Owl(String name) {
        super(name, "female");
        this.MOOD=moodenum.STRICT;
    }
    public Owl(String name, String gender) {
        super(name, gender);
        this.MOOD=moodenum.STRICT;
    }

    @Override
    public void cough(characters target) {
        System.out.print(this.getName());
        System.out.print(" ");
        System.out.print(this.getmood());
        System.out.print(" кашляет на ");
        System.out.println(target.getName());
    }

    @Override
    public void say_nothing() {
        System.out.print(this.getName());
        System.out.print(" ничего не сказал");
        if (this.getmale()) {
            System.out.println();
        } else {
            System.out.println("а");
        }

    }

    //    @Override
//    public void notice_smth(String smth) {
//        System.out.print(this.name);
//        System.out.print(" обнаруживает ");
//        System.out.println(smth);
//    }
    public void notice_smth(Sign smth) {
        System.out.print(this.name);
        System.out.print(" обнаруживает, что её адрес превратился в ");
        System.out.print("\"");
        System.out.print(smth.getName());
        System.out.println("\"");
    }

    @Override
    public String toString() {
        return ("Сова по имени "+this.getName());
    }
}
