package nyc.c4q.androidpractical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import backend.CardShuffleService;
import model.CardShuffle;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private CardShuffleService cardShuffleService;
    private static final String TAG = "JSON?";
//    private ImageView imageView;
    private Button shuffle;
//    private String cardUrl;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://deckofcardsapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        cardShuffleService = retrofit.create(CardShuffleService.class);



        shuffle.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {

                                           Call<CardShuffle> cards = cardShuffleService.getShuffle1();
                                           cards.enqueue(new Callback<CardShuffle>() {


                                               @Override
                                               public void onResponse(Call<CardShuffle> call, Response<CardShuffle> response) {
                                                   Log.d(TAG, "onResponse: " + response.body().isShuffled());

                                               }

                                               @Override
                                               public void onFailure(Call<CardShuffle> call, Throwable t) {
                                                   Log.d(TAG, "onResponse: " + t.toString());

                                               }

                                           });
                                       }
                                   });
                shuffle.callOnClick();
    }
}




























//
//
//        imageView = (ImageView) findViewById(R.id.images);
//        shuffle = (Button) findViewById(R.id.shuffle);
//
//
//
//        Retrofit retrofit = new Retrofit.Builder()
//        .baseUrl("http://deckofcardsapi.com/")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build();
//
//
//        cardService = retrofit.create(CardShuffleService.class);
//
//
//        shuffle.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//                Call<CardShuffle> puppy = cardShuffleService.getCard1();
//                puppy.enqueue(new Callback<CardShuffle>() {
//
//                    @Override
//                    public void onResponse(Call<CardShuffle> call, Response<CardShuffle> response) {
//                        Log.d(TAG, "onResponse: " + response.body().getDeck_id());
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<CardShuffle> call, Throwable t) {
//                        Log.d(TAG, "onResponse: " + t.toString());
//
//                    }
//
//
//                });
//
//                if (savedInstanceState != null) {
//                    String savedCard = savedInstanceState.getString("cardUrl");
//                    cardUrl = savedCard;
//                    Picasso.with(getApplicationContext())
//                            .load(savedCard)
//                            .into(imageView);
//                } else {
//
//                    shuffle.callOnClick();
//                }
//
//            }
//
//            @Override
//            protected void onSaveInstanceState(Bundle outState) {
//                shuffle.onSaveInstanceState();
//                outState.putString("cardUrl", cardUrl);
//            }
//        }
//}


