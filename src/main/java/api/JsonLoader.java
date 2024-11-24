package api;

import java.io.IOException;
import java.nio.file.Paths;

import api.pojo.Store;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;


public class JsonLoader {
    public static Store loadStoreData(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(Paths.get(filePath).toFile(), Store.class);
    }
}
