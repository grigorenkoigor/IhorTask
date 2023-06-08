package reqres.api.services.SingleUserResponseModel.models.singleUserModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Support{

    @JsonProperty("text")
    private String text;

    @JsonProperty("url")
    private String url;
}