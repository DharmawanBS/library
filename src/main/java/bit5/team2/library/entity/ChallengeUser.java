package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "CHALLENGE_USER_TABLE")
public class ChallengeUser {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "CHALLENGE_USER_REL_ID")
    private String challengeUserRelId;

    @NotEmpty
    @Column(name = "CHALLENGE_ID")
    private String challengeId;

    @NotEmpty
    @Column(name = "USER_ID")
    private String userId;

    @NotEmpty
    @Column(name = "STATUS")
    @Size(max = 10)
    private String status;
}
