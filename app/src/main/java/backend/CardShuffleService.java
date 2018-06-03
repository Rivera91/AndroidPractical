package backend;

import model.CardDraw;
import model.CardShuffle;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CardShuffleService {
    @GET("api/deck/new/shuffle")
    Call<CardShuffle> getShuffle1();

    @GET("api/deck/{deck_id}/draw/?count={num_cards}")
    Call<CardDraw> getDraw1(@Path("deck_id")String id, @Query("num_cards")int numCards);
}
