package hello;

import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiOperation;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getperson")
public class DemoController {

    //@RequestMapping(value = "/{name}", method= RequestMethod.GET, produces = "application/json")
    @RequestMapping(method= RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Get a person by name", response = Person.class)
    List<Person> getPerson() {
        List<Person> result;
        //LOGGER.log(Level.INFO, "Getting all climbers");
        result = new ArrayList();
        Data data=new Data();
        Person person = new Person(data.getAge(),data.getSex(),data.getName());
        result.add(person);
        return result;
    }


}
