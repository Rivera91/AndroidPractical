//package backend;
//
//import model.CardDraw;
//import retrofit2.Call;
//import retrofit2.http.GET;
//import retrofit2.http.Path;
//import retrofit2.http.Query;
//
//public interface DrawCardService {
//    @GET("api/deck/{deck_id}/draw/?count={num_cards}")
//    Call<CardDraw> getDraw1(@Path("deck_id")String id, @Query("num_cards")int numCards);
//}
