package view;

import model.Doador;

import java.util.function.Consumer;

public interface DoadorConsultaOwner {

    default void showDoadorConsulta(Consumer<Doador> onCofirm) {
        new DoadorConsultaView(onCofirm).setVisible(true);
    }

}
