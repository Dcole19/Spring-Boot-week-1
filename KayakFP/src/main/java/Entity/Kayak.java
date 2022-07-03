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

public class Kayak {
  private Long kayakPK;
  private String kayakId;
  private String kayakBrand;
  private String kayakName;
  private int width;
  private BigDecimal price;
}
