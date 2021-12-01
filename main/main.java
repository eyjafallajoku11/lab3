package main;

public class main {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        Owl owl = new Owl();
        Sign sign = new Sign(owl, "Совешник");
        donkey.braking_the_sign(sign);
        donkey.changemood("отрицание");
        donkey.wave("передней ногой");
        owl.notice_smth(sign);
        owl.changemood("строгая");
        owl.cough(donkey);
        owl.say_nothing();
        donkey.walkingawaywithfriends();

    }
}