package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "NOTIFICATION_TABLE")
public class Notification {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "NOTIF_ID")
    private String notifId;

    @NotEmpty
    @Size(max = 500)
    @Column(name = "NOTIF_CONTENT")
    private String notifContent;

    @NotEmpty
    @Column(name = "ADMIN_ID")
    private String adminId;
}
