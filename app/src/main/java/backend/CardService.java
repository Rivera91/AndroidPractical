package backend;

import model.Cards;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CardService {
    @GET("api/deck/new/shuffle")
    Call<Cards> getCard1();
}
