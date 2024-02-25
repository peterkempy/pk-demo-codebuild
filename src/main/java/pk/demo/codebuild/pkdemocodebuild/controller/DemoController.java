package pk.demo.codebuild.pkdemocodebuild.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pk.demo.codebuild.pkdemocodebuild.dto.DemoResponse;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/codebuilds")
public class DemoController {

    @GetMapping("/demos")
    public Mono<DemoResponse> getDemoById(@RequestParam(required = false) String arequest) {
        DemoResponse dr = new DemoResponse();
        dr.setSomeResponse("Demo response " + arequest);

        return Mono.just(dr);
    }
}
