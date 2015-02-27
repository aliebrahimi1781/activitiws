package demo.activiti;

import demo.conf.ActivitiConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =ActivitiConfig.class)
public class RuntimeService {
  @Autowired
  private RuntimeService runtimeService;

//  @Test
//  @Deployment(resources = {"org/activiti/test/my-process.bpmn20.xml"})
//  public void test() {
//    ProcessInstance processInstance = activitiRule.getRuntimeService().startProcessInstanceByKey("my-process");
//    assertNotNull(processInstance);
//
//    Task task = activitiRule.getTaskService().createTaskQuery().singleResult();
//    assertEquals("Activiti is awesome!", task.getName());
//  }
}
