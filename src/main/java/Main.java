import com.formdev.flatlaf.*;

import view.LoginView;

public class Main {

    public static void main(String[] args) {

        FlatIntelliJLaf.setup();
        LoginView login = new LoginView();
        login.setVisible(true);
    }
}
