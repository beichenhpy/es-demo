package cn.beichenhpy.es.controller;

import cn.beichenhpy.es.entity.Book;
import cn.beichenhpy.es.entity.Result;
import cn.beichenhpy.es.entity.Student;
import cn.beichenhpy.es.repo.ESSaveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author beichenhpy
 * @version 1.0
 * @description TODO 测试控制层
 * @since 2021/1/6 10:29
 */
@RestController
public class StudentController {
    @Autowired
    private ESSaveRepo esSaveRepo;
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;
    @GetMapping("/getAllIndex")
    public Result<?> getAllIndex(){
        return Result.ok(esSaveRepo.findAll());
    }
    @PostMapping("/addIndex")
    public Result<?> addIndex(){
        Book book1 = Book.builder().id(1).name("小明历险记1").build();
        Book book2 = Book.builder().id(2).name("小明历险记2").build();
        Book book3 = Book.builder().id(3).name("小明历险记3").build();
        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        Student student = Student.builder().id(1).birthday("2020-10-01").books(list).name("小明").point(new GeoPoint(51.500152D, -0.126236D)).build();
        esSaveRepo.save(student);
        return Result.ok(student);
    }
}
