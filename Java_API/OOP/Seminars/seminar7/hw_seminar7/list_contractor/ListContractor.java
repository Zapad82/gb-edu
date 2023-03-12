package OOP.Seminars.seminar7.hw_seminar7.list_contractor;

import java.util.ArrayList;
import java.util.List;

import OOP.Seminars.seminar7.hw_seminar7.contractor.Contractor;

public class ListContractor extends AbstractListContractor<Contractor> {
    private List<Contractor> listContractors = new ArrayList<>();

    public List<Contractor> getlistContractors() {
        return listContractors;
    }

    public void addContractorInList(Contractor Contractor
    ) {
        listContractors.add(Contractor
        );
    }

    public void deleteContractor
    (Contractor Contractor
    ) {
        listContractors.remove(Contractor
        );
    }

    public void printlistContractors() {
        for (Contractor Contractor
         : listContractors) {
            System.out.println(Contractor
            );
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "listContractors [\n" + listContractors + "]";
    }

}
