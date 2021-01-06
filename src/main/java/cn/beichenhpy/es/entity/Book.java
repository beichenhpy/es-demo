package cn.beichenhpy.es.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO book实体类
 * @since 2021/1/6 10:23
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "books",type = "docs",shards = 5,replicas = 0)
public class Book {
    @Id
    private Integer id;
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String name;
}
