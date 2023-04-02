package com.coh.test;

import com.coh.dao.CupDao;
import com.coh.pojo.Cup;
import com.coh.service.CupService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AppTest {
    @Test
    public void add(){
        System.out.println("testing");
    }

    @Test
    public void annotationTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CupService cupService=(CupService) applicationContext.getBean("cupServiceImpl");
        cupService.save();
    }

    @Test
    public void SmTestDao(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 扫描包得到的cupDao（首字母小写）
        CupDao cupDao=(CupDao) applicationContext.getBean("cupDao");
        long i=cupDao.countByExample(null);
        System.out.println(i);
    }

    @Test
    public void SmTestService(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 扫描包得到的cupService（首字母小写）
        CupService cupService=(CupService) applicationContext.getBean("cupServiceImpl");
        List<Cup> cupList =cupService.findAll();
        System.out.println(cupList);
    }
}
