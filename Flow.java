import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Flow implements Iterable<StudyGroup> {
    private List<StudyGroup> groups;

    public Flow() {
        groups = new ArrayList<>();
    }

    public void addGroup(StudyGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }
}
