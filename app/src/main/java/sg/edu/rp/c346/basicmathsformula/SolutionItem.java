package sg.edu.rp.c346.basicmathsformula;

import java.util.Calendar;

/**
 * Created by 17010265 on 07/17/2018.
 */

public class SolutionItem {

    private String solution;
    private String formula;
    private String type;

    public SolutionItem(String task, String formula, String type) {
        this.solution = solution;
        this.formula = formula;
        this.type = type;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SolutionItem{" +
                "solution='" + solution + '\'' +
                "formula='" + formula + '\'' +
                "type='" + type + '\'' +
                '}';
    }
}

