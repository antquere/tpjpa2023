package DAOimpl;

import DAO.SlotDao;
import Model.Slot;
import Model.Student;

import java.util.List;

public class SlotDAOimpl implements SlotDao {

    public SlotDAOimpl() {

    }

    @Override
    public Slot getById(List<Slot> ls, Long slotId) {
        for (Slot slot : ls) {
            if (slot.getId().equals(slotId)) {
                return slot;
            }
        }
        return null;
    }

    @Override
    public void insert(List<Slot> SlotList, Slot slot) { SlotList.add(slot); }

    @Override
    public void delete(List<Slot> SlotList, Slot slot) { SlotList.remove(slot); }
}
