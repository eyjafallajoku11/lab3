package main;

public abstract class characters implements character_interface {
    String name;
    boolean is_male;

    public characters(String name, String gender) {
        this.name = name;
        this.is_male= gender.equals("male");
    }
    public moodenum MOOD;
    @Override
    public boolean getmale() {
        return is_male;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void say_nothing() {
    }

    @Override
    public boolean equals(characters other){
        if (this.getClass().equals(other.getClass())
        && this.toString().equals(other.toString())
        && this.getmale()==other.getmale()) {
            return true;
        }
        else {return false;}
    }
    @Override
    public void walkingawaywithfriends() {
        System.out.print(getName());
        if (getmale()) {
            System.out.println(" побрёл вслед за друзьями");
        }
        else{
            System.out.println(" побрела вслед за друзьями");
        }
    }
    @Override
    public void changemood(String mood){
        if (mood.equals("строгая") || mood.equals("строгий")){this.MOOD=moodenum.STRICT;}
        else if (mood.equals("отрицание")){this.MOOD=moodenum.DENY;}
        else if (mood.equals("веселый") || mood.equals("весёлая")){this.MOOD=moodenum.DENY;}
    }
    @Override
    public String getmood(){
        if (this.MOOD==moodenum.DENY){
            return "отрицательно";
        }
        else if (this.MOOD==moodenum.STRICT){
            return "строго";
        }
        else if (this.MOOD==moodenum.HAPPY){
            return "весело";
        }
        else return "";
    }
}
