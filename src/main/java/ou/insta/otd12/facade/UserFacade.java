package ou.insta.otd12.facade;

import org.springframework.stereotype.Component;
import ou.insta.otd12.dto.UserDTO;
import ou.insta.otd12.entity.User;

@Component
public class UserFacade {
    public UserDTO userToUserDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstname(user.getName());
        userDTO.setLastname(user.getLastname());
        userDTO.setUsername(user.getUsername());
        userDTO.setBio(user.getBio());
        return userDTO;
    }
}