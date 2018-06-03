package backend;

import model.CardShuffle;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CardShuffleService {
    @GET("api/deck/new/shuffle")
    Call<CardShuffle> getShuffle1();
}
