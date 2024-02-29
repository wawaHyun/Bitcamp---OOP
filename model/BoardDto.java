package model;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BoardDto {
    private String title ;
    private String content;
    private String writer;

}
