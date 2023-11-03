package DAOimpl;

import DAO.ProfessionalDao;
import Model.Professional;
import Model.Slot;
import java.util.List;

public class ProfessionalDAOimpl implements ProfessionalDao {

    public ProfessionalDAOimpl() {

    }

    @Override
    public Professional getById(Long professionalId) { return null; }

    @Override
    public void insert(List<Professional> t1, Professional t2) {

    }

    @Override
    public void delete(List<Professional> t1, Professional t2) {

    }

    @Override
    public List<Slot> getAllSlots(Professional pro) { return pro.getSlotList(); }

    @Override
    public Professional createProfessional(Professional pro) {
        return pro;
    }

    @Override
    public void setNewSlots(Professional pro, List<Slot> newSlots) { pro.setSlotList(newSlots); }

    @Override
    public void setTimeStart(Slot slot, Long timeStart) { slot.setTimeStart(timeStart); }

    @Override
    public void setTimeEnd (Slot slot, Long timeEnd) { slot.setTimeEnd(timeEnd); }
}
