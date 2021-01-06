package cn.beichenhpy.es.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author A51398
 * @version 1.0
 * @description TODO
 * @since 2021/1/6 10:23
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "books",type = "docs",shards = 1,replicas = 0)
public class Book {
    @Id
    private Integer id;
    private String name;
}
