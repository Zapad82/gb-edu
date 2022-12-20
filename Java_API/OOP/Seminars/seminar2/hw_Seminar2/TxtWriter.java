package OOP.Seminars.seminar2.hw_Seminar2;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TxtWriter extends Student {

    public TxtWriter(String nameForname, Float averageScore) {
        super(nameForname, averageScore);
    }

    @Override
    public String toString() {
        return "TxtWriter []";
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

}
