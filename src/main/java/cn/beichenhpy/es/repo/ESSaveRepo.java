package cn.beichenhpy.es.repo;

import cn.beichenhpy.es.entity.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO repo层 <entity,type(id)>
 * @since 2021/1/6 10:27
 */
public interface ESSaveRepo extends ElasticsearchRepository<Student,Integer> {

}
