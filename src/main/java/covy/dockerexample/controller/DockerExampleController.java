package covy.dockerexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerExampleController {

  @GetMapping("/")
  public String exampleDocker() {
    return "Hello World!";
  }

}
