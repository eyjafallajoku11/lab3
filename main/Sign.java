package main;

public class Sign {
    characters owner;
    String name;
    boolean broken=false;
    public Sign(characters owner){
        this.owner=owner;
        this.name="Совешник";
    }
    public Sign(characters owner, String name){
        this.name=name;
        this.owner=owner;
    }
    public Sign(characters owner, String name, boolean isbroken){
        this.name=name;
        this.owner=owner;
        broken=isbroken;
    }
    void brake() {
        this.broken=true;
        this.name="клякса";
    }
    String getName(){return this.name;}

    boolean Isbroken(){return broken;}

    public boolean equals(Sign other){
        return this.owner.equals(other.owner)
                && this.getName().equals(other.getName())
                && this.Isbroken() == other.Isbroken();
    }
    @Override
    public String toString(){
        return "знак с надписью "+getName();
    }
}
