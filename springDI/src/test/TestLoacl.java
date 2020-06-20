import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import dio1.School;
import dio2.PerSon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestLoacl {

    @Resource
    private School school;


    @Resource
    private PerSon perSon;

    @Test
    public void test(){
        school.say();
    }

    @Test
    public void test01(){

        System.out.println(perSon.getName());

    }
}
