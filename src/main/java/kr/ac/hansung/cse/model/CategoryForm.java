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

    @NotBlank(message = "카테고리 이름은 필수입니다")
    @Size(min = 2, max = 20, message = "2자 이상 20자 이하로 입력해주세요")
    private String name;

    public String getName() {
        return this.name;
    }

    public Category toEntity() {
        return new Category(this.name);
    }
}
