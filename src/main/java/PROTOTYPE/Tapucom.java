package PROTOTYPE;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Data
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Tapucom {

    private String name;
}
