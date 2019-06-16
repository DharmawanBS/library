package bit5.team2.library.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Data
@Table(name = "USER_FOLLOW_TABLE")
public class UserFollow {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "USER_FOLLOW_REL_ID")
    private String userFollowRelId;

    @Column(name = "FOLLOWED_USER_ID")
    private String followedUserId;

    @NotEmpty
    @Column(name = "FOLLOWING_USER_ID")
    private String followingUserId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "FOLLOW_START_DATE")
    private Date followStartDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "FOLLOW_END_DATE")
    private Date followEndDate;
}
