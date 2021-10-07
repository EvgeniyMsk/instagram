package ou.insta.otd12.facade;

import org.springframework.stereotype.Component;
import ou.insta.otd12.dto.CommentDTO;
import ou.insta.otd12.entity.Comment;

@Component
public class CommentFacade {
    public CommentDTO commentToCommentDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(comment.getId());
        commentDTO.setUsername(comment.getUsername());
        commentDTO.setMessage(comment.getMessage());
        return commentDTO;
    }

}
