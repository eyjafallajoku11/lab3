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
    public boolean getMale() {
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
        return this.getClass().equals(other.getClass())
                && this.toString().equals(other.toString())
                && this.getMale() == other.getMale();
    }
    @Override
    public void change_mood(String mood){
        switch (mood) {
            case "строгая":
            case "строгий":
                this.MOOD = moodenum.STRICT;
                break;
            case "отрицание":
                this.MOOD = moodenum.DENY;
                break;
            case "веселый":
            case "весёлая":
                this.MOOD = moodenum.DENY;
                break;
        }
    }
    @Override
    public String getMood(){
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
