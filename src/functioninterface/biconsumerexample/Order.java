package functioninterface.biconsumerexample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private Product product;
    private int quantity;
}