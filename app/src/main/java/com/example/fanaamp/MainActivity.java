package com.example.fanaamp;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.FileProvider;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private ImageView like1, save1, comment1, share1;
    private ImageView like2, save2, comment2, share2;
    private ImageView like3, save3, comment3, share3;
    private ImageView like4, save4, comment4, share4;
    private int likeCount1 = 10; // Track like count for Post 1
    private int likeCount2 = 1000;
    private int likeCount3 = 20;
    private int likeCount4 = 17;

    private boolean isLiked1 = false;
    private boolean isLiked2 = false;
    private boolean isLiked3 = false;
    private boolean isLiked4 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Initialize UI elements
        like1 = findViewById(R.id.like1);
        save1 = findViewById(R.id.save1);
        comment1 = findViewById(R.id.comment1);
        share1 = findViewById(R.id.share1);

        like2 = findViewById(R.id.like2);
        save2 = findViewById(R.id.save2);
        comment2 = findViewById(R.id.comment2);
        share2 = findViewById(R.id.share2);

        like3 = findViewById(R.id.like3);
        save3 = findViewById(R.id.save3);
        comment3 = findViewById(R.id.comment3);
        share3 = findViewById(R.id.share3);

        like4 = findViewById(R.id.like4);
        save4 = findViewById(R.id.save4);
        comment4 = findViewById(R.id.comment4);
        share4 = findViewById(R.id.share4);



        // Set click listeners
        like1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLikeClick1(like1);
            }
        });
        like2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLikeClick2(like2);
            }
        });
        like3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLikeClick3(like3);
            }
        });
        like4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLikeClick4(like4);
            }
        });



        save1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSaveClick(save1);
            }
        });
        save2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSaveClick(save2);
            }
        });
        save3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSaveClick(save3);
            }
        });
        save4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSaveClick(save4);
            }
        });

        comment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCommentBar();
            }
        });
        comment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCommentBar();
            }
        });
        comment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCommentBar();
            }
        });
        comment4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCommentBar();
            }
        });

        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSharingOptions(1);
            }
        });
        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSharingOptions(2);
            }
        });
        share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSharingOptions(3);
            }
        });
        share4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSharingOptions(4);
            }
        });
    }


    // Handle like button click
    private void handleLikeClick1(ImageView likeButton) {
        if (!isLiked1) {
            // Change the image when the button is clicked
            likeButton.setImageResource(R.drawable.likeclicked);

            // Increment like count
            likeCount1++;
            // Update the like count in your UI or perform any other action
            Toast.makeText(this, "Liked! Like count: " + likeCount1, Toast.LENGTH_SHORT).show();
        } else {
            // Change the image back to the original state
            likeButton.setImageResource(R.drawable.like);

            // Decrement like count
            likeCount1--;
            // Update the like count in your UI or perform any other action
            Toast.makeText(this, "Unliked! Like count: " + likeCount1, Toast.LENGTH_SHORT).show();
        }

        // Toggle the like status
        isLiked1 = !isLiked1;
    }

    private void handleLikeClick2(ImageView likeButton) {
        if (!isLiked2) {
            // Change the image when the button is clicked
            likeButton.setImageResource(R.drawable.likeclicked);

            // Increment like count
            likeCount2++;
            // Update the like count in your UI or perform any other action
            Toast.makeText(this, "Liked! Like count: " + likeCount2, Toast.LENGTH_SHORT).show();
        } else {
            // Change the image back to the original state
            likeButton.setImageResource(R.drawable.like);

            // Decrement like count
            likeCount2--;
            // Update the like count in your UI or perform any other action
            Toast.makeText(this, "Unliked! Like count: " + likeCount2, Toast.LENGTH_SHORT).show();
        }

        // Toggle the like status
        isLiked2 = !isLiked2;
    }

    private void handleLikeClick3(ImageView likeButton) {
        if (!isLiked3) {
            // Change the image when the button is clicked
            likeButton.setImageResource(R.drawable.likeclicked);

            // Increment like count
            likeCount3++;
            // Update the like count in your UI or perform any other action
            Toast.makeText(this, "Liked! Like count: " + likeCount3, Toast.LENGTH_SHORT).show();
        } else {
            // Change the image back to the original state
            likeButton.setImageResource(R.drawable.like);

            // Decrement like count
            likeCount3--;
            // Update the like count in your UI or perform any other action
            Toast.makeText(this, "Unliked! Like count: " + likeCount3, Toast.LENGTH_SHORT).show();
        }

        // Toggle the like status
        isLiked3 = !isLiked3;
    }

    private void handleLikeClick4(ImageView likeButton) {
        if (!isLiked4) {
            // Change the image when the button is clicked
            likeButton.setImageResource(R.drawable.likeclicked);

            // Increment like count
            likeCount4++;
            // Update the like count in your UI or perform any other action
            Toast.makeText(this, "Liked! Like count: " + likeCount4, Toast.LENGTH_SHORT).show();
        } else {
            // Change the image back to the original state
            likeButton.setImageResource(R.drawable.like);

            // Decrement like count
            likeCount4--;
            // Update the like count in your UI or perform any other action
            Toast.makeText(this, "Unliked! Like count: " + likeCount4, Toast.LENGTH_SHORT).show();
        }

        // Toggle the like status
        isLiked4 = !isLiked4;
    }



    // Handle save button click
    private void handleSaveClick(ImageView saveButton) {
        // Change the image when the button is clicked
        saveButton.setImageResource(R.drawable.saveclicked);

        // Add your logic for handling the save action here
        Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show();
    }

    // Open the comment bar
    private void openCommentBar() {
        // Add your logic to open the comment bar
        Toast.makeText(this, "Open Comment Bar", Toast.LENGTH_SHORT).show();
    }

    // Open the sharing bar
    private int getCurrentPostImageResourceId(int postNumber) {
        switch (postNumber) {
            case 1:
                return R.drawable.post1;
            case 2:
                return R.drawable.post1; // Adjust as per your post images
            case 3:
                return R.drawable.post3;
            case 4:
                return R.drawable.post4;
            default:
                return R.drawable.logo; // Provide a default image resource
        }
    }



    // Open the sharing options
    // Open the sharing bar
    private void openSharingOptions(int currentPostNumber) {
        int currentPostImageResourceId = getCurrentPostImageResourceId(currentPostNumber);

        // Get the drawable resource
        Drawable drawable = getResources().getDrawable(currentPostImageResourceId);

        // Convert the drawable to a bitmap
        Bitmap bitmap = null;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        }

        // Share the image
        if (bitmap != null) {
            // Insert the bitmap into the MediaStore to get a content URI
            String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Image Description", null);
            Uri imageUri = Uri.parse(path);

            // Share the image and text
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("image/*");
            shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Look at this amazing Instagram post!");
            startActivity(Intent.createChooser(shareIntent, "Share using"));
        } else {
            Toast.makeText(this, "Unable to share image", Toast.LENGTH_SHORT).show();
        }
    }



}






