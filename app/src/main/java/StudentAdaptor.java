import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.a1897022_mad314_assignment2.Main2Activity;
import com.example.a1897022_mad314_assignment2.R;

import java.util.ArrayList;
import java.util.List;

public class StudentAdaptor implements StudentAdapter {
    private LayoutInflater mInflater;
    private List<Student> mData = new ArrayList<>();

    public StudentAdaptor(Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.mData.addAll(StudentDataSource.getInstance().getStudents());

    }

    @NonNull
    @Override
    public Main2Activity onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.activity_main2, parent, false);

    }

    @Override
    public void onBindViewHolder(@NonNull Main2Activity holder, int position) {
        // get the animals
        List<Student> Students = (List<Student>) StudentDataSource.getInstance().getStudents();

        // set attributes to the item
        holder.tVname.setText(Student.get(position).name);
        holder.tVpwd.setText(Student.get(position).password);
        holder.tVid.setText(Student.get(position).sid);

    }

    @Override
    public int getItemCount() {
        return getInstance().getStudents().size();
    }

    private StudentDataSource getInstance() {
    }

    public void update() {
        mData.clear();
        mData.addAll(StudentDataSource.getInstance().getStudents());
        notifyDataSetChanged();
    }

    private void notifyDataSetChanged() {
    }
}
}
