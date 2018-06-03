//package view;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.View;
//import android.widget.ImageView;
//
//import com.squareup.picasso.Picasso;
//
//import model.CardShuffle;
//import nyc.c4q.androidpractical.R;
//
//public class CardViewHolder extends RecyclerView.ViewHolder {
//
//    ImageView cardImage;
//
//    public CardViewHolder(View itemView) {
//        super(itemView);
//
//        cardImage = itemView.findViewById(R.id.cardItemV);
//    }
//
//    public void onBind(CardShuffle card, Context context) {
//        Picasso.with(context)
//                .load(card.getDeck_id())
//                .into(cardImage);
//        Log.d("imageUrl", card.getDeck_id());
//
//    }
//}




