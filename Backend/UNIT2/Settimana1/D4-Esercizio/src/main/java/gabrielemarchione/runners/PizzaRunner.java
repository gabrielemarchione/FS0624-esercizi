package gabrielemarchione.runners;

import gabrielemarchione.entities.Pizza;
import gabrielemarchione.entities.Toppings;
import gabrielemarchione.repositories.PizzaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
@Order(2)
public class PizzaRunner implements CommandLineRunner {
    private final ToppingsRunner toppingsRunner;
    @Autowired
    private PizzaRepository pr;

    public PizzaRunner(ToppingsRunner toppingsRunner) {
        this.toppingsRunner = toppingsRunner;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Toppings> toppings = toppingsRunner.getToppingsList();

        Pizza margherita = new Pizza("Margherita", 5.00, 300, Arrays.asList(toppings.get(0), toppings.get(4)));
        Pizza funghi = new Pizza("Pizza Funghi", 6.00, 350, Arrays.asList(toppings.get(0), toppings.get(1), toppings.get(4)));
        Pizza cipolla = new Pizza("Pizza Cipolla", 5.50, 320, Arrays.asList(toppings.get(0), toppings.get(2), toppings.get(4)));
        Pizza olive = new Pizza("Pizza Olive", 6.50, 360, Arrays.asList(toppings.get(0), toppings.get(3), toppings.get(4)));
        Pizza mista = new Pizza("Pizza Mista", 7.00, 400, Arrays.asList(toppings.get(0), toppings.get(1), toppings.get(2), toppings.get(3), toppings.get(4)));

        pr.save(margherita);
        pr.save(funghi);
        pr.save(cipolla);
        pr.save(olive);
        pr.save(mista);

    }
}