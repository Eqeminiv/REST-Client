package client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {


        RestTemplate restTemplate = new RestTemplate();
        uuid myUUID = restTemplate.getForObject("http://localhost:8080/login", uuid.class);

        //HttpEntity<uuid> requestUUID = new HttpEntity<uuid>(myUUID);



        HttpEntity<Person> request = new HttpEntity<Person>(new Person("Stachu", "Lebiega", 2));

        restTemplate.postForObject("http://localhost:8080/addperson", request, Person.class);
        Person person = restTemplate.postForObject("http://localhost:8080/2/getperson", myUUID, Person.class);
        System.out.println(person.getFirstName());
    }
}
