package DAOimpl;

import DAO.ProfessionalDao;
import Model.Professional;
import Model.Slot;
import Model.User;

import java.util.List;

public class ProfessionalDAOimpl implements ProfessionalDao {

    public ProfessionalDAOimpl() {

    }

    @Override
    public Professional getById(List<Professional> lp, Long professionalId) {
        for (Professional pro : lp) {
            if (pro.getId().equals(professionalId)) {
                return pro;
            }
        }
        return null;
    }

    @Override
    public void insert(List<Professional> lp, Professional p) { lp.add(p); }

    @Override
    public void delete(List<Professional> lp, Professional p) { lp.remove(p); }

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
