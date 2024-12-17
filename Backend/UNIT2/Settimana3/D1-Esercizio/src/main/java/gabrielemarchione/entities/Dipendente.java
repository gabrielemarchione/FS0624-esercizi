package gabrielemarchione.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Setter(AccessLevel.NONE)
    private UUID id_dipendente;

    private String nome;
    private String cognome;
    private String email;
    private String password;
    private LocalDate data_nascita;
    private String url_avatar;

    @OneToMany(mappedBy = "dipendente", cascade = CascadeType.REMOVE)
    @JsonBackReference
    private List<Prenotazione> prenotazioni;

    public Dipendente(String nome, String cognome, String email, String password, LocalDate data_nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.data_nascita = data_nascita;

    }
}
