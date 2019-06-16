package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "CHAT_ROOM_GROUP_USER_TABLE")
public class ChatRoomGroupUser {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "CHAT_ROOM_GROUP_USER_REL_ID")
    private String chatRoomGroupUserRelId;

    @NotEmpty
    @Column(name = "CHAT_ROOM_ID")
    private String chatRoomId;

    @NotEmpty
    @Column(name = "USER_ID")
    private String userId;

    @NotEmpty
    @Column(name = "USER_INITIATING_IND")
    @Size(max = 1)
    private String userInitiatingInd;

    @NotEmpty
    @Column(name = "GROUP_ID")
    private String groupId;
}
