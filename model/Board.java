<<<<<<< HEAD
package model;
import lombok.*;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"title"})
public class Board {
    private String title ;
    private String content;
    private String writer;
    @Builder(builderClassName =  "builer")
    public Board(String title,String content,String writer){
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

}
=======
package model;
import lombok.*;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"title"})
public class Board {
    private String title ;
    private String content;
    private String writer;
    @Builder(builderClassName =  "builer")
    public Board(String title,String content,String writer){
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

}
>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
