
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