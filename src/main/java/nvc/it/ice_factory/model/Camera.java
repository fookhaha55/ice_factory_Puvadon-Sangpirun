package nvc.it.ice_factory.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("cameras")
@Getter @Setter @NoArgsConstructor
public class Camera {
    @Id
    private String _id;
    private String name;
    private String location;

    private List<Event> event = new ArrayList<Event>();

    @CreatedDate
    //ใช้ได้เหมือนกัน//
    // @JsonFormat(pattern = "dd/MM/yyyy")
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;
}
