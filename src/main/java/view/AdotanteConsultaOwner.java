package view;

import model.Adotante;
import model.Raca;

import java.util.function.Consumer;

public interface AdotanteConsultaOwner {

    default void showAdotanteConsulta(Consumer<Adotante> onCofirm) {
        new AdotanteConsultaView(onCofirm).setVisible(true);
    }

}
