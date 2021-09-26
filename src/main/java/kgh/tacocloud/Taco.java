package kgh.tacocloud;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
public class Taco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date createdAt;
    @NotNull
    @Size(min = 5, message = "5글자이상 입력하세요")
    private String name;

    @ManyToMany(targetEntity = Ingredient.class)
    @Size(min = 1, message = "1개이상 재료를 선택하셔야합니다.")
    private List<Ingredient> ingredients;

    @PrePersist

    void createAt(){
        this.createdAt = new Date();
    }
}
