package bit5.team2.library.test;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class AdminInput {
    @NotNull
    private Integer adminCode;

    @NotEmpty
    @Size(max = 40)
    private String adminUsername;

    @NotEmpty
    @JsonIgnore
    private String adminPassword;

    @NotEmpty
    private String createdBy;
}
