package ro.deiutzentertainment.common.session.datatypes.capsule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberMetadataInfoCapsule implements Serializable {

    public String id;
    public String name;
    public float top_speed;
    public float last_speed;
    public boolean isOnline;

}