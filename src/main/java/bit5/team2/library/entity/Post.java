package bit5.team2.library.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "POST_TABLE")
public class Post {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "POST_ID")
    private String postId;

    @NotEmpty
    @Size(max = 500)
    @Column(name = "POST_VALUE")
    private String postValue;

    @NotEmpty
    @Column(name = "USER_ID")
    private String userId;

    @NotEmpty
    @Size(max = 200)
    @Column(name = "PATH_FILE")
    private String pathFile;
}
