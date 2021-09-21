package view;

import model.TipoDeAnimal;

import java.util.function.Consumer;

public interface TipoDeAnimalConsultaOwner {
    
    default void showTipoDeAnimalConsulta(Consumer<TipoDeAnimal> onCofirm){
        new TipoDeAnimalConsultaView(onCofirm).setVisible(true);
    }
    
}
