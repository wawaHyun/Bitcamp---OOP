<<<<<<< HEAD
package model;
import lombok.*;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"korean"})

public class Subject {
    private int korean;
    private int english;
    private int math;

    @Builder(builderClassName = "builer")
    public Subject(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}
=======
package model;
import lombok.*;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"korean"})

public class Subject {
    private int korean;
    private int english;
    private int math;

    @Builder(builderClassName = "builer")
    public Subject(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}
>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
