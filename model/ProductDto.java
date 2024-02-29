package model;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProductDto {
    private int productNum;
    private String productName;
    private String company;
    private int productPrice;

}
