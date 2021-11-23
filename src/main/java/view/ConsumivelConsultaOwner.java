package view;

import model.Consumivel;

import java.util.function.Consumer;

public interface ConsumivelConsultaOwner {

    default void showConsumivelConsulta(Consumer<Consumivel> onCofirm) {
        new ConsumivelConsultaView(onCofirm).setVisible(true);
    }

}
