package sb.bootstrap.jms.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class MessageDto {

    private final long serialVersionUID = -5760610930420280913L;
    private UUID id;
    private String message;
}
    