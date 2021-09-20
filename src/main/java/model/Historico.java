package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String registro;
    private LocalDateTime dataTime;

    public Historico() {
    }

    public Historico(String registro, LocalDateTime dataTime) {
        this.registro = registro;
        this.dataTime = dataTime;
    }
}
