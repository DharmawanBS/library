package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "COMMENT_TABLE")
public class Comment {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "COMMENT_ID")
    private String commentId;

    @NotEmpty
    @Column(name = "POST_ID")
    private String postId;

    @NotEmpty
    @Column(name = "USER_ID")
    private String userId;

    @NotEmpty
    @Column(name = "COMMENT_VALUE")
    @Size(max = 500)
    private String commentValue;
}
