package Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
  private Long customerPK;
  private String customerId;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;

}
