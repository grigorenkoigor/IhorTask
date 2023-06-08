package reqres.api.services.SingleUserResponseModel.services;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SetupApiService {

    String baseUri = "https://reqres.in/";

    public RequestSpecification setup(){
        return RestAssured.given()
                .baseUri(baseUri)
                .contentType(ContentType.JSON)
                .filters(new RequestLoggingFilter(),
                        new ResponseLoggingFilter());

    }
}
