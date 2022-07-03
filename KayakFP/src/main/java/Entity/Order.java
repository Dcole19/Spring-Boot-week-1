package Entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
  private Long orderPK;
  private Customers customer;
  private BigDecimal orderTotal;
  private BigDecimal quantity;
  
}
