package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-04T16:05:03.095817700+02:00[Africa/Harare]")

@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:/api}")
public class TransactionsApiController implements TransactionsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransactionsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
