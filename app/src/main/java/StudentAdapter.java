import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.a1897022_mad314_assignment2.Main2Activity;

interface StudentAdapter {
    @NonNull
    Main2Activity onCreateViewHolder(@NonNull ViewGroup parent, int viewType);

    void onBindViewHolder(@NonNull Main2Activity holder, int position);

    int getItemCount();
}
