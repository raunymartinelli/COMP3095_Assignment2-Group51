package ca.gbc.postservice;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;

public abstract class AbstractContainerBaseTest {
    static final MongoDBContainer MONGO_DB_CONTAINER;


    @DynamicPropertySource  //dynamically add properties into the environment variable
    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
        dynamicPropertyRegistry.add("spring.data.mongodb.uri",
                MONGO_DB_CONTAINER::getReplicaSetUrl);
    }

    static {
        MONGO_DB_CONTAINER = new MongoDBContainer("mongo:latest");
        MONGO_DB_CONTAINER.start();
    }
}
