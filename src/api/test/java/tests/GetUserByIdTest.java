package tests;

import org.testng.annotations.Test;
import reqres.api.services.SingleUserResponseModel.services.userServices.UserApiServices;

public class GetUserByIdTest {

    @Test
    public void getUserById(){
        UserApiServices userApiServices = new UserApiServices();

        userApiServices.getSingleUser(2, 200);
    }

    @Test
    public void getUserByUnexistingId(){
        UserApiServices userApiServices = new UserApiServices();

        userApiServices.getSingleUser(1000, 404);
    }
}
