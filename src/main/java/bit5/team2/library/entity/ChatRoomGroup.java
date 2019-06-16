package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "CHAT_ROOM_GROUP_TABLE")
public class ChatRoomGroup {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "CHAT_ROOM_GROUP_ID")
    private String chatRoomGroupId;

    @NotEmpty
    @Column(name = "CHAT_ROOM_ID")
    private String chatRoomId;

    @NotEmpty
    @Column(name = "GROUP_ID")
    private String groupId;
}
