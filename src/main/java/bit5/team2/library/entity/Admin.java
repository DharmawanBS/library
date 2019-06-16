package bit5.team2.library.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "ADMIN_TABLE")
public class Admin {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ADMIN_ID")
    private String adminId;

    @NotNull
    @Column(name = "ADMIN_CD")
    private Integer adminCode;

    @NotEmpty
    @Column(name = "ADMIN_USERNAME")
    @Size(max = 40)
    private String adminUsername;

    @NotEmpty
    @JsonIgnore
    @Column(name = "ADMIN_PASSWORD")
    private String adminPassword;

    @NotEmpty
    @Column(name = "CREATED_BY")
    private String createdBy;
}
