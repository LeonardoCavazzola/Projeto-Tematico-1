package view;

import model.Animal;
import model.Consumivel;

import java.util.function.Consumer;

public interface AnimalConsultaOwner {

    default void showAnimalConsulta(Consumer<Animal> onCofirm) {
        new AnimalConsultaView(onCofirm).setVisible(true);
    }

}
