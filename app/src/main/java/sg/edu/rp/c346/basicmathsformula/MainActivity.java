package sg.edu.rp.c346.basicmathsformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvSolution;
    ArrayList<SolutionItem> alSolutionList;
    CustomAdapter caSolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.id.activity_main);

        lvSolution = findViewById(R.id.listViewSolutions);

        alSolutionList = new ArrayList<>();

        SolutionItem movie1 = new SolutionItem("Area of rectangle", "Length x Length", "Formula type is: Area");
        SolutionItem movie2 = new SolutionItem("Area of triangle", "(Length of base x Length)/2", "Formula type is: Area");
        SolutionItem movie3 = new SolutionItem("Volume of cube", "Length x Length x Length", "Formula type is: Volume");
        alSolutionList.add(movie1);
        alSolutionList.add(movie2);
        alSolutionList.add(movie3);


        caSolution = new CustomAdapter(this, R.layout.solution_item, lvSolution);

        lvSolution.setAdapter(caSolution);
    }
}
