package gabrielemarchione.payloads;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class BlogPostPayload {
    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempo_lettura;

}
