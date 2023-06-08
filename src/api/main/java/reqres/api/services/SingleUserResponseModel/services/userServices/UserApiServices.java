package reqres.api.services.SingleUserResponseModel.services.userServices;

import reqres.api.services.SingleUserResponseModel.models.singleUserModels.SingleUserResponseModel;
import reqres.api.services.SingleUserResponseModel.services.SetupApiService;

public class UserApiServices extends SetupApiService {

    public SingleUserResponseModel getSingleUser(int userId, int expectedStatusCode){
        SingleUserResponseModel response = setup()
                .given()
                .get("/api/users/" + userId)
                .then().statusCode(expectedStatusCode)
                .extract().as(SingleUserResponseModel.class);
            return response;
    }
}
