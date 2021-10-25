package view;

import model.Raca;
import model.TipoDeAnimal;
import repository.EntityManagerProvider;
import repository.TipoDeAnimalRepository;

import javax.persistence.EntityManager;
import java.util.function.Consumer;

public interface RacaConsultaOwner {
    
    default void showRacaConsulta(Consumer<Raca> onCofirm){
        new RacaConsultaView(onCofirm).setVisible(true);
    }
    
}
