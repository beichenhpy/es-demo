package cn.beichenhpy.es.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import java.util.List;

/**
 * @author A51398
 * @version 1.0
 * @description TODO
 * @since 2021/1/6 10:20
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "student",type = "docs",shards = 1,replicas = 0)
public class Student {
    @Id
    private Integer id;
    @Field(type = FieldType.Text)
    private String name;
    @Field(type = FieldType.Date)
    private String birthday;
    private GeoPoint point;
    private List<Book> books;
}
