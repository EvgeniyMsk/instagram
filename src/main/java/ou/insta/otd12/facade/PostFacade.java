package ou.insta.otd12.facade;

import org.springframework.stereotype.Component;
import ou.insta.otd12.dto.PostDTO;
import ou.insta.otd12.entity.Post;

@Component
public class PostFacade {
    public PostDTO posToPostDTO(Post post) {
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setUsername(post.getUser().getUsername());
        postDTO.setCaption(post.getCaption());
        postDTO.setLikes(post.getLikes());
        postDTO.setUsersLiked(post.getLikedUsers());
        postDTO.setLocation(post.getLocation());
        postDTO.setTitle(post.getTitle());
        return postDTO;
    }
}
