package demo.conf;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActivitiConfig {
  @Bean
  public ProcessEngineFactoryBean processEngineFactoryBean(SpringProcessEngineConfiguration spec){
    ProcessEngineFactoryBean pefbean = new ProcessEngineFactoryBean();
    pefbean.setProcessEngineConfiguration(spec);
    return pefbean;

  }

  @Bean
  public RepositoryService repositoryService(ProcessEngineFactoryBean pefb) throws Exception{
    return pefb.getObject().getRepositoryService();
  }

  @Bean
  public RuntimeService runtimeService(ProcessEngineFactoryBean pefb) throws Exception {
    return pefb.getObject().getRuntimeService();
  }

  @Bean
  public HistoryService historyService(ProcessEngineFactoryBean pefb) throws Exception {
    return pefb.getObject().getHistoryService();
  }

  @Bean
  public ManagementService managementService(ProcessEngineFactoryBean pefb) throws Exception {
    return pefb.getObject().getManagementService();
  }

  @Bean
  public IdentityService identityService(ProcessEngineFactoryBean pefb) throws Exception {
    return pefb.getObject().getIdentityService();
  }

  @Bean
  public FormService formService(ProcessEngineFactoryBean pefb) throws Exception {
    return pefb.getObject().getFormService();
  }

  @Bean
  public TaskService taskService(ProcessEngineFactoryBean pefb) throws Exception {
    return pefb.getObject().getTaskService();
  }
}
