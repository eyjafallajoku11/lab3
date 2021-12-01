package main;

public class Owl extends characters implements owl_interface {
    public Owl() {
        super("Сова", "female");
    }
    public Owl(String name) {
        super(name, "female");
    }
    public Owl(String name, String gender) {
        super(name, gender);
    }

    @Override
    public void cough(characters target) {
        System.out.print(this.getName());
        System.out.print(" ");
        System.out.print(this.getMood());
        System.out.print(" кашляет на ");
        System.out.println(target.getName());
    }

    @Override
    public void say_nothing() {
        System.out.print(this.getName());
        System.out.print(" ничего не сказал");
        if (this.getMale()) {
            System.out.println();
        } else {
            System.out.println("а");
        }

    }
    public void notice_sign(Sign sign) {
        System.out.print(this.name);
        if (sign.Isbroken()){
            System.out.print(" обнаруживает, что её адрес превратился в ");
            System.out.print("\"");
            System.out.print(sign.getName());
            System.out.println("\"");
        }
        else {
            System.out.println(" ничего не обнаруживает");
        }
    }

    @Override
    public String toString() {
        return ("Сова по имени "+this.getName());
    }
}
