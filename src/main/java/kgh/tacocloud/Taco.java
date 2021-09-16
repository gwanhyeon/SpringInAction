package kgh.tacocloud;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Setter
@Getter
public class Taco {

    @NotNull
    @Size(min = 5, message = "5글자이상 입력하세요")
    private String name;
    @Size(min = 1, message = "1개이상 재료를 선택하셔야합니다.")
    private List<String> ingredients;

}
