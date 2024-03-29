package kr.co.gradesmanagement.model.domain;

import kr.co.gradesmanagement.model.dto.request.StudentReqDTO;
import kr.co.gradesmanagement.model.dto.response.StudentResDTO;
import lombok.*;

@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {

    private Long id;

    private String name;

    private Grade grade;

    private int year;

    @Builder
    private Student(Long id,
                    String name,
                    Grade grade,
                    int year) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.year = year;
    }

    public static Student toStudentEntity(StudentReqDTO.CREATE create) {
        return Student.builder()
                .name(create.getName())
                .grade(create.getGrade())
                .year(create.getYear())
                .build();
    }

    public StudentResDTO.READ toReadDto() {
        return StudentResDTO.READ.builder()
                .name(name)
                .grade(grade)
                .build();
    }
}
