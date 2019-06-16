package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "USER_VERIF_HIST_TABLE")
public class UserVerifHist {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "VERIF_ID")
    private String verifId;

    @NotEmpty
    @Column(name = "USER_ID")
    private String userId;

    @NotEmpty
    @Column(name = "VERIF_PHONE_NUMBER")
    @Size(max = 1)
    private String verifPhoneNumber;

    @NotEmpty
    @Column(name = "VERIF_EMAIL")
    @Size(max = 1)
    private String verifEmail;

    @NotEmpty
    @Column(name = "STATUS")
    @Size(max = 20)
    private String status;
}
