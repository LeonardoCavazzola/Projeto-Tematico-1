package view;

import model.Usuario;

import java.util.function.Consumer;

public interface UsuarioConsultaOwner {
    
    default void showUsuarioConsulta(Consumer<Usuario> onCofirm){
        new UsuarioConsultaView(onCofirm).setVisible(true);
    }
    
}
