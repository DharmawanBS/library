package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "CHAT_ROOM_TABLE")
public class ChatRoom {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "CHAT_ROOM_ID")
    private String chatRoomId;

    @NotEmpty
    @Column(name = "CHAT_ROOM_DESC")
    private String chatRoomDesc;

    @NotEmpty
    @Column(name = "CONTENT_LOG_PATH")
    private String contentLogPath;
}
