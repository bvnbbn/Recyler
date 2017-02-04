package com.example.vikas.recycler;

/**
 * Created by vikas on 4/2/17.
 */

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;


public class BlankFragment1 extends Fragment {
    public static final String TAG = BlankFragment1.class
            .getSimpleName();
    private NetworkImageView mNetworkImageView;
    private ImageLoader mImageLoader;

    private ImageView imageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageLoader imageLoader = Controller.getInstance().getImageLoader();

        // If you are using normal ImageView
        final String url = " https://cdn.pixabay.com/photo/2015/04/22/12/02/butterfly-734654_960_720.jpg";

        imageLoader.get(url, new ImageLoader.ImageListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "Image Load Error: " + error.getMessage());
            }

            @Override
            public void onResponse(ImageLoader.ImageContainer response, boolean arg1) {
                if (response.getBitmap() != null) {
                    // load image into imageview
                    imageView.setImageBitmap(response.getBitmap());
                }
            }
        });
        //  setContentView(R.layout.photo);
        // mNetworkImageView = (NetworkImageView) findViewById(R.id.networkImageView);
        //  imageView=(ImageView)findViewById(R.id.imageView);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.photo, container, false);
        mNetworkImageView = (NetworkImageView) rootView.findViewById(R.id.networkImageView);
        imageView=(ImageView)rootView.findViewById(R.id.imageView);




        return rootView;
    }
}
   /* @Override
     void onStart() {
        super.onStart();
        ImageLoader imageLoader = Controller.getInstance().getImageLoader();

        // If you are using normal ImageView
        final String url=" https://cdn.pixabay.com/photo/2015/04/22/12/02/butterfly-734654_960_720.jpg";

        imageLoader.get(url, new ImageLoader.ImageListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "Image Load Error: " + error.getMessage());
            }

            @Override
            public void onResponse(ImageLoader.ImageContainer response, boolean arg1) {
                if (response.getBitmap() != null) {
                    // load image into imageview
                    imageView.setImageBitmap(response.getBitmap());
                }
            }
        });
    }
}*/