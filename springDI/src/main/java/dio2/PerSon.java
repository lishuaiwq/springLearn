package dio2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

public class PerSon implements BeanNameAware {

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public void setBeanName(String s) {
        name = s;
    }

}
