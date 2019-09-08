package yu.springqjt.feignInterFace;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eurekaclient")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}
