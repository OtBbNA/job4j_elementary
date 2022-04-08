package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        if (indexOf(value, key) == -1) {
            throw new ElementNotFoundException("Wrong key word");
        }
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
            }
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        try {
            String[] rsl = {"Vasya", "Petya", "Misha", "Grisha"};
            indexOf(rsl, "Vasya");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
