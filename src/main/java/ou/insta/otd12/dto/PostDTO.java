package ou.insta.otd12.dto;

import lombok.Data;

import java.util.Set;

@Data
public class PostDTO {

    private Long id;
    private String title;
    private String caption;
    private String location;
    private Integer likes;
    private String username;
    private Set<String> usersLiked;
}
