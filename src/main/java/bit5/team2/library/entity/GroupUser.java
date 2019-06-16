package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@Table(name = "GROUP_USER_TABLE")
public class GroupUser {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "GROUP_USER_REL_ID")
    private String groupUserRelId;

    @NotEmpty
    @Column(name = "GROUP_ID")
    private String groupId;

    @NotEmpty
    @Column(name = "USER_ID")
    private String userId;

    @NotEmpty
    @Column(name = "USER_INITIATING_IND")
    private String userInitiatingInd;
}
