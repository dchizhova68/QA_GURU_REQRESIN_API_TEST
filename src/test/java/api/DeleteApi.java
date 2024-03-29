package api;

import static io.restassured.RestAssured.given;
import static specs.Specs.deleteUserRequestSpec;
import static specs.Specs.deleteUserResponseSpec;

public class DeleteApi {
    public static void deleteUser(String userId) {

        given(deleteUserRequestSpec)
                .basePath("/api/users/" + userId)
                .when()
                .delete()
                .then()
                .spec(deleteUserResponseSpec);
    }
}
