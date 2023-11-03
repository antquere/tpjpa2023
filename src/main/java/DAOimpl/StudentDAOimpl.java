package DAOimpl;

import DAO.StudentDao;
import Model.Professional;
import Model.Rdv;
import Model.Slot;
import Model.Student;
import java.util.List;

public class StudentDAOimpl implements StudentDao {

    public StudentDAOimpl() {

    }

    @Override
    public Student getById(Long studentId) { return null; }

    @Override
    public void insert(List<Student> t1, Student t2) {

    }

    @Override
    public void delete(List<Student> t1, Student t2) {

    }

    public Student createStudent(Student stu) {
        return stu;
    }

    @Override
    public List<Rdv> getAllRdv(Student stu) { return stu.getRdvList(); }

    @Override
    public List<Slot> consultSlots(Professional pro) { return pro.getSlotList(); }

    @Override
    public boolean bookedSlot (Rdv rdv) {
        List<Slot> ls = rdv.getProfessional().getSlotList();
        for (Slot slot: ls) {
            Professional pro = slot.getProfessional();
            if (!slot.contain(rdv)) {
                continue;
            }
            if (slot.getTimeStart() < rdv.getTimeStart()) {
                pro.addSlot(new Slot(slot.getTimeStart(), rdv.getTimeStart(), pro));
            }
            if (slot.getTimeEnd() < rdv.getTimeEnd()) {
                pro.addSlot(new Slot(slot.getTimeEnd(), rdv.getTimeEnd(), pro));
            }
            pro.removeSlot(slot);
            return true;
        }
        return false;
    }
}
