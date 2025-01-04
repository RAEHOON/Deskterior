package com.example.desk0014.Users;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.desk0014.R;

public class MiniMenuDialog extends Dialog {

    private Button btnShowTags;
    private Button btnEditPost;
    private Button btnDeletePost;

    public MiniMenuDialog(Context context, OnMiniMenuActionListener listener) {
        super(context);
        setContentView(R.layout.activity_mini_menu_dialog);

        // 버튼 연결
        btnShowTags = findViewById(R.id.btn_show_tags);
        btnEditPost = findViewById(R.id.btn_edit_post);
        btnDeletePost = findViewById(R.id.btn_delete_post);

        // 버튼 클릭 이벤트 설정
        btnShowTags.setOnClickListener(v -> {
            listener.onShowTags();
            dismiss();
        });

        btnEditPost.setOnClickListener(v -> {
            listener.onEditPost();
            dismiss();
        });

        btnDeletePost.setOnClickListener(v -> {
            listener.onDeletePost();
            dismiss();
        });
    }

    // MiniMenuDialog 버튼 클릭 이벤트 리스너
    public interface OnMiniMenuActionListener {
        void onShowTags();
        void onEditPost();
        void onDeletePost();
    }
}