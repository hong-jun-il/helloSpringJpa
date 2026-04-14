package kr.ac.hansung.cse.model;


import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // Spring MVC 폼 바인딩 필수: 기본 생성자가 있어야 합니다.
public class CategoryForm {
    private Long id;

    @NotBlank(message = "카테고리 이름을 입력하세요")
    @Size(max = 50, message = "50자 이내로 입력하세요")
    private String name;

    public Category toEntity() {
        return new Category(this.name);
    }
}
