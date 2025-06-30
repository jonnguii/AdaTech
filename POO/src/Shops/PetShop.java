package Shops;

import Animals.Animal;
import Animals.Dog;

public class PetShop {

    public void darBanho (Animal animal) {
        animal.setStateOfMind("Limpo");

    }

    public void tosar (Dog cachorro) {
        cachorro.setStateOfMind("Tosado");

    }

    public void deixarNoHotel (Animal animal) {
        animal.setStateOfMind("Saudades");

    }
}
