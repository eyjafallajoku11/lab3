package main;

public interface character_interface {
    void say_nothing();

    String getName();

    boolean getMale();

    boolean equals(characters other);

    void change_mood(String mood);

    String getMood();
}
