package HWSeminar5.view;

import HWSeminar5.model.StudyGroup;
import java.util.List;


public class StudyGroupView {
    public void printListStudyGroups(List<StudyGroup> listStudyGroup) {
        System.out.println("All study group: ");
        for (StudyGroup studyGroup : listStudyGroup) {
            System.out.println(studyGroup);
        }
        System.out.println();
    }

    public void printAllGroupMembersId(List<Integer> idList) {
        System.out.println("All study group members ID : ");
        System.out.println("\tTeacher: " + idList.getFirst());
        for (int i = 1; i < idList.size(); i++) {
            System.out.println("\tStudent: " + idList.get(i));
        }
        System.out.println();
    }
}