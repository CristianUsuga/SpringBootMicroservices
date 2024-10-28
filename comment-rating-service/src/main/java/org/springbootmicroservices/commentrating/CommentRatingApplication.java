package org.springbootmicroservices.commentrating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommentRatingApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommentRatingApplication.class, args);
    }
}
