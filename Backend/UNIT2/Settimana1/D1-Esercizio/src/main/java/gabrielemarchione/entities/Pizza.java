package gabrielemarchione.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pizza extends Prodotto {
    private List<Toppings> ingredienti;

    public Pizza(String name, double price, double carlories, List<Toppings> ingredienti) {
        super(name, price, carlories);
        this.ingredienti = ingredienti;
    }

}
