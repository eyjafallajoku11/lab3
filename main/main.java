package main;

public class main {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Owl owl = new Owl();
        Sign sign = new Sign(owl, "Совешник");
        donkey.brake_the_sign(sign);
        donkey.change_mood("отрицание");
        donkey.wave("передней ногой");
        owl.notice_sign(sign);
        owl.change_mood("строгая");
        owl.cough(donkey);
        owl.say_nothing();
        donkey.walk_away_with_friends();

    }
}