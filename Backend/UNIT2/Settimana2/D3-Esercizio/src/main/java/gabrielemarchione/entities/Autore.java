package gabrielemarchione.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "autori")
public class Autore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_autore;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate data_nascita;
    private String avatar;

    @OneToMany(mappedBy = "autore", cascade = CascadeType.REMOVE)
    @JsonBackReference
    private List<BlogPost> blogPostList;

    public Autore(String nome, String cognome, String email, LocalDate data_nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.data_nascita = data_nascita;
    }

}
