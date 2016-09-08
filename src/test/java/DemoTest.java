import javax.annotation.Resource;  
  
import org.apache.log4j.Logger;  
import org.junit.Test;  
import org.junit.runner.RunWith; 
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thirteen.Demo.service.IUserService;
import com.alibaba.fastjson.JSON;
import com.thirteen.Demo.pojo.User;
/**********************************************************************
*@椤圭洰鍚嶇О: TSS
*@鏂囦欢鍚嶇О: DemoTest.java
*@Author: Leonardo
*@Date: 2016骞�9鏈�7鏃�
*@Copyright: 2016 www.fengpiaosan.com Inc. All rights reserved.
***********************************************************************/
@RunWith(SpringJUnit4ClassRunner.class)     //琛ㄧず缁ф壙浜哠pringJUnit4ClassRunner绫�  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 

public class DemoTest {
	private static Logger logger = Logger.getLogger(DemoTest.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private IUserService userService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {
    	System.out.println("璋冭瘯寮�濮�");
    	try {
    		User user = userService.getUserById(1);
    		logger.info(JSON.toJSONString(user)); 
		} finally {
			System.out.println("璋冭瘯缁撴潫");
		}
        // System.out.println(user.getUserName());  
        // logger.info("鍊硷細"+user.getUserName());
    }
}
