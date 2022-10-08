package top.wisely.springbootmultitenantpartition;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.TenantId;

@Entity
@Data

public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @TenantId
    private String tenantId;
    private String name;
    private Integer age;

}
