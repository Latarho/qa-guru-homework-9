import org.junit.jupiter.api.Test;
import org.codehaus.jackson.map.ObjectMapper;
import pojo.Person;

import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JsonParsingTests {
    private static final String JSON_FILE_PATH = "src/test/resources/files/json_for_tests.json";

    @Test
    void verifyJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(Paths.get(JSON_FILE_PATH).toFile(), Person.class);
        assertThat(person.id).isEqualTo("1241241");
        assertThat(person.name).isEqualTo("Serg");
    }
}