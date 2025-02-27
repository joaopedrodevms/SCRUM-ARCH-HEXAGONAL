package api.scrum.project.domain.ports.in.delete;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import api.scrum.project.domain.model.UserPublic;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeleteProjectResponseDTO {
    private UUID id;
    private String name;
    private String description;
    private Date dateFrom;
    private Date dateTo;
    private Integer sprintDuration;
    private Integer sprintAmmount;
    private List<UserPublic> users;
}
