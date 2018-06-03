package nyc.c4q.androidpractical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import backend.CardService;
import model.Cards;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private CardService cardService;
    private static final String TAG = "JSON?";
    private ImageView imageView;
    private Button shuffle;
    private String cardUrl;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = (ImageView) findViewById(R.id.images);
        shuffle = (Button) findViewById(R.id.shuffle);



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://deckofcardsapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        cardService = retrofit.create(CardService.class);


        shuffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Call<Cards> puppy = cardService.getCard1();
                puppy.enqueue(new Callback<Cards>() {

                    @Override
                    public void onResponse(Call<Cards> call, Response<Cards> response) {
                        Log.d(TAG, "onResponse: " + response.body().getSuccess());

                    }

                    @Override
                    public void onFailure(Call<Cards> call, Throwable t) {
                        Log.d(TAG, "onResponse: " + t.toString());

                    }


                });

                if (savedInstanceState != null) {
                    String savedCard = savedInstanceState.getString("cardUrl");
                    cardUrl = savedCard;
                    Picasso.with(getApplicationContext())
                            .load(savedCard)
                            .into(imageView);
                } else {

                    shuffle.callOnClick();
                }

            }

            @Override
            protected void onSaveInstanceState(Bundle outState) {
                shuffle.onSaveInstanceState();
                outState.putString("cardUrl", cardUrl);
            }

        }




    }
}
