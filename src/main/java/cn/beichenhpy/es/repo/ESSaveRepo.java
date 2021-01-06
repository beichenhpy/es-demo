package cn.beichenhpy.es.repo;

import cn.beichenhpy.es.entity.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * @author A51398
 * @version 1.0
 * @description TODO
 * @since 2021/1/6 10:27
 */
public interface ESSaveRepo extends CrudRepository<Student,Integer> {

}
