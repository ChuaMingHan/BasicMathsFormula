package sg.edu.rp.c346.basicmathsformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010265 on 07/17/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_content;
    int layout_id;
    ArrayList<SolutionItem> solutionItems;

    //TODO
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<TaskItems> objects) {
        super(context, resource, objects);
        parent_content = context;
        layout_id = resource;
        solutionItems = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_content.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvSolution = rowView.findViewById(R.id.textViewSolution);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);
        SolutionItem currentItem = solutionItems.get(position);
        String solution = currentItem.getSolution();
        String formula = currentItem.getFormula();
        String type = currentItem.getType();
        tvSolution.setText(solution);
        tvFormula.setText(formula);
        tvType.setText(type);
        return rowView;
    }
}

