package com.alive.service;

import com.alive.ActivitiDemoApplication;
import com.alive.activiti.domain.HigherAudit;
import com.alive.activiti.domain.LeaveApply;
import com.alive.activiti.service.DemoService;
import net.minidev.json.JSONUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={ActivitiDemoApplication.class})// 指定启动类
public class DemoServiceTest {
    String instanceId = "d092af48-715a-11e9-967b-005056c00008";
    String taskId = "c98edc66-7161-11e9-a641-005056c00008";
    @Autowired
    private DemoService demoService;

    @Test
    public void testStart(){
        System.out.println("instanceId： " + demoService.start());
    }

    @Test
    public void testShowImg() throws IOException {
        demoService.showImg(instanceId);
    }

    @Test
    public void testApply() {
        demoService.apply(new LeaveApply(taskId,"12","12","病假"));
    }

    @Test
    public void testHigherAuditInfo() {
        Map<String, Object> map = demoService.higherAuditInfo(taskId);
        System.out.println("map： " + map.toString());
    }

    @Test
    public void testManagerAuditInfo() {
        Map<String, Object> map = demoService.managerAuditInfo(taskId);
        System.out.println("map： " + map.toString());
    }


    @Test
    public void testHigherAudit() {
        demoService.higherLevelAudit(new HigherAudit(taskId,true,"111"));
    }


    @Test
    public void testManagerAudit() {
        demoService.divisionManagerAudit(new HigherAudit(taskId,false,"111"));
    }
}
