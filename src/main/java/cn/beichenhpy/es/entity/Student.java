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
 * @author beichenhpy
 * @version 1.0
 * @description TODO student实体类
 * @since 2021/1/6 10:20
 */
@Data
@Builder
/*
这里要有无参构造函数，不然无法反序列化
*/
@NoArgsConstructor
@AllArgsConstructor
/**
    indexName:索引名
    type:类型
    shards:分片(默认为5)
    replicas:备份(默认1，单节点要设置为0)
*/
@Document(indexName = "student",type = "docs",shards = 5,replicas = 0)
public class Student {
    @Id
    private Integer id;

     //anlyzer 分词设置为 ik_max_word
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String name;
    @Field(type = FieldType.Date)
    private String birthday;
    /**
      经纬度
     */
    private GeoPoint point;
    private List<Book> books;
}
