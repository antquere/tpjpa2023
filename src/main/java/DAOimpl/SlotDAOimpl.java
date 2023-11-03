package DAOimpl;

import DAO.SlotDao;
import Model.Slot;
import java.util.List;

public class SlotDAOimpl implements SlotDao {

    public SlotDAOimpl() {

    }

    @Override
    public Slot getById(Long t) {
        return null;
    }

    @Override
    public void insert(List<Slot> SlotList, Slot slot) { SlotList.add(slot); }

    @Override
    public void delete(List<Slot> SlotList, Slot slot) { SlotList.remove(slot); }
}
